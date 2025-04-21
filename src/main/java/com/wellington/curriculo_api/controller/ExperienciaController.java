package com.wellington.curriculo_api.controller;

import com.wellington.curriculo_api.model.Experiencia;
import com.wellington.curriculo_api.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.saveExperiencia(experiencia);
    }
}