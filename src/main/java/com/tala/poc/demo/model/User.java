package com.tala.poc.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "user")
public class User {
    private int user_id;
    private String name;
    private int age;
    private double salary;
    private double loan_amount;


    public User(int user_id, String name, int age, double salary, double loan_amount) {
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.loan_amount = loan_amount;
    }

    @Column(name = "salary", nullable = false)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "loan_amount", nullable = false)
    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User() {
    }
}
