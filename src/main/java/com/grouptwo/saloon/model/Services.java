package com.grouptwo.saloon.model;

public class Services {

    private int servicesID;
    private String serviceName;
    private int price;
    private int discount;
    private int datePaid;
    int paymentID; // FK

    @Override
    public String toString() {
        return "Services{" +
                "servicesID=" + servicesID +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", datePaid=" + datePaid +
                ", paymentID=" + paymentID +
                '}';
    }

    public int getServicesID() {
        return servicesID;
    }

    public void setServicesID(int servicesID) {
        this.servicesID = servicesID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(int datePaid) {
        this.datePaid = datePaid;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    // Constructor

    public Services(int servicesID, String serviceName, int price, int discount, int datePaid, int paymentID) {
        this.servicesID = servicesID;
        this.serviceName = serviceName;
        this.price = price;
        this.discount = discount;
        this.datePaid = datePaid;
        this.paymentID = paymentID;
    }
}
