package br.com.marceloroldrin.aula.controllers;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.marceloroldrin.aula.model.entities.GenericEntitie;

public class GenericController<T extends GenericEntitie<ID>, ID, R extends JpaRepository<T, ID>> {

    @Autowired
    R jpaRepository;

    @GetMapping
    protected Iterable<T> findAll() {
        return jpaRepository.findAll();
    }

    @GetMapping("/{id}")
    protected T getById(@PathVariable ID id) {
        Optional optional = jpaRepository.findById(id);
        return optional.isPresent() ? (T) optional.get() : null;
    }

    @PostMapping
    protected T create(@Valid @RequestBody T arg) {
        return arg.getId() == null ? (T) jpaRepository.save(arg) : null;
    }

    @PutMapping
    protected T update(@Valid @RequestBody T arg) {
        System.out.println(arg);
        return this.exists(arg.getId()) ? (T) jpaRepository.save(arg) : null;
    }

    @DeleteMapping("/{id}")
    protected String delete(@PathVariable ID id) {
        if (!this.exists(id)) {
            return "Não encontrado";
        }
        jpaRepository.deleteById(id);
        return "Deletado";
    }

    protected List<T> findWhere(Predicate<T> where) {
        return jpaRepository.findAll()
                .stream()
                .filter(where)
                .toList();
    }

    private boolean exists(ID id) {
        return jpaRepository.findById(id).isPresent();
    }
}
