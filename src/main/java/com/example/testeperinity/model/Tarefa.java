package com.example.testeperinity.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String titulo;

    @Column(length = 500, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private LocalDate prazo;

    @Column(length = 100, nullable = false)
    private String departamento;

    @Column(nullable = false)
    private int duracao;

    /*@ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente pessoaAlocada;*/

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonBackReference // Indica que este lado NÃO será serializado
    private Cliente pessoaAlocada;

    @Column(nullable = false)
    private boolean finalizado;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, LocalDate prazo, String departamento, int duracao, Cliente pessoaAlocada, boolean finalizado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.departamento = departamento;
        this.duracao = duracao;
        this.pessoaAlocada = pessoaAlocada;
        this.finalizado = finalizado;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Cliente getPessoaAlocada() {
        return pessoaAlocada;
    }

    public void setPessoaAlocada(Cliente pessoaAlocada) {
        this.pessoaAlocada = pessoaAlocada;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((prazo == null) ? 0 : prazo.hashCode());
        result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
        result = prime * result + duracao;
        result = prime * result + ((pessoaAlocada == null) ? 0 : pessoaAlocada.hashCode());
        result = prime * result + (finalizado ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (prazo == null) {
            if (other.prazo != null)
                return false;
        } else if (!prazo.equals(other.prazo))
            return false;
        if (departamento == null) {
            if (other.departamento != null)
                return false;
        } else if (!departamento.equals(other.departamento))
            return false;
        if (duracao != other.duracao)
            return false;
        if (pessoaAlocada == null) {
            if (other.pessoaAlocada != null)
                return false;
        } else if (!pessoaAlocada.equals(other.pessoaAlocada))
            return false;
        if (finalizado != other.finalizado)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", prazo=" + prazo
                + ", departamento=" + departamento + ", duracao=" + duracao + ", pessoaAlocada=" + pessoaAlocada
                + ", finalizado=" + finalizado + ", getId()=" + getId() + ", getTitulo()=" + getTitulo()
                + ", getClass()=" + getClass() + ", getDescricao()=" + getDescricao() + ", getPrazo()=" + getPrazo()
                + ", getDepartamento()=" + getDepartamento() + ", getDuracao()=" + getDuracao()
                + ", getPessoaAlocada()=" + getPessoaAlocada() + ", isFinalizado()=" + isFinalizado() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }


    
}