package com.grouptwo.saloon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String job_title;
    private String phone_num;

    protected Employee() {}

    public Employee(String name, String job_title, String phone_num) {
        this.name = name;
        this.job_title = job_title;
        this.phone_num = phone_num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob_title(String job_title) { this.job_title = job_title; }

    public String getJob_title() { return job_title; }

    public void setPhone_num() { this.phone_num = phone_num; }

    public String getPhone_num() { return phone_num; }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%d, name='%s', job_title='%s', phone_number='%s']",
                id, name, job_title, phone_num);
    }
}
