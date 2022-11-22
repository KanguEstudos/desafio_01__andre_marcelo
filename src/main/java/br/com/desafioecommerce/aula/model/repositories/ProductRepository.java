package br.com.desafioecommerce.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.desafioecommerce.aula.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p.title, p.price, description FROM Product p")
    public Iterable<Product> search();
}
