package com.grouptwo.saloon.model;

import java.util.Objects;

public class Payment {

    private int paymentID;
    private String modeOfPayment;
    private double amountDue;
    private double discount;
    private double amountPaid;
    private double balance;

    public Payment() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentID == payment.paymentID &&
                amountDue == payment.amountDue &&
                discount == payment.discount &&
                amountPaid == payment.amountPaid &&
                balance == payment.balance &&
                Objects.equals(modeOfPayment, payment.modeOfPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID, modeOfPayment, amountDue, discount, amountPaid, balance);
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
                '}';
    }
}

