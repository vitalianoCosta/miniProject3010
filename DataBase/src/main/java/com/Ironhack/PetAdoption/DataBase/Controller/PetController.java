package com.Ironhack.PetAdoption.DataBase.Controller;

import com.Ironhack.PetAdoption.DataBase.DTO.AnimalPostDTO;
import com.Ironhack.PetAdoption.DataBase.DTO.AvailableDTO;
import com.Ironhack.PetAdoption.DataBase.Service.PetService;
import com.Ironhack.PetAdoption.DataBase.dao.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/database/animal")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/available")
    public List<Pet> returnAllPets(){
        return petService.getAllPets();
    }

    @GetMapping
    List<Pet> getListOfAvailableAnimalsByTypeAndAgeRange(@RequestParam Optional<String> type, @RequestParam Optional<Integer> startAge, @RequestParam Optional<Integer> endAge){
        return petService.getPetByTypeAndAgeRange(type, startAge, endAge);
    }

    @PostMapping
    Pet postNewAnimal(@RequestBody AnimalPostDTO animalPostDTO){
        return petService.createPet(animalPostDTO);
    }

    @PatchMapping("/{id}")
    Pet updateAvailability(@PathVariable("id") Long id, @RequestBody AvailableDTO isAvailableDTO){
        return petService.updatePetAvailability(id, isAvailableDTO);
    }



}
