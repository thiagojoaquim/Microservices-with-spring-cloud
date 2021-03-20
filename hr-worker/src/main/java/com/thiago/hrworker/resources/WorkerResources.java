package com.thiago.hrworker.resources;

import com.thiago.hrworker.entities.Worker;
import com.thiago.hrworker.repositories.WorkerRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

    @Autowired
    private WorkerRepository repository;

    @GetMapping(path = "/find")
    public ResponseEntity<List<Worker>> findAll() {
        var list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Worker> find(@PathVariable Long id) {
        var response = repository.findById(id);
        if (response.isPresent()) {
            return ResponseEntity.ok(response.get());
        }
        return ResponseEntity.notFound().build();
    }
}
