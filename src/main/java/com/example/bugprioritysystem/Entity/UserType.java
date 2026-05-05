package com.example.bugprioritysystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserType {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private String description;
    private String priorityLevel;
}
