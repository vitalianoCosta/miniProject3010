package com.Ironhack.PetAdoption.DataBase.Repository;

import com.Ironhack.PetAdoption.DataBase.dao.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopterRepository extends JpaRepository<Adopter, Long> {
}
