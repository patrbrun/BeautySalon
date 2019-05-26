package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Payment {
    @Id
    @GeneratedValue(generator = "payment_generator", strategy = GenerationType.IDENTITY)

    @ApiModelProperty(notes = "Payment Id")
    private int paymentID;

    @ApiModelProperty(notes = "Mode of Payment")
    private String modeOfPayment;

    @ApiModelProperty(notes = "Amount Due")
    private double amountDue;

    @ApiModelProperty(notes = "Discount")
    private double discount;

    @ApiModelProperty(notes = "Amount Paid")
    private double amountPaid;

    @ApiModelProperty(notes = "Balance")
    private double balance;

    @ApiModelProperty(notes = "payment")
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "payment")
    private Service service;

    public Payment() {
    }

    public Payment(String modeOfPayment, double amountDue, double discount, double amountPaid, double balance) {
        this.modeOfPayment = modeOfPayment;
        this.amountDue = amountDue;
        this.discount = discount;
        this.amountPaid = amountPaid;
        this.balance = balance;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentID == payment.paymentID &&
                Double.compare(payment.amountDue, amountDue) == 0 &&
                Double.compare(payment.discount, discount) == 0 &&
                Double.compare(payment.amountPaid, amountPaid) == 0 &&
                Double.compare(payment.balance, balance) == 0 &&
                Objects.equals(modeOfPayment, payment.modeOfPayment) &&
                Objects.equals(service, payment.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID, modeOfPayment, amountDue, discount, amountPaid, balance, service);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", amountDue=" + amountDue +
                ", discount=" + discount +
                ", amountPaid=" + amountPaid +
                ", balance=" + balance +
                ", service=" + service +
                '}';
    }
}

