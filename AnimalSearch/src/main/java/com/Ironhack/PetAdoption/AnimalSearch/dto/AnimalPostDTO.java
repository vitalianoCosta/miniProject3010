package com.Ironhack.PetAdoption.AnimalSearch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnimalPostDTO {
  private String name;
  private String type;
  private Integer age;
}
