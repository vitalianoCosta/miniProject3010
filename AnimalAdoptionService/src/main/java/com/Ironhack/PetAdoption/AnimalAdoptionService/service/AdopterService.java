package com.Ironhack.PetAdoption.AnimalAdoptionService.service;

import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AdopterDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AvailableDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.ReturnedAdopter;
import com.Ironhack.PetAdoption.AnimalAdoptionService.proxy.AdopterProxy;
import com.Ironhack.PetAdoption.AnimalAdoptionService.proxy.AnimalProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdopterService {

    @Autowired
    private AdopterProxy adopterProxy;

    @Autowired
    private AnimalProxy animalProxy;

    public ReturnedAdopter createAdopter(AdopterDTO adopterDTO) {
        animalProxy.updateAvailability(adopterDTO.getPetId(), new AvailableDTO(false));
        return adopterProxy.postNewAdopter(adopterDTO);
    }

    public List<ReturnedAdopter> findAllAdopters() {
        return adopterProxy.getAllAdopter();
    }

    public ReturnedAdopter findById(Long id) {
        return adopterProxy.findAdopter(id);
    }
}

