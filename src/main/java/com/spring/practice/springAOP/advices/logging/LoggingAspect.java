package com.spring.practice.springAOP.advices.logging;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class.getName());

    @Before("execution(* com.spring.practice.springAOP.dao.StudentDAOImpl.getStudent(..))")
    public void beforeMethodCall(JoinPoint jointPoint)
    {
        Object[] methodargs = jointPoint.getArgs();
        LOGGER.info(" beforeMethodCall method name : "+jointPoint.getSignature().getName()+
                "method args : "+methodargs);
    }
    @After("execution(* com.spring.practice.springAOP.dao.StudentDAOImpl.getStudent(..))")
    public void afterMethodCall(JoinPoint jointPoint)
    {
        Object[] methodargs = jointPoint.getArgs();
        LOGGER.info("afterMethodCall method name : "+jointPoint.getSignature().getName()+
                "method args : "+methodargs);
    }

    @Around("execution(* com.spring.practice.springAOP.dao.StudentDAOImpl.getStudent(..))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodArgs = proceedingJoinPoint.getArgs();
        LOGGER.info("aroundMethod Input to Method: " + methodName + " with agrs: " + methodArgs[0]);
        Object result = proceedingJoinPoint.proceed();
        LOGGER.info("Method :" + methodName + " returns " + result);
        return result;
    }

    @AfterReturning(pointcut = "execution(* com.spring.practice.springAOP.dao.*.*(..))",returning = "val" )
    public void returningNoException(JoinPoint joinPoint,Object val)
    {
        LOGGER.info(" returningNoException Method Name "+ joinPoint.getSignature().getName() + " return value:"+ val);
    }

    @AfterThrowing(pointcut = "execution(* com.spring.practice.springAOP.dao.*.*(..))",throwing = "exception")
    public void afterException(Exception exception)
    {
        LOGGER.info("afterException Exception caught:"+ exception.getMessage());
    }


}
