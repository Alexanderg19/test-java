package com.alexcode.javatests.payments;

public class PaymentResponse {

    public enum PaymentStatus {
        OK, ERRROR
    }

    private PaymentStatus paymentStatus;

    public PaymentResponse(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
