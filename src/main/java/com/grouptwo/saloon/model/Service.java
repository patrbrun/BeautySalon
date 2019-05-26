package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    public Service() {
    }

    public Service(String serviceName, double price, Date discount, Date datePaid) {
        this.serviceName = serviceName;
        this.price = price;
        this.discount = discount;
        this.datePaid = datePaid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return servicesId == service.servicesId &&
                Double.compare(service.price, price) == 0 &&
                Objects.equals(serviceName, service.serviceName) &&
                Objects.equals(discount, service.discount) &&
                Objects.equals(datePaid, service.datePaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicesId, serviceName, price, discount, datePaid);
    }

    @Override
    public String toString() {
        return "Services{" +
                "servicesId=" + servicesId +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", datePaid=" + datePaid +
                '}';
    }

}
