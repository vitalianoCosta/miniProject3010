package com.Ironhack.PetAdoption.AdopterService.service;

import com.Ironhack.PetAdoption.AdopterService.dto.AdopterDTO;
import com.Ironhack.PetAdoption.AdopterService.dto.ReturnedAdopter;
import com.Ironhack.PetAdoption.AdopterService.proxy.AdopterProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdopterService {

    @Autowired
    private AdopterProxy adopterProxy;


    public ReturnedAdopter createAdopter(AdopterDTO adopterDTO) {
        return adopterProxy.postNewAdopter(adopterDTO);
    }


    public List<ReturnedAdopter> findAllAdopters() {
        return adopterProxy.getAllAdopter();
    }

    public ReturnedAdopter findById(Long id) {
        return adopterProxy.findAdopter(id);
    }
}

