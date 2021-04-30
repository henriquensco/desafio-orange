package br.com.zup.OrangeTalents.ResponsabilityUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findById(Integer id);

    List<Usuario> findAllById(Integer id);
}
