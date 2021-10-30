package com.Ironhack.PetAdoption.DataBase.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdopterDTO {
    private String name;
    private Long petId;
}
