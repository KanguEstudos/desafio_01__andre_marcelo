package br.com.marceloroldrin.aula.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marceloroldrin.aula.model.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
    
}
