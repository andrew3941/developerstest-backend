package com.developtester.developers.dao;

import com.developtester.developers.domain.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

    Optional<Developer> findDeveloperById(Integer id);
}
