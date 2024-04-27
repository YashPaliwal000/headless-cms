package com.headless.cms.controller;

import com.headless.cms.model.AuthenticationRequest;
import com.headless.cms.model.AuthenticationResponse;
import com.headless.cms.model.RegisterRequest;
import com.headless.cms.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final AuthenticationService authenticationService;

    @GetMapping("/hello")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }


}
