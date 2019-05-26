package com.grouptwo.saloon.api;


import com.grouptwo.saloon.dao.PaymentDao;
import com.grouptwo.saloon.model.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
@Api(value = "saloon payment")
public class PaymentController {
    private PaymentDao paymentDao;

    @Autowired
    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @ApiOperation(value = "List of all appointments", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Payments retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Payment is absent")
    })

    @GetMapping("/list")
    public Iterable<Payment> getAllPayment(Model model) {
        return paymentDao.listPayments();
    }

    @ApiOperation(value = "Search Payment using ID", response = Payment.class)
    @GetMapping("/search/{paymentId}")
    public Payment searchPayment(@PathVariable Integer paymentId, Model model) {
        return paymentDao.getPaymentById(paymentId);
    }

    @ApiOperation(value = "Save Payment")
    @PostMapping("/save")
    public ResponseEntity<String> savePayment(@RequestBody Payment payment, Model model) {
        paymentDao.save(payment);
        return new ResponseEntity<>("Payment saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update payment")
    @PutMapping(value = "/update/{paymentId}")
    public ResponseEntity<String> updatePayment(@PathVariable Integer paymentId, @RequestBody Payment payment) {
        Payment paymentDetails = paymentDao.getPaymentById(paymentId);
        paymentDetails.setAmountDue(payment.getAmountDue());
        paymentDetails.setAmountPaid(payment.getAmountPaid());
        paymentDetails.setBalance(payment.getBalance());
        paymentDetails.setDiscount(payment.getDiscount());
        paymentDetails.setModeOfPayment(payment.getModeOfPayment());
        return new ResponseEntity<>("Appointment updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete payment")
    @DeleteMapping("/delete/{paymentId}")
    public ResponseEntity<String> deletePayment(@PathVariable Integer paymentId, Model model) {
        paymentDao.deletePayment(paymentId);
        return new ResponseEntity<>("Payment deleted successfully", HttpStatus.OK);
    }
}
