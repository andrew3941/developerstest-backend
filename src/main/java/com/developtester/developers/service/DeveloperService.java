package com.developtester.developers.service;

import com.developtester.developers.domain.Developer;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface DeveloperService {
    ResponseEntity<?> saveDeveloper(Developer developer);

    ResponseEntity<?> editDeveloper(int developerId, Developer developer);

    Developer findDeveloperById(int id);

    List<Developer> findAllDeveloper();

    ResponseEntity<?> deleteDeveloper(int id);
}
