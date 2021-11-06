package com.first.firstapp.controller;

import com.first.firstapp.controller.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/health")
    public ResponseEntity greeting() {
        Response response = new Response();
        response.setStatus("OK");
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
