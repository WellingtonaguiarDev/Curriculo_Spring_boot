package com.wellington.curriculo_api.service;

import com.wellington.curriculo_api.model.Curriculo;
import com.wellington.curriculo_api.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public Optional<Curriculo> getCurriculoById(Long id) {
        return curriculoRepository.findById(id);
    }

    public Curriculo saveCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public boolean deletarCurriculo(Long id) {
        if (curriculoRepository.existsById(id)) {
            curriculoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
