package com.developtester.developers.controller;

import com.developtester.developers.domain.Developer;
import com.developtester.developers.service.DeveloperService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/developer")
@AllArgsConstructor
public class DeveloperController {

    private DeveloperService developerService;

    @GetMapping(value = "/{developerId}")
    public ResponseEntity<?> findDeveloperById(@PathVariable("developerId") int developerId) {
        try {
            return ResponseEntity.ok(developerService.findDeveloperById(developerId));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> findAllDeveloper() {
        return ResponseEntity.ok(developerService.findAllDeveloper()); // if findAllDeveloper return an empty list of developers this is not an error
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createDeveloper(@RequestBody Developer developer) {
        developerService.createDeveloper(developer);
        return ResponseEntity.ok().build();
    }

    // update developer
    @PutMapping(value = "/edit")
    public ResponseEntity<?> updateDeveloper(@RequestBody Developer developer) {
        try {
            developerService.editDeveloper(developer);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping(value = "delete/{developerId}")
    public ResponseEntity<?> deleteDeveloper(@PathVariable(value = "developerId") int id) {
        try {
            developerService.deleteDeveloper(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
