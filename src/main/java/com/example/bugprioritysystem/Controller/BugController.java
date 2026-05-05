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

import com.example.bugprioritysystem.Entity.Bug;
import com.example.bugprioritysystem.Service.BugService;

@RestController
@RequestMapping("api/bug")
public class BugController {
    @Autowired
    private BugService bugService;

    @PostMapping
    public Bug createBug(@RequestBody Bug bug) {
        return bugService.createBug(bug);
    }

    @GetMapping
    public List<Bug> getAllBugs() {
        return bugService.getAllBugs();
    }

    @GetMapping("/{id}")
    public Bug getBugById(@PathVariable Long id) {
        return bugService.getBugById(id);
    }

    @DeleteMapping("/{id}")
    public Bug deleteBug(@PathVariable Long id) {
        return bugService.deleteBug(id);
    }

    @GetMapping("/severity/{severity}")
    public List<Bug> getBugsBySeverity(@PathVariable String severity) {
        return bugService.getBugsBySeverity(severity);
    }

    @GetMapping("/priority/{priorityLevel}")
    public List<Bug> getBugsByUserPriorityLevel(@PathVariable String priorityLevel) {
        return bugService.getBugsByUserPriorityLevel(priorityLevel);
    }
}
