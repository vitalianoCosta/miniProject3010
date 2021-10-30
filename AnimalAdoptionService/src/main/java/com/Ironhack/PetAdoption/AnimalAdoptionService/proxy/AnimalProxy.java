package com.Ironhack.PetAdoption.AnimalAdoptionService.proxy;

import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AnimalGetDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AnimalPostDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AvailableDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient("animal-service")
public interface AnimalProxy {

    @GetMapping("/available")
    List<AnimalGetDTO> getListOfAvailableAnimals();

    @GetMapping
    List<AnimalGetDTO> getListOfAvailableAnimalsByTypeAndAgeRange(@RequestParam Optional<String> type, @RequestParam Optional<Integer> startAge, @RequestParam Optional<Integer> endAge);

    @PostMapping
    AnimalGetDTO postNewAnimal(@RequestBody AnimalPostDTO animalPostDTO);

    @PatchMapping("/{id}")
    AvailableDTO updateAvailability(@PathVariable("id") long id, @RequestBody AvailableDTO isAvailableDTO);
}
