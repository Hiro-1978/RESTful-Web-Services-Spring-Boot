package com.hiro11.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user was colled";
    }

    @PostMapping
    public String createUser(){
        return "create user was colled";
    }

    @PutMapping
    public String updateUser(){
        return "update user was colled";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was colled";
    }
}
