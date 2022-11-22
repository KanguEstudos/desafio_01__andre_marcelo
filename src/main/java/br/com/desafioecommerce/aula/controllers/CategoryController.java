package br.com.desafioecommerce.aula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioecommerce.aula.model.entities.Category;
import br.com.desafioecommerce.aula.model.repositories.CategoryRepository;


@RestController
@RequestMapping("category")
public class CategoryController extends GenericController<Category, Long, CategoryRepository> {
    
}
