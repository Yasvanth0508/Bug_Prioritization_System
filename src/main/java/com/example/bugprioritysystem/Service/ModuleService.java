package com.example.bugprioritysystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugprioritysystem.Repository.ModuleRepository;
import com.example.bugprioritysystem.Entity.Module;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;
    
    public Module createModule(Module module) {
        return moduleRepository.save(module);
    }

    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }

    public Module deleteModule(Long id) {
        Module module = moduleRepository.findById(id).orElseThrow(() -> new RuntimeException("Module not found"));
        moduleRepository.delete(module);
        return module;
    }

    public Module getModuleById(Long id) {
        return moduleRepository.findById(id).orElseThrow(() -> new RuntimeException("Module not found"));
    }
}
