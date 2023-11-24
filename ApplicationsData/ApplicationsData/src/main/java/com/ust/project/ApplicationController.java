package com.ust.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/apps")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    //get all details
    @GetMapping
    public List<Application> getAllApps() {
        return applicationService.getAllApp();
    }

    @GetMapping("/{id}")
    public Optional<Application> getAllAppsById(@PathVariable Long id) {
        return applicationService.getAppsById(id);
    }

    @PostMapping
    public Application saveApps(@PathVariable Long id, @RequestBody Application apps) {
        return applicationService.saveApps(apps);
    }
    @PutMapping ("/{id}")
    public Application updateApps (@PathVariable Long id,@RequestBody Application updateApps)
    {
        return applicationService.updateApps(id,updateApps);
    }
    @DeleteMapping("/{id}")
    public void deleteApps(@PathVariable Long id)
    {
        applicationService.deleteApps(id);
    }
}

