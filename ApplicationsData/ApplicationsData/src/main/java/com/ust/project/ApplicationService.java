package com.ust.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ApplicationService {
    @Autowired
    private ApplicationDataRepository applicationDataRepository;
    //Get all details
    public List<Application> getAllApp(){
        return applicationDataRepository.findAll();
    }
    //get all details by ID
    public Optional<Application> getAppsById(Long id)
    {
        return applicationDataRepository.findById(id);
    }
    //add details
    public Application saveApps(Application application)
    {
        return  applicationDataRepository.save(application);
    }
    //update details
    public Application updateApps(Long id,Application application)
    {
        if(applicationDataRepository.existsById(id))
        {
            application.setId(id);
            return applicationDataRepository.save(application);
        }
        return null;
    }

    //delete details by id
    public void deleteApps(Long id)
    {
        applicationDataRepository.deleteById(id);
    }


}
