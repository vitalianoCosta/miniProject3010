package com.Ironhack.PetAdoption.DataBase.Service;

import com.Ironhack.PetAdoption.DataBase.DTO.AdopterDTO;
import com.Ironhack.PetAdoption.DataBase.Repository.AdopterRepository;
import com.Ironhack.PetAdoption.DataBase.dao.Adopter;
import com.Ironhack.PetAdoption.DataBase.dao.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AdopterService {

    @Autowired
    AdopterRepository adopterRepository;

    public Adopter createAdopter(AdopterDTO adopterDTO) {
        return adopterRepository.save(new Adopter(adopterDTO));
    }

    public List<Adopter> findAllAdopters() {
        return adopterRepository.findAll();
    }

    public Adopter findById(Long id) {
        Optional<Adopter> foundAdopter = adopterRepository.findById(id);
        if (foundAdopter.isPresent()){
            return foundAdopter.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Adopter with that ID Exists");
        }
    }
}
