package com.cafesmart.propriedade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/propriedades")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository repository;

    @PostMapping
    public Propriedade registar(@RequestBody Propriedade propriedade) {
        return repository.save(propriedade);
    }

    @GetMapping
    public List<Propriedade> listar() {
        return repository.findAll();
    }
}