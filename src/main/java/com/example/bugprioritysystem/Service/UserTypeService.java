package com.example.bugprioritysystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugprioritysystem.Entity.UserType;
import com.example.bugprioritysystem.Repository.UserTypeRepository;

@Service
public class UserTypeService {
    @Autowired
    private UserTypeRepository userTypeRepository;

    public UserType createUserType(UserType userType) {
        return userTypeRepository.save(userType);
    }

    public List<UserType> getAllUserTypes() {
        return userTypeRepository.findAll();
    }

    public UserType getUserTypeById(Long id) {
        return userTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("User type not found"));
    }

    public UserType deleteUserType(Long id) {
        UserType userType = userTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("User type not found"));
        userTypeRepository.delete(userType);
        return userType;
    }
}
