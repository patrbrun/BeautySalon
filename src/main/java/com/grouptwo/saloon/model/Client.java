package com.grouptwo.saloon.model;
import javax.persistence.Entity;

@Entity
public class Client {

    private int clientID;
    private String clientName;
    private String clientEmail;
    private int phoneNumber;

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Constructor

    public Client(int clientID, String clientName, String clientEmail, int phoneNumber) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
    }
}