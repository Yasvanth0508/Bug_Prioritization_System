package com.example.bugprioritysystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Bug {
    @Id
    @GeneratedValue
    private Long id;

    private String log;
    private String bugDescription;
    private String severity;
    
    @ManyToOne
    @JoinColumn(name="module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
