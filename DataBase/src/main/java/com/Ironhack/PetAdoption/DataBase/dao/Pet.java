package com.Ironhack.PetAdoption.DataBase.dao;

import com.Ironhack.PetAdoption.DataBase.DTO.AnimalPostDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private Integer age;

    private Boolean available;

    public Pet(AnimalPostDTO animalPostDTO) {
        this.name = animalPostDTO.getName();
        this.type = animalPostDTO.getType();
        this.age = animalPostDTO.getAge();
        this.available = Boolean.TRUE;
    }
}
