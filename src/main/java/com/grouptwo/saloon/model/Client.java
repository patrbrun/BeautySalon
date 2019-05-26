package com.grouptwo.saloon.model;

import java.util.Objects;

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

    public Client() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientID == client.clientID &&
                phoneNumber.equals(client.phoneNumber) &&
                Objects.equals(clientName, client.clientName) &&
                Objects.equals(clientEmail, client.clientEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, clientName, clientEmail, phoneNumber);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}