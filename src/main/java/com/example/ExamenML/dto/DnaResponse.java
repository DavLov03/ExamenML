package com.example.ExamenML.dto;

import com.example.ExamenML.validators.ValidDna;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class DnaResponse {
    private boolean isMutant;
    public boolean isMutant(){
        return isMutant;
    }
}
