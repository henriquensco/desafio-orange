package br.com.zup.OrangeTalents;

import br.com.zup.OrangeTalents.ResponsabilityUsuario.Usuario;
import br.com.zup.OrangeTalents.ResponsabilityUsuario.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Aplicacao {

    private UsuarioRepository repository;

    Aplicacao(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api")
    public List<Usuario> fetchAllUsuarios() {
        return repository.findAll();
    }
}
