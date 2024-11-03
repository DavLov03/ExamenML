package com.example.ExamenML.dto;

import com.example.ExamenML.validators.ValidDna;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
