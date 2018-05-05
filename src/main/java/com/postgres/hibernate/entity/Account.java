package com.postgres.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String emailId;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "last_login")
    private Timestamp lastLogin;

    public Account() {

    }

    public Account(int userId, String userName, String password, String emailId, Timestamp createdOn, Timestamp lastLogin) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", emailId='" + emailId + '\'' +
                ", createdOn=" + createdOn +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
