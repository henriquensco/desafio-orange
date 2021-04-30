package br.com.zup.OrangeTalents.ResponsabilityEndereco;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
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

    @NotBlank
    private Long userId;


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

    public Long getUserId() {
        return userId;
    }

    public Endereco toModel() {
        return new Endereco(
                this.bairro,
                this.cep,
                this.cidade,
                this.complemento,
                this.estado,
                this.logadouro,
                this.numero );
    }
}
