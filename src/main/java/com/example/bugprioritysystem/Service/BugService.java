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

    private int getSeverityScore(String severity) {

        return switch (severity.toUpperCase()) {
            case "HIGH" -> 3;
            case "MEDIUM" -> 2;
            case "LOW" -> 1;
            default -> 0;
        };
    }

    private int getUserPriorityScore(String role) {

        return switch (role.toUpperCase()) {

            case "ADMIN" -> 5;

            case "MANAGER" -> 4;

            case "DEVELOPER" -> 3;

            case "TESTER" -> 2;

            case "ENDUSER" -> 1;

            default -> 0;
        };
    }

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

    public List<Bug> getByBothSeverityAndPriority() {

        List<Bug> bugs = bugRepository.findAll();

        bugs.sort((b1, b2) -> {

            int score1 = getSeverityScore(b1.getSeverity()) +
                    getUserPriorityScore(b1.getUser().getUserType().getPriorityLevel());

            int score2 = getSeverityScore(b2.getSeverity()) +
                    getUserPriorityScore(b2.getUser().getUserType().getPriorityLevel());

            return Integer.compare(score2, score1); // descending order
        });

        return bugs;
    }
}
