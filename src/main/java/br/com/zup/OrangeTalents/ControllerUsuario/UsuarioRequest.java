package br.com.zup.OrangeTalents.ControllerUsuario;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Component
public class UsuarioRequest {

    @NotBlank //pq coloquei NotBlank x NotEmpty
    private String nome;

    @Email
    @NotBlank
    private String email;

    @CPF
    @NotBlank
    private String cpf;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNasc;

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNasc() { return dataNasc; }
}
