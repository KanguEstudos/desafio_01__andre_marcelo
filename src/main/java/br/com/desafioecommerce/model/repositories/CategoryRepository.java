package br.com.desafioecommerce.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioecommerce.model.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
    
}
