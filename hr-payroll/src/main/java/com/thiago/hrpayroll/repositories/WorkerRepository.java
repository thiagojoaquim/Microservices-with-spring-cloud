package com.thiago.hrpayroll.repositories;

import com.thiago.hrpayroll.entities.Worker;

import java.util.List;

public interface WorkerRepository {

    List<Worker> findAll();
    Worker findById(Long id);
}
