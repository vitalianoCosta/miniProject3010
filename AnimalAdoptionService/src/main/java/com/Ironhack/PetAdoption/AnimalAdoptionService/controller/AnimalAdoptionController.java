package com.Ironhack.PetAdoption.AnimalAdoptionService.controller;

import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AdopterDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AnimalGetDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.ReturnedAdopter;
import com.Ironhack.PetAdoption.AnimalAdoptionService.service.AdopterService;
import com.Ironhack.PetAdoption.AnimalAdoptionService.service.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal-adoption")
public class AnimalAdoptionController {

    @Autowired
    AdopterService adopterService;

    @Autowired
    AnimalServiceImpl animalService;

    @GetMapping("/available")
    public List<AnimalGetDTO> getListOfAvailableAnimals() {
        return animalService.getListOfAvailableAnimals();
    }

    @GetMapping
    public List<AnimalGetDTO> getListOfAvailableAnimalsByTypeAndAgeRange(@RequestParam Optional<String> type, @RequestParam Optional<Integer> startAge, @RequestParam Optional<Integer> endAge) {
        return animalService.getListOfAvailableAnimalsByTypeAndAgeRange(type, startAge, endAge);
    }

    @PostMapping
    ReturnedAdopter postNewAdopter(@RequestBody AdopterDTO adopterDTO){
        return adopterService.createAdopter(adopterDTO);
    }




}
