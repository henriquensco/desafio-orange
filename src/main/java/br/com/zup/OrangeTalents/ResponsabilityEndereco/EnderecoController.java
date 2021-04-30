package br.com.zup.OrangeTalents.ResponsabilityEndereco;

import br.com.zup.OrangeTalents.ResponsabilityUsuario.Usuario;
import br.com.zup.OrangeTalents.ResponsabilityUsuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/orange/")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/endereco")
    String endereco(@RequestBody EnderecoRequest enderecoRequest) {

        Optional<Usuario> usuario = usuarioRepository.findById(enderecoRequest.getUserId());

        if(usuario.isPresent()) {
            var endereco = enderecoRepository.save(enderecoRequest.toModel());

            usuario.get().setEnderecos(endereco);

            return usuario.get().toString();
        }

        return "feio";
    }
}
