package com.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Janusz on 2015-12-12.
 */
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column
    private int userId;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
