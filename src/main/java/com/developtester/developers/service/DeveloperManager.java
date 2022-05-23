package com.developtester.developers.service;

import com.developtester.developers.dao.DeveloperRepository;
import com.developtester.developers.domain.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperManager implements DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public ResponseEntity<?> saveDeveloper(Developer developer) {
        developerRepository.save(developer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> editDeveloper(int developerId, Developer developer) {
        developerRepository.save(developer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public Developer findDeveloperById(int id) {
        return developerRepository.findDeveloperById(id);
    }

    @Override
    public List<Developer> findAllDeveloper() {
        return developerRepository.findAll();
    }

    @Override
    public ResponseEntity<?> deleteDeveloper(int id) {
        developerRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
