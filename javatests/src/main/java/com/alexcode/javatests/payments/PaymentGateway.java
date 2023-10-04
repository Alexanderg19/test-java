package com.alexcode.javatests.payments;

public interface PaymentGateway {

    PaymentResponse RequestPayment(PaymentRequest request);
}
