package br.com.desafioecommerce.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioecommerce.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
