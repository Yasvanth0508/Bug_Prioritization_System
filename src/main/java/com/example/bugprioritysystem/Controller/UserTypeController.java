package com.example.bugprioritysystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bugprioritysystem.Entity.UserType;
import com.example.bugprioritysystem.Service.UserTypeService;

@RestController
@RequestMapping("api/usertype")
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @PostMapping
    public UserType createUserType(@RequestBody UserType userType) {
        return userTypeService.createUserType(userType);
    }

    @GetMapping
    public List<UserType> getAllUserTypes() {
        return userTypeService.getAllUserTypes();
    }

    @GetMapping("/{id}")
    public UserType getUserTypeById(@PathVariable Long id) {
        return userTypeService.getUserTypeById(id);
    }

    @DeleteMapping("/{id}")
    public UserType deleteUserType(@PathVariable Long id) {
        return userTypeService.deleteUserType(id);
    }
}
