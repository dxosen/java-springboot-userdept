package com.dxosen.userdept.controllers;

import com.dxosen.userdept.entities.User;
import com.dxosen.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){

        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){

        return repository.findById(id).get();
    }


    @PostMapping
    public User insert(@RequestBody User user){

        return repository.save(user);
    }

}
