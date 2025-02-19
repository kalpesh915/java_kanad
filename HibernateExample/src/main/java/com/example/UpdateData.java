package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(com.example.Student.class)
                .buildSessionFactory()){

            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();

            Student s1 = new Student(5, "Kamalesh", "Joshi", "Rajkot", "9900990099", "kamal@gmail.com");
            //session.merge(s1);
            session.merge("Student", s1);

            transaction.commit();
            session.close();
            //factory.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
