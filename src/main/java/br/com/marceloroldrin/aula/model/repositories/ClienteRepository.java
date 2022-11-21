package br.com.marceloroldrin.aula.model.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marceloroldrin.aula.model.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
