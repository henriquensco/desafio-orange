package br.com.zup.OrangeTalents.ControllerUsuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pq IDENTITY e não AUTO  - O hibernete pricisa de um Id
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private LocalDate dataNasc;

    public Usuario(String nome, String email, String cpf, LocalDate dataNasc) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    @Deprecated
    public Usuario() {

    }

    // Trabalhar unicidade das colunas

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }
}
