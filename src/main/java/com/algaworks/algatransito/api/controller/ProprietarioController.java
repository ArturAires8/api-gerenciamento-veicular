package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> Listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Artur");
        proprietario1.setTelefone("62982321895");
        proprietario1.setEmail("arturaires8/@gmail.com");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Cibelle");
        proprietario2.setTelefone("62981452545");
        proprietario2.setEmail("cibelle@gmail.com");

        return Arrays.asList(proprietario1, proprietario2);
    }

}
