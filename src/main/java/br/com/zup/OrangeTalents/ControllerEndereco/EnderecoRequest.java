package br.com.zup.OrangeTalents.ControllerEndereco;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class EnderecoRequest {

    @NotBlank
    private String logadouro;

    private Integer numero;

    @NotBlank
    private String complemento;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cidade;

    @NotBlank
    @Size(max = 2)
    private String estado;

    @NotBlank
    private String cep;


    public String getLogadouro() { return logadouro; }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() { return complemento; }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }
}
