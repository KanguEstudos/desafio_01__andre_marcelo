package br.com.marceloroldrin.aula.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marceloroldrin.aula.model.entities.Pessoa;
import br.com.marceloroldrin.aula.model.repositories.PessoaRepository;

@RestController
@RequestMapping("pessoa")
public class PessoaController extends GenericController<Pessoa, Long, PessoaRepository> {
    
    @GetMapping("/find/{nome}")
    public List<Pessoa> f(@PathVariable String nome){
        return super.findWhere(
            p ->p.getNome().toLowerCase().contains(nome)
        );
    }
}
