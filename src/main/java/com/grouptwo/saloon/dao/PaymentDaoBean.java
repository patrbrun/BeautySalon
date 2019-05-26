package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Payment;
import com.grouptwo.saloon.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDaoBean implements PaymentDao {
    private PaymentRepository paymentRepository;

    @Autowired
    public void setPaymentRepository(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Iterable<Payment> listPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.deleteById(paymentId);
    }

    @Override
    public Payment getPaymentById(Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
