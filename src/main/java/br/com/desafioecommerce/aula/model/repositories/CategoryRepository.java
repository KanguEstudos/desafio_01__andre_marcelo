package br.com.desafioecommerce.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioecommerce.aula.model.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
    
}
