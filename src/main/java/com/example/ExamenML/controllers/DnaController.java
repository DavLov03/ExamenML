package com.example.ExamenML.controllers;

import com.example.ExamenML.dto.DnaRequest;
import com.example.ExamenML.dto.DnaResponse;
import com.example.ExamenML.services.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/mutant")
public class DnaController {

    private final DnaService dnaService;

    @Autowired
    public DnaController(DnaService dnaService){
        this.dnaService = dnaService;
    }

    @PostMapping
    public ResponseEntity<DnaResponse> checkMutant(@Valid @RequestBody DnaRequest dnaRequest){
        boolean isMutant = dnaService.analyzeDna(dnaRequest.getDna());
        DnaResponse dnaResponse = new DnaResponse(isMutant);
        if (isMutant) {
            return ResponseEntity.ok(dnaResponse);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }
    }
}
