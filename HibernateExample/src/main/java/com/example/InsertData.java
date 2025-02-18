package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {
    public static void main(String[] args) {
        try{
            SessionFactory factory = new Configuration()
                    .configure()
                    .addAnnotatedClass(com.example.Student.class)
                    .buildSessionFactory();

            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(new Student(3, "Kanad", "Joshi", "Rajkot", "9900990099", "kanad@gmil.com"));
            transaction.commit();
            session.close();
            factory.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
