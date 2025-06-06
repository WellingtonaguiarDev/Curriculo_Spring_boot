package com.wellington.curriculo_api.controller;

import com.wellington.curriculo_api.model.Curriculo;
import com.wellington.curriculo_api.service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoService.getAllCurriculos();
    }

    @GetMapping("/{id}")
    public Optional<Curriculo> getCurriculoById(@PathVariable Long id) {
        return curriculoService.getCurriculoById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Curriculo createCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.saveCurriculo(curriculo);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCurriculo(@PathVariable Long id) {
        boolean isDeleted = curriculoService.deletarCurriculo(id);
        if (!isDeleted) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Currículo não encontrado");
        }
    }
}
