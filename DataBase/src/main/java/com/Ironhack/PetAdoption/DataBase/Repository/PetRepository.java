package com.Ironhack.PetAdoption.DataBase.Repository;

import com.Ironhack.PetAdoption.DataBase.dao.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByStartAgeBetweenAndTypeEquals(Integer startAge, Integer endAge, String type);

    List<Pet> findByAgeBetween(Integer startAge, Integer endAge);

    List<Pet> findByTypeEquals(String type);
}
