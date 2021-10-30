package com.Ironhack.PetAdoption.DataBase.Service;

import com.Ironhack.PetAdoption.DataBase.DTO.AnimalPostDTO;
import com.Ironhack.PetAdoption.DataBase.DTO.AvailableDTO;
import com.Ironhack.PetAdoption.DataBase.Repository.PetRepository;
import com.Ironhack.PetAdoption.DataBase.dao.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    public List<Pet> getPetByTypeAndAgeRange(Optional<String> type, Optional<Integer> startAge, Optional<Integer> endAge) {
        Integer birthAge = startAge.orElse(0);
        Integer maxAge = endAge.orElse(999);
        return type.isPresent()
                ? petRepository.findByStartAgeBetweenAndTypeEquals(birthAge, maxAge, type.get())
                : petRepository.findByAgeBetween(birthAge, maxAge);
    }

    public Pet createPet(AnimalPostDTO animalPostDTO) {
        return petRepository.save(new Pet(animalPostDTO));
    }

    public Pet updatePetAvailability(Long id, AvailableDTO isAvailableDTO) {
        Optional<Pet> foundPet = petRepository.findById(id);
        if (foundPet.isPresent()){
            foundPet.get().setAvailable(isAvailableDTO.getIsAvailable());
            petRepository.save(foundPet.get());
            return foundPet.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Pet Exists with that Id");
        }
    }
}
