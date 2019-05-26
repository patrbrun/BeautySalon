package com.grouptwo.saloon.model;

import java.util.Date;
import java.util.Objects;

@Entity
public class Services {

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

    public Service() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service services = (Service) o;
        return servicesId == services.servicesId &&
                price == services.price &&
                discount == services.discount &&
                datePaid == services.datePaid &&
                Objects.equals(serviceName, services.serviceName);
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
