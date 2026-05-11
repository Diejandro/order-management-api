package com.diego.mi_primer_api.controllers;

import com.diego.mi_primer_api.entities.User;
import com.diego.mi_primer_api.services.UserService;
import com.diego.mi_primer_api.utils.ValidationUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/register")
    public ResponseEntity<?> create(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return ValidationUtils.validationError(bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }


}
