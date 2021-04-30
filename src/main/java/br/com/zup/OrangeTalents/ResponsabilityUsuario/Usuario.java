package br.com.zup.OrangeTalents.ResponsabilityUsuario;

import br.com.zup.OrangeTalents.ResponsabilityEndereco.Endereco;

import javax.persistence.*;
import javax.validation.constraints.Email;
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

    private String nome;

    //@Column(unique = true)
    @Email(message = "Alguém já utiliza este email")
    private String email;

    //@Column(unique = true)
    private String cpf;

    private LocalDate dataNasc;

    @OneToMany
    @JoinColumn(name = "user_id")
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
