package com.spring.practice.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.jdbc");
   //     JdbcTemplate jdbcObj = context.getBean("jdbcTemplate",JdbcTemplate.class);
        ContactDAO contactDAO = context.getBean("contactDAO", ContactDAO.class);

     //   Contact contact = new Contact("Manika","manika@gmail.com","Jsr","8906443543");
    //    contactDAO.insertData(contact);
      //  contact.setAddress("Jamshedpur");
     //   contact.setId(1);
      //  contactDAO.updateData(contact);

     //   Contact contact2 = new Contact("Rita","rita@gmail.com","Jsr","8906443543");
    //    contactDAO.insertData(contact2);

        Contact contact= new Contact();
        contact.setAddress("Jamshedpur");
        contact.setId(1);
       contactDAO.updateData(contact);
        List<Contact> result = contactDAO.selectAllData();
        for(Contact res:result)
        {
            System.out.println("Contact Id : "+ res.getId());
        }

       System.out.println(contactDAO.selectsingleData(3).getId());

    }
}
