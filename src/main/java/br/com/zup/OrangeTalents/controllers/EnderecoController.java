package br.com.zup.OrangeTalents.controllers;

import br.com.zup.OrangeTalents.requests.EnderecoRequest;
import br.com.zup.OrangeTalents.models.Usuario;
import br.com.zup.OrangeTalents.repository.EnderecoRepository;
import br.com.zup.OrangeTalents.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/orange/")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/endereco")
    @ResponseStatus(HttpStatus.CREATED)
    public String criarEndereco(@RequestBody EnderecoRequest enderecoRequest) {

        Optional<Usuario> usuario = usuarioRepository.findById(enderecoRequest.getUserId());

        if(usuario.isPresent()) {
            var endereco = enderecoRepository.save(enderecoRequest.toModel());

            usuario.get().setEnderecos(endereco);

            return usuario.get().toString();
        }

        return "feio";
    }
}
