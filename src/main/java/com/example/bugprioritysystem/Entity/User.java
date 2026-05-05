package com.example.bugprioritysystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    
    @ManyToOne
    @JoinColumn(name="usertype_id")
    private UserType userType;
}
