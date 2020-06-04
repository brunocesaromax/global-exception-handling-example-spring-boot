package com.example.GlobalExceptionHandling.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Object o){
        return ResponseEntity.ok().build();
    }
}
