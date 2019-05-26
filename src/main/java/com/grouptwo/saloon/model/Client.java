package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Client {
   @Id
   @GeneratedValue(generator = "client_generator", strategy = GenerationType.IDENTITY)

   @ApiModelProperty(notes = "Client Id")
    private int clientID;

    @ApiModelProperty(notes = "Client Name")
    private String clientName;

    @ApiModelProperty(notes = "Client Email")
    private String clientEmail;

    @ApiModelProperty(notes = "Phone Number")
    private String phoneNumber;

    @ApiModelProperty(notes = "client")
    @OneToOne(cascade = CascadeType.ALL)
  /*  @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "client")*/
    private Appointment appointment;

    public Client() {
    }

    public Client(String clientName, String clientEmail, String phoneNumber, Appointment appointment) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.appointment = appointment;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
