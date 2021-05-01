package br.com.zup.OrangeTalents;

import br.com.zup.OrangeTalents.models.UsuarioModel;
import br.com.zup.OrangeTalents.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaCadastros {

    private UsuarioRepository repository;

    ConsultaCadastros(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/orange")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioModel> fetchAllUsuarios() {

        return repository.findAll();

    }
}
