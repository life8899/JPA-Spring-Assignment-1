/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author W205951620
 */
public class TestJPA {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"jdbcTemplateConfig.xml"});
        
        StudentDao dao = (StudentDao) context.getBean("studentDao");
        
       
        Students student = new Students();
        student.setFirstname("Goodman");
        student.setLastname("John");
        student.setAge(25);
        
        try{
         
            dao.persist(student);
       
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
