package com.Ironhack.PetAdoption.AdopterService.controller;

import com.Ironhack.PetAdoption.AdopterService.dto.AdopterDTO;
import com.Ironhack.PetAdoption.AdopterService.dto.ReturnedAdopter;
import com.Ironhack.PetAdoption.AdopterService.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AdopterController {

    @Autowired
    AdopterService adopterService;

    @PostMapping
    ReturnedAdopter postNewAdopter(@RequestBody AdopterDTO adopterDTO){
        return adopterService.createAdopter(adopterDTO);
    }

    @GetMapping("/all")
    List<ReturnedAdopter> getAllAdopter(){
        return adopterService.findAllAdopters();
    }

    @GetMapping("/{id}")
    ReturnedAdopter findAdopter(@PathVariable Long id){
        return adopterService.findById(id);
    }
}
