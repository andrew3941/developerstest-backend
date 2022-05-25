package com.developtester.developers.service;

import com.developtester.developers.domain.Developer;

import java.util.List;

public interface DeveloperService {

    Developer findDeveloperById(int id) throws Exception;

    List<Developer> findAllDeveloper();

    void createDeveloper(Developer developer);

    void editDeveloper(Developer developer) throws Exception;

    void deleteDeveloper(int id) throws Exception;
}
