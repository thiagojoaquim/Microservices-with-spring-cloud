package com.thiago.hrpayroll.services;

import com.thiago.hrpayroll.entities.Payment;

public interface PaymentService {

    Payment getPayment(long workerId, int days);
}
