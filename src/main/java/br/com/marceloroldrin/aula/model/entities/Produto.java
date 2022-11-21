package br.com.marceloroldrin.aula.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "produto")
public class Produto implements GenericEntitie<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode ficar em branco")
    private String nome;

    @DecimalMin(value = "0", message = "O valor mínimo para preço é 0")
    private double preco;
    
    @DecimalMin(value = "0", message = "O valor deve ser entre 0 e 1")
    @DecimalMax(value = "1", message = "O valor deve ser entre 0 e 1")    
    private double desconto;

    public Produto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
