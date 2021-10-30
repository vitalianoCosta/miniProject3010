package com.Ironhack.PetAdoption.AnimalSearch.controller;

import com.Ironhack.PetAdoption.AnimalSearch.dto.AnimalGetDTO;
import com.Ironhack.PetAdoption.AnimalSearch.dto.AnimalPostDTO;
import com.Ironhack.PetAdoption.AnimalSearch.dto.AvailableDTO;
import com.Ironhack.PetAdoption.AnimalSearch.service.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal")
public class AnimalControllerImpl {

  @Autowired
  private AnimalServiceImpl animalService;

//  @GetMapping("/all")
//  public List<AnimalGetDTO> getListOfAllAnimals() {
//    return animalService.getListOfAvailableAnimals();
//  }
//
//  @GetMapping("/{id}")
//  public AnimalGetDTO getAnimalById(@PathVariable Long id) {
//    return animalService.getAnimalById(id);
//  }

  @GetMapping("/available")
  public List<AnimalGetDTO> getListOfAvailableAnimals() {
    return animalService.getListOfAvailableAnimals();
  }

  @GetMapping
  public List<AnimalGetDTO> getListOfAvailableAnimalsByTypeAndAgeRange(@RequestParam Optional<String> type, @RequestParam Optional<Integer> startAge, @RequestParam Optional<Integer> endAge) {
    return animalService.getListOfAvailableAnimalsByTypeAndAgeRange(type, startAge, endAge);
  }

  @PostMapping
  public AnimalGetDTO postNewAnimal(@RequestBody AnimalPostDTO animalPostDTO) {
    return animalService.postNewAnimal(animalPostDTO);
  }

  @PatchMapping("/{id}")
  public AvailableDTO updateAvailability(@PathVariable("id") int id, @RequestBody AvailableDTO isAvailableDTO) {
    return animalService.updateAvailability(id, isAvailableDTO);
  }


}
