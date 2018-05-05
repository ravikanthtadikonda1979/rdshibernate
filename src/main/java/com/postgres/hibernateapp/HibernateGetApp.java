package com.postgres.hibernateapp;

import com.postgres.hibernate.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateGetApp {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Account.class).
                buildSessionFactory();


        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List myAccount= session.createQuery("from Account").list();
        System.out.println(myAccount);
        session.getTransaction().commit();

    }
}
