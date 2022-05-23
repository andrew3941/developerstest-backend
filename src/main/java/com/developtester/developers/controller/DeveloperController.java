package com.developtester.developers.controller;

import com.developtester.developers.domain.Developer;
import com.developtester.developers.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developer")
@CrossOrigin(origins = "http://localhost:4200")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;


    // save developer
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<?> saveDeveloper(@RequestBody Developer developer) {
        return developerService.saveDeveloper(developer);
    }

    // get all developer
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Developer>> findAllDeveloper() {

        List<Developer> developers = developerService.findAllDeveloper();

        if(developers == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<List<Developer>>(developers, HttpStatus.OK);
    }


    // geting developer by id
    @RequestMapping(value = "{developerId}", method = RequestMethod.GET)
    public ResponseEntity<?> findDeveloperById(@PathVariable("developerId") int developerId) {

        Developer developer;

        try {
            developer = developerService.findDeveloperById(developerId);
        }
        catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (developer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Developer>(developer, HttpStatus.OK);
    }


    //this method delete developer by id
    @RequestMapping(value = "{developerId}/delete", method = RequestMethod.POST)
    public ResponseEntity<?> deleteDeveloper(@PathVariable(value = "developerId") int id) {

        return developerService.deleteDeveloper(id);
    }

    // update developer
    @RequestMapping(value = "{developerId}/edit", method = RequestMethod.POST)
    public ResponseEntity<?> updateDeveloper(@PathVariable(value = "developerId") int developerId,@RequestBody Developer developer) {
        return developerService.editDeveloper(developerId,developer);
    }
}
