import br.com.zup.OrangeTalents.ResponsabilityEndereco.Endereco;

import javax.persistence.*;
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
    private String email;

    //@Column(unique = true)
    private String cpf;

    private LocalDate dataNasc;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USUARIO")
    private List<Endereco> endereco;

    @Deprecated
    public Usuario() {}

    public Usuario(String nome, String email, String cpf, LocalDate dataNasc, List<Endereco> endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

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

    public List<Endereco> getEndereco() {
        return endereco;
    }
}
