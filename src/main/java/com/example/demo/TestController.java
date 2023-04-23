package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/success")
    public ResponseEntity<HttpStatus> success() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/fail")
    public String fail() {
        return "Fail";
    }
}
