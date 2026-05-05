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

import com.example.bugprioritysystem.Service.ModuleService;
import com.example.bugprioritysystem.Entity.Module;

@RestController
@RequestMapping("api/module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    @PostMapping
    public Module createModule(@RequestBody Module module) {
        return moduleService.createModule(module);
    }

    @GetMapping("/{id}")
    public Module getModuleById(@PathVariable Long id) {
        return moduleService.getModuleById(id);
    }

    @GetMapping
    public List<Module> getAllModules() {
        return moduleService.getAllModules();
    }

    @DeleteMapping("/{id}")
    public Module deleteModule(@PathVariable Long id) {
        return moduleService.deleteModule(id);
    }

}
