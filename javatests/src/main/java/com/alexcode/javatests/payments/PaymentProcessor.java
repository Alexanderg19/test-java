package com.alexcode.javatests.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {

        PaymentResponse paymentResponse = paymentGateway.RequestPayment(new PaymentRequest(amount));
        if (paymentResponse.getPaymentStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else  {
            return false;
        }
    }
}
