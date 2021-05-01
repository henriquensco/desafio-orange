package br.com.zup.OrangeTalents.controllers;

import br.com.zup.OrangeTalents.models.Usuario;
import br.com.zup.OrangeTalents.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/orange")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    String usuario(@RequestBody @Valid Usuario usuario) {
        repository.save(usuario);
        return usuario.toString();
    }

}

// TODO: 28/04/2021 Substituir lógica de criar o Usuário para um método dentro de usuario request que retorna o próprio usuário
// TODO: 28/04/2021 Retornar Status 201 CREATE | response entity