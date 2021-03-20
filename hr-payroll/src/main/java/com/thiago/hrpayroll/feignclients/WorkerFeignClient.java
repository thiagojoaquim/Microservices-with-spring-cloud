package com.thiago.hrpayroll.feignclients;

import com.thiago.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {
    @GetMapping(path = "/find")
    ResponseEntity<List<Worker>> findAll();

    @GetMapping(path = "/find/{id}")
    ResponseEntity<Worker> find(@PathVariable Long id);
}
