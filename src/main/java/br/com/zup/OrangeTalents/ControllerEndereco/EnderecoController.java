package br.com.zup.OrangeTalents.ControllerEndereco;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/orange/")
public class EnderecoController {
    private EnderecoRepository repository;

    @PostMapping("/endereco")

}
