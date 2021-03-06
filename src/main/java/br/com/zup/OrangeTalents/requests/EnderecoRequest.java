package br.com.zup.OrangeTalents.requests;

import br.com.zup.OrangeTalents.models.EnderecoModel;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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

    @NotEmpty
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

    public EnderecoModel toModel() {
        return new EnderecoModel(
                this.bairro,
                this.cep,
                this.cidade,
                this.complemento,
                this.estado,
                this.logadouro,
                this.numero,
                this.userId);
    }
}
