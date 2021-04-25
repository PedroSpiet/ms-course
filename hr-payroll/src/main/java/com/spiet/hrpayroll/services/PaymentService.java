package com.spiet.hrpayroll.services;

import com.spiet.hrpayroll.entities.Payment;
import com.spiet.hrpayroll.entities.Worker;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/{id}", Worker.class,
                uriVariables);

        return Payment.builder().name(worker.getName()).dailyIncome(worker.getDailyIncome()).days(days).build();
    }
}
