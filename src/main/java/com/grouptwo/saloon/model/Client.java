package com.grouptwo.saloon.model;

public class Client {

    private int clientID
    private String clientName
    private String clientEmail
    private int phoneNumber

    @java.lang.Override
    public java.lang.String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Client client = (Client) object;
        return clientID == client.clientID &&
                phoneNumber == client.phoneNumber &&
                java.util.Objects.equals(clientName, client.clientName) &&
                java.util.Objects.equals(clientEmail, client.clientEmail);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), clientID, clientName, clientEmail, phoneNumber);
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

    }
}