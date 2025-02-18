package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Kanad", "Joshi", "Rajkot", "9900990099", "Kanad@gmail.com");

        try{
            Configuration configuration = new Configuration();
            configuration.configure();
            configuration.addAnnotatedClass(com.example.Student.class);
            SessionFactory factory = configuration.buildSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();

            session.persist(s1);

            transaction.commit();
            session.close();
            factory.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }

    }
}