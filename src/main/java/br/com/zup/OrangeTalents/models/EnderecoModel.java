package br.com.zup.OrangeTalents.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cep;

    @NotBlank
    private String cidade;

    @NotBlank
    private String complemento;

    @NotEmpty
    @Size(max = 2)
    private String estado;

    @NotBlank
    private String logadouro;

    @NotNull
    private Integer numero;

    private Long usuario;

    @Deprecated
    public EnderecoModel() {}

    public EnderecoModel(String bairro, String cep, String cidade, String complemento, String estado, String logadouro, Integer numero, Long usuario) {
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

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", logadouro='" + logadouro + '\'' +
                ", numero=" + numero +
                ", usuario=" + usuario +
                '}';
    }

}
