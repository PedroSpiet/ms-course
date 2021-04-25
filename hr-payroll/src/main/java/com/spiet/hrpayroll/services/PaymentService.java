package com.spiet.hrpayroll.services;

import com.spiet.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return Payment.builder().name("Bob").dailyIncome(200.0).days(days).build();
    }
}
