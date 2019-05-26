package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Service {
    @Id
    @GeneratedValue(generator = "services_generator", strategy = GenerationType.IDENTITY)

    @ApiModelProperty(notes = "Services Id")
    private int servicesId;

    @ApiModelProperty(notes = "Service Name")
    private String serviceName;

    @ApiModelProperty(notes = "Price")
    private double price;

    @ApiModelProperty(notes = "Date of Discount")
    private Date discount;

    @ApiModelProperty(notes = "Date paid")
    private Date datePaid;

    @ApiModelProperty(notes = "payment id")
    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    @ManyToOne
    private Appointment appointment;

    public Service() {
    }

    public Service(String serviceName, double price, Date discount, Date datePaid, Payment payment) {
        this.serviceName = serviceName;
        this.price = price;
        this.discount = discount;
        this.datePaid = datePaid;
        this.payment = payment;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDiscount() {
        return discount;
    }

    public void setDiscount(Date discount) {
        this.discount = discount;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
