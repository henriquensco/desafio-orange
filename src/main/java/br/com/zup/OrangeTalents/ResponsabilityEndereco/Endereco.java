package br.com.zup.OrangeTalents.ResponsabilityEndereco;

import br.com.zup.OrangeTalents.ResponsabilityUsuario.Usuario;

import javax.persistence.*;


@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bairro;

    private String cep;

    private String cidade;

    private String complemento;

    private String estado;

    private String logadouro;

    private Integer numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @Deprecated
    public Endereco() {}

    public Endereco(String bairro, String cep, String cidade, String complemento, String estado, String logadouro, Integer numero, Usuario usuario) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.logadouro = logadouro;
        this.numero = numero;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}