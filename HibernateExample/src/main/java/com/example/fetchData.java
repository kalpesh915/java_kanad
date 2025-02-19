package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchData {
    public static void main(String[] args) {
        try{
            SessionFactory factory = new Configuration()
                    .configure()
                    .addAnnotatedClass(com.example.Student.class)
                    .buildSessionFactory();

            Session session = factory.openSession();

            //Student s1 = session.get(Student.class, 1);
            //Student s1 = session.find(Student.class, 1);
            //Student s1 = session. byId(Student.class).load(1);
            Student s1 = session.byId(Student.class).getReference(1);
            //System.out.println(s1);

            session.close();
            factory.close();

        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
