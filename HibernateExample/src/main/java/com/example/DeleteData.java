package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        try{
            SessionFactory factory = new Configuration()
                    .configure()
                    .addAnnotatedClass(com.example.Student.class)
                    .buildSessionFactory();

            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();

            Student s1 = session.find(Student.class, 2);
            System.out.println(s1);
            session.remove(s1);

            transaction.commit();
            session.close();
            factory.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
