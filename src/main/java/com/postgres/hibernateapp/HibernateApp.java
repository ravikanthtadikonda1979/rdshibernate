package com.postgres.hibernateapp;

import com.postgres.hibernate.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class HibernateApp {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Account.class).
                buildSessionFactory();


        Session session = factory.getCurrentSession();


        Account account = new Account(666,
                "subbarao",
                "Dimpu$9036",
                "subbarao.x.tadikona@gmail.com",
                Timestamp.valueOf(LocalDateTime.now()),
                Timestamp.valueOf(LocalDateTime.now()));

        //begin transaction
        session.beginTransaction();

        session.save(account);
        session.getTransaction().commit();


    }
}
