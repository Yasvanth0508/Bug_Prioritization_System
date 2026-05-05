package com.example.bugprioritysystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long id;
    private String moduleName;
    private String moduleDescription;
    private String moduleType;
}