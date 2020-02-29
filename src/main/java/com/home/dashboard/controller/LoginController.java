package com.home.dashboard.controller;

import com.home.dashboard.domain.User;
import com.home.dashboard.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")

public class LoginController {
    @Autowired
    LoginService loginService;
    public LoginController() {
    }

    @PutMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        System.out.println("Enterd");
        String response= loginService.saveUser(user.getUsername(), user.getPassword());

        return new ResponseEntity<>(response, HttpStatus.OK );
    }
}
