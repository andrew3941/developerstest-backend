package com.developtester.developers.service;

import com.developtester.developers.dao.DeveloperRepository;
import com.developtester.developers.domain.Developer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository developerRepository;

    @Override
    public Developer findDeveloperById(int id) throws Exception {
        Optional<Developer> optionalDeveloper = developerRepository.findDeveloperById(id);
        if (optionalDeveloper.isPresent()) {
            return optionalDeveloper.get();
        } else {
            throw new Exception("Developer is not found");  // here need to be a custom exception EX: NotFoundException
        }
    }

    @Override
    public List<Developer> findAllDeveloper() {
        return developerRepository.findAll();
    }

    @Override
    public void createDeveloper(Developer developer) {
        developerRepository.save(developer);
    }

    @Override
    public void editDeveloper(Developer developer) throws Exception {
        Optional<Developer> optionalDeveloper = developerRepository.findDeveloperById(developer.getId());
        if (optionalDeveloper.isPresent()) {
            developerRepository.save(developer);
        } else {
            throw new Exception("Developer is not found");
        }
    }

    @Override
    public void deleteDeveloper(int id) throws Exception {
        Optional<Developer> optionalDeveloper = developerRepository.findById(id);
        if (optionalDeveloper.isPresent()) {
            developerRepository.delete(optionalDeveloper.get());
        } else {
            throw new Exception("Developer not found");
        }
    }
}
