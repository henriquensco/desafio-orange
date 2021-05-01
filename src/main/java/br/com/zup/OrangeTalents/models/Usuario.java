package br.com.zup.OrangeTalents.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "cpf")
})
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pq IDENTITY e não AUTO  - O hibernete pricisa de um Id
    private Long id;

    @NotBlank
    private String nome;

    //@Column(unique = true)
    @NotBlank
    @Email()
    private String email;

    //@Column(unique = true)
    @NotBlank
    @CPF
    private String cpf;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNasc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Endereco> enderecos;

    @Deprecated
    public Usuario() {}

    public Usuario(String nome, String email, String cpf, LocalDate dataNasc, List<Endereco> enderecos) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
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

    public void setEnderecos(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNasc=" + dataNasc +
                ", enderecos=" + enderecos +
                '}';
    }
}
