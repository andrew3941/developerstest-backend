package com.developtester.developers.dao;


import com.developtester.developers.domain.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
    Developer findDeveloperById(Integer id);

}
