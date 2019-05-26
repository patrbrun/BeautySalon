package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Payment;

public interface PaymentDao {
    Iterable<Payment> listPayments();

    void deletePayment(Integer paymentId);

    Payment getPaymentById(Integer paymentId);

    Payment save(Payment payment);
}
