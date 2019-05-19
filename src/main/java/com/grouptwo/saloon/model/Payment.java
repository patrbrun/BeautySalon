package com.grouptwo.saloon.model;
import javax.persistence.Entity;

@Entity
public class Payment {

    private int paymentID;
    private String modeOfPayment;
    private int amountDue;
    private int discount;
    private int amountPaid;
    private int balance;

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", amountDue=" + amountDue +
                ", discount=" + discount +
                ", amountPaid=" + amountPaid +
                ", balance=" + balance +
                '}';
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

    public int getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(int amountDue) {
        this.amountDue = amountDue;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Constructor
    public Payment(int paymentID, String modeOfPayment, int amountDue, int discount, int amountPaid, int balance) {
        this.paymentID = paymentID;
        this.modeOfPayment = modeOfPayment;
        this.amountDue = amountDue;
        this.discount = discount;
        this.amountPaid = amountPaid;
        this.balance = balance;
    }
}

