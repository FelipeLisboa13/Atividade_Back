package com.dest1.GTA.V.controllers;

import com.dest1.GTA.V.entities.Jogo;
import com.dest1.GTA.V.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

  @Autowired
    JogoRepository repository;

  @PostMapping
    public Jogo g(@RequestBody Jogo j){
      return repository.save(j);
  }

  @GetMapping
  public List<Jogo> mostrar(){
    return repository.findAll();
  }

}
