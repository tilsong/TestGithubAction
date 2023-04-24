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
//
//    @Autowired
//    private final UserRepository userRepository;
//
//    public TestController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @GetMapping("/success")
    public ResponseEntity<HttpStatus> success() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // mysql -h jdbc:mysql://awsmysql.c8cckyp9vob1.us-east-1.rds.amazonaws.com:3306 -u admin -P 3306 -p 1q2w3e4r
    @GetMapping("/fail")
    public String fail() {
        return "Fail";
    }
//
//    @GetMapping("/createUser/{id}/{pw}")
//    public ResponseEntity<User> createUser(@PathVariable String id, @PathVariable String pw) {
//        User user = new User(id, pw);
//        User save = userRepository.save(user);
//        return new ResponseEntity<>(save, HttpStatus.OK);
//    }
//
//    @GetMapping("/user/{id}")
//    public ResponseEntity<User> getUser(@PathVariable String id) {
//        User user = userRepository.findById(id).orElseThrow(null);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
//    @GetMapping("/userAll")
//    public ResponseEntity<List<User>> getAllUser() {
//        List<User> all = userRepository.findAll();
//        return new ResponseEntity<>(all, HttpStatus.OK);
//    }
}
