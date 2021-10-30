package com.Ironhack.PetAdoption.AnimalAdoptionService.proxy;

import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.AdopterDTO;
import com.Ironhack.PetAdoption.AnimalAdoptionService.dto.ReturnedAdopter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("adopter-service")
public interface AdopterProxy {

    @PostMapping
    ReturnedAdopter postNewAdopter(@RequestBody AdopterDTO adopterDTO);

    @GetMapping("/all")
    List<ReturnedAdopter> getAllAdopter();

    @GetMapping("/{id}")
    ReturnedAdopter findAdopter(@PathVariable Long id);
}

