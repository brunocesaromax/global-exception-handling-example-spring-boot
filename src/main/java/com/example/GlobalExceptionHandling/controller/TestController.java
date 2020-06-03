package com.example.GlobalExceptionHandling.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }
}
