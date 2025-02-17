package com.example.sendingsrvice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class SendingController {
    @GetMapping("/sending")
    public ResponseEntity<String> sending(){
        return ResponseEntity.ok("sending service api");
    }
}
