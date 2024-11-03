package com.example.ExamenML.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Dna extends Base implements Serializable {
    private String dna;
    private boolean isMutant;

}
