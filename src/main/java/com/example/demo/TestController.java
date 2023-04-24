package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private final UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/success")
    public ResponseEntity<HttpStatus> success() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/fail")
    public String fail() {
        return "Fail";
    }

    @PostMapping("/createUser/{id}/{pw}")
    public ResponseEntity<User> createUser(@PathVariable String id, @PathVariable String pw) {
        User user = new User(id, pw);
        User save = userRepository.save(user);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        User user = userRepository.findById(id).orElseThrow(null);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user/")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> all = userRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
