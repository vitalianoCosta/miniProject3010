package com.Ironhack.PetAdoption.AnimalAdoptionService.service;

import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AnimalGetDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AnimalPostDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AvailableDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.proxy.AnimalProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl {

  @Autowired
  private AnimalProxy databaseProxy;

  public List<AnimalGetDTO> getListOfAvailableAnimals() {
    return databaseProxy.getListOfAvailableAnimals();
  }

  public List<AnimalGetDTO> getListOfAvailableAnimalsByTypeAndAgeRange(Optional<String> type, Optional<Integer> startAge, Optional<Integer> endAge) {
    return databaseProxy.getListOfAvailableAnimalsByTypeAndAgeRange(type, startAge, endAge);
  }

  public AnimalGetDTO postNewAnimal(AnimalPostDTO animalPostDTO) {
    return databaseProxy.postNewAnimal(animalPostDTO);
  }

  public AvailableDTO updateAvailability(@PathVariable("id") int id, @RequestBody AvailableDTO isAvailableDTO) {
    return databaseProxy.updateAvailability(id, isAvailableDTO);
  }

}
