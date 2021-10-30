package com.Ironhack.PetAdoption.AdopterService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnedAdopter {
    private Long id;
    private String name;
    private Long petId;
}
