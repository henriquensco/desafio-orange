package br.com.zup.OrangeTalents.ControllerEndereco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


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

    public Endereco(String bairro, String cep, String cidade, String complemento, String estado, String logadouro, Integer numero) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.logadouro = logadouro;
        this.numero = numero;
    }

    @Deprecated
    public Endereco() {}


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
}
