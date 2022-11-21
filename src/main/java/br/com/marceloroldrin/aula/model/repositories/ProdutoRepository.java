package br.com.marceloroldrin.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marceloroldrin.aula.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    public Iterable<Produto> findByNomeContains(String nome);
    public Iterable<Produto> findByNomeStartsWith(String nome);



}
