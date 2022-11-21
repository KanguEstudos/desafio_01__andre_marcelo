package br.com.marceloroldrin.aula.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marceloroldrin.aula.model.entities.Cliente;
import br.com.marceloroldrin.aula.model.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
class ClienteController extends GenericController<Cliente, Long, ClienteRepository>{
    
    @GetMapping("/find/{nome}")
    public List<Cliente> f(@PathVariable String nome){
        return super.findWhere(
            p -> p.getNome().toLowerCase().contains(nome.toLowerCase()) || p.getCpf().contains(nome)            
            );

    }

}