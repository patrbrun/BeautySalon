package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "user_generator", strategy = GenerationType.IDENTITY)

    @ApiModelProperty(notes = "User Id")
    private int userId;

    @ApiModelProperty(notes = "User Name")
    private String userName;

    @ApiModelProperty(notes = "Password")
    private String password;

    @ApiModelProperty(notes = "Email")
    private String email;

    @ApiModelProperty(notes = "Phone Number")
    private String phoneNumber;

    @ApiModelProperty(notes = "User Type")
    private String userType;

    @ApiModelProperty(notes = "user")
    @OneToOne(cascade = CascadeType.ALL)
   /* @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user")*/
    private Appointment appointment;


    public User() {
    }

    public User(String userName, String password, String email, String phoneNumber, String userType, Appointment appointment) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.appointment = appointment;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

}
