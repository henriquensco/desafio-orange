package br.com.zup.OrangeTalents;

import br.com.zup.OrangeTalents.models.Usuario;
import br.com.zup.OrangeTalents.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@SpringBootApplication
public class OrangeTalentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeTalentsApplication.class, args);
	}

}
