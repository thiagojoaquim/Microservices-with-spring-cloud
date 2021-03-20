package com.thiago.hrpayroll.repositories.impl;

import com.thiago.hrpayroll.entities.Worker;
import com.thiago.hrpayroll.feignclients.WorkerFeignClient;
import com.thiago.hrpayroll.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkerRepositoryImpl implements WorkerRepository {

    @Autowired
    private WorkerFeignClient workerClient;

    @Override
    public List<Worker> findAll() {
        var response = workerClient.findAll();
        if(response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody();
        }
        throw new RuntimeException("Erro na requisição");
    }

    @Override
    public Worker findById(Long id) {
        var response = workerClient.find(id);
        if(response.getStatusCode().equals(HttpStatus.OK)){
            return response.getBody();
        }
        throw new RuntimeException("Erro na requisição");
    }
}
