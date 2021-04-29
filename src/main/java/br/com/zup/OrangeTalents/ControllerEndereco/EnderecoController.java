package br.com.zup.OrangeTalents.ControllerEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("api/orange/")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @PostMapping("/endereco")
    public String create(@RequestBody EnderecoRequest request) {
        Endereco endereco = new Endereco(
                request.getBairro(),
                request.getCep(),
                request.getCidade(),
                request.getComplemento(),
                request.getEstado(),
                request.getLogadouro(),
                request.getNumero());

        repository.save(endereco);

        return endereco.toString();
    }
}
