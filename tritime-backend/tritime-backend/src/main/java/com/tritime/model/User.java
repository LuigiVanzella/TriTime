package com.tritime.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // Nome da tabela no banco
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(nullable = false)
    private java.sql.Date nascimento;

    @Column(nullable = false)
    private Integer altura;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String senha;


    // Construtores
    public User() {}

    public User(String nome, Genero genero, java.sql.Date nascimento, Integer altura, Double peso,
                String cpf, String email, String senha) {
        this.nome = nome;
        this.genero = genero;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }


    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }

    public java.sql.Date getNascimento() { return nascimento; }
    public void setNascimento(java.sql.Date nascimento) { this.nascimento = nascimento; }

    public Integer getAltura() { return altura; }
    public void setAltura(Integer altura) { this.altura = altura; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

}
