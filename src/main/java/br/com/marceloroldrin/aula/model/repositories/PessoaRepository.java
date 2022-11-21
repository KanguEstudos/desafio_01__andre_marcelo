package br.com.marceloroldrin.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marceloroldrin.aula.model.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
