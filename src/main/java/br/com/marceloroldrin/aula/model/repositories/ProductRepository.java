package br.com.marceloroldrin.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marceloroldrin.aula.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
