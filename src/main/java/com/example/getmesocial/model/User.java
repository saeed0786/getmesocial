package com.example.getmesocial.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String Id;
    private String name;
    private String address;
    private int age;
    public User(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getId() { return Id; }

    public void setId(String id) { Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
