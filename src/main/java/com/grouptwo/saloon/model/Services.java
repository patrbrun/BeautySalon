package com.grouptwo.saloon.model;

public class Services {

    private int servicesId
    private String serviceName
    private int price
    private int discount
    private int datePaid
    int paymentID // FK

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Services services = (Services) object;
        return servicesId == services.servicesId &&
                price == services.price &&
                discount == services.discount &&
                datePaid == services.datePaid &&
                paymentID == services.paymentID &&
                java.util.Objects.equals(serviceName, services.serviceName);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), servicesId, serviceName, price, discount, datePaid, paymentID);
    }


    public int getServicesId() {
        return servicesId;
    }

    public void setServicesId(int servicesId) {
        this.servicesId = servicesId;
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
}
}
