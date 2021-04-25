package com.spiet.hrpayroll.services;

import com.spiet.hrpayroll.entities.Payment;
import com.spiet.hrpayroll.entities.Worker;
import com.spiet.hrpayroll.feignClients.WorkerFeignClient;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();

        return Payment.builder().name(worker.getName()).dailyIncome(worker.getDailyIncome()).days(days).build();
    }
}
