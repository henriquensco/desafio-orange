package br.com.zup.OrangeTalents.ResponsabilityEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orange/")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @PostMapping("/endereco")
    String endereco(@RequestBody Endereco endereco) {
        repository.save(endereco);
        return endereco.toString();
    }
}
