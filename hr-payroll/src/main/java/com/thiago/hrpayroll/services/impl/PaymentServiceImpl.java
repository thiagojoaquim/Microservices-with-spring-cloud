package com.thiago.hrpayroll.services.impl;

import com.thiago.hrpayroll.entities.Payment;
import com.thiago.hrpayroll.entities.Worker;
import com.thiago.hrpayroll.repositories.WorkerRepository;
import com.thiago.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private WorkerRepository repository;

    @Override
    public Payment getPayment(long workerId, int days) {

        var worker = repository.findById(workerId);
        return new Payment(worker.getName(),worker.getDailyIncome(), days);
    }
}
