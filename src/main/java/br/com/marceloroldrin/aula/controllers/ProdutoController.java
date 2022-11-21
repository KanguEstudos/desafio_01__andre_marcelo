package br.com.marceloroldrin.aula.controllers;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marceloroldrin.aula.model.entities.Produto;
import br.com.marceloroldrin.aula.model.repositories.ProdutoRepository;


@RestController
@RequestMapping("produto")
public class ProdutoController extends GenericController<Produto, Long, ProdutoRepository> {
    
    @GetMapping("/find/{nome}")
    public List<Produto> f(@PathVariable String nome){
        return super.findWhere(
            p -> p.getNome().toLowerCase().contains(nome.toLowerCase())
            );
    }
    
    @GetMapping("/nome/{nome}")
    public Iterable<Produto> findByNome(@PathVariable String nome){
        return super.jpaRepository.findByNomeStartsWith(nome);
    }

}