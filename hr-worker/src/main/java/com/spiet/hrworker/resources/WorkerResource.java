package com.spiet.hrworker.resources;

import com.spiet.hrworker.entities.Worker;
import com.spiet.hrworker.repositories.WorkerRepository;
import org.hibernate.jdbc.Work;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository repo;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repo.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        logger.info("PORT: " + env.getProperty("local.server.port"));
        Worker worker = repo.findById(id).get();
        return ResponseEntity.ok().body(worker);
    }
}
