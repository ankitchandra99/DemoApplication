package com.acciojob.demo;

public class User {

    private int userId;
    private String name;

    private int age ;

    private String country;

    private String emailId;

    private String mobNo;

    public User() {
    }
    public User(int userId, String name, int age, String country, String emailId, String mobNo) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.country = country;
        this.emailId = emailId;
        this.mobNo = mobNo;
    }

    public void setUserid(int id) {
        this.userId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobNo() {
        return mobNo;
    }
}
