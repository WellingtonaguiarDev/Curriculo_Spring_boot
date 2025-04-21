package com.wellington.curriculo_api.service;

import com.wellington.curriculo_api.model.Experiencia;
import com.wellington.curriculo_api.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public Experiencia saveExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }
}