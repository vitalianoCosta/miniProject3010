package com.Ironhack.PetAdoption.DataBase.Controller;

import com.Ironhack.PetAdoption.DataBase.DTO.AdopterDTO;
import com.Ironhack.PetAdoption.DataBase.DTO.AnimalPostDTO;
import com.Ironhack.PetAdoption.DataBase.Service.AdopterService;
import com.Ironhack.PetAdoption.DataBase.dao.Adopter;
import com.Ironhack.PetAdoption.DataBase.dao.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database/adopter")
public class AdopterController {

    @Autowired
    AdopterService adopterService;

    @PostMapping
    Adopter postNewAnimal(@RequestBody AdopterDTO adopterDTO){
        return adopterService.createAdopter(adopterDTO);
    }

    @GetMapping("/all")
    List<Adopter> getAllAdopter(){
        return adopterService.findAllAdopters();
    }

    @GetMapping("/{id}")
    Adopter findAdopter(@PathVariable Long id){
        return adopterService.findById(id);
    }
}
