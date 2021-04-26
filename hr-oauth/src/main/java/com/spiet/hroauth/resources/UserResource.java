package com.spiet.hroauth.resources;

import com.netflix.discovery.converters.Auto;
import com.spiet.hroauth.entities.User;
import com.spiet.hroauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    UserService service;

    @GetMapping(value = "/users/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
       try {
           User user = service.findByEmail(email);
           return ResponseEntity.ok().body(user);
       } catch (IllegalArgumentException e) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
    }
}
