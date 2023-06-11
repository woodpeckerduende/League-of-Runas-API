package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.model.ArvoreRunas;
import com.example.League.of.Runes.service.ArvoreRunasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arvorerunas")
public class ArvoreRunasController {
    private final ArvoreRunasService arvoreRunasService;

    @Autowired
    public ArvoreRunasController(ArvoreRunasService arvoreRunasService) {
        this.arvoreRunasService = arvoreRunasService;
    }

    
}


