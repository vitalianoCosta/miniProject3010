package com.Ironhack.PetAdoption.AnimalAdoptionService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnimalGetDTO {
  private Long id;
  private String name;
  private String type;
  private Integer age;
  private Boolean available;
}
