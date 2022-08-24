package com.spring.practice.springAOP.advicesWithPointcut.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(0)
public class LoggingAspect {
    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class.getName());


    @Before("pointCut2()")
    public void beforeMethodCall(JoinPoint jointPoint)
    {
        Object[] methodargs = jointPoint.getArgs();
        LOGGER.info(" beforeMethodCall method name : "+jointPoint.getSignature().getName()+
                "method args : "+methodargs);
    }
    @After("pointCut2()")
    public void afterMethodCall(JoinPoint jointPoint)
    {
        Object[] methodargs = jointPoint.getArgs();
        LOGGER.info("afterMethodCall method name : "+jointPoint.getSignature().getName()+
                "method args : "+methodargs);
    }

    @Around("pointCut1()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodArgs = proceedingJoinPoint.getArgs();
        LOGGER.info("aroundMethod Input to Method: " + methodName + " with agrs: " + methodArgs[0]);
        Object result = proceedingJoinPoint.proceed();
        LOGGER.info("Method :" + methodName + " returns " + result);
        return result;
    }

    @AfterReturning(pointcut = "pointCut1()",returning = "val" )
    public void returningNoException(JoinPoint joinPoint,Object val)
    {
        LOGGER.info(" returningNoException Method Name "+ joinPoint.getSignature().getName() + " return value:"+ val);
    }

    @AfterThrowing(pointcut = "pointCut1()",throwing = "exception")
    public void afterException(Exception exception)
    {
        LOGGER.info("afterException Exception caught:"+ exception.getMessage());
    }
    /**
     * Match all methods within a class in another package
     */

    @Pointcut("execution(* StudentDAOImpl.*(..))")
    public void pointCut1()
    {

    }
    @Pointcut("execution(public * com.spring.practice.springAOP.dao.StudentDAOImpl.*(..))")
    public void pointCut2()
    {

    }
    @Pointcut("execution(public Student com.spring.practice.springAOP.dao.StudentDAOImpl.*(..))")
    public void pointCut3()
    {

    }
    @Pointcut("execution(public Student com.spring.practice.springAOP.dao.StudentDAOImpl.*(Integer,..))")
    public void pointCut4()
    {

    }
    @Pointcut("within(com.spring.practice.springAOP.dao.*)")
    public void pointCut5()
    {

    }
    @Pointcut("within(com.spring.practice.springAOP.dao..*)")
    public void pointCut6()
    {

    }
    @Pointcut("bean(*DAOImpl)")
    public void pointCut7()
    {

    }
    @Pointcut("bean(*Manager) && bean(*DAO)")
    public void pointCut8()
    {

    }


}
