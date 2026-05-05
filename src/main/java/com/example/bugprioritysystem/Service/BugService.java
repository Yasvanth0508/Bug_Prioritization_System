package com.example.bugprioritysystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugprioritysystem.Entity.Bug;
import com.example.bugprioritysystem.Repository.BugRepository;

@Service
public class BugService {
    @Autowired
    private BugRepository bugRepository;

    public Bug createBug(Bug bug) {
        return bugRepository.save(bug);
    }

    public Bug getBugById(Long id) {
        return bugRepository.findById(id).orElseThrow(() -> new RuntimeException("Bug not found"));
    }

    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    public Bug deleteBug(Long id) {
        Bug bug = bugRepository.findById(id).orElseThrow(() -> new RuntimeException("Bug not found"));
        bugRepository.delete(bug);
        return bug;
    }

    public List<Bug> getBugsBySeverity(String severity) {
        return bugRepository.findBySeverity(severity);
    }

    public List<Bug> getBugsByUserPriorityLevel(String priorityLevel) {
        return bugRepository.findByUserUserTypePriorityLevel(priorityLevel);
    }
}
