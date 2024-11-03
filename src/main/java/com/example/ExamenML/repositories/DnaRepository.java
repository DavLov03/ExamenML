package com.example.ExamenML.repositories;

import com.example.ExamenML.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    Optional<Dna> findByDna(String dnaSequence);
    long countByIsMutant(boolean isMutant);

}
