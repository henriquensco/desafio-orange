package br.com.zup.OrangeTalents.repository;

import br.com.zup.OrangeTalents.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    List<UsuarioModel> findById(Integer id);

    List<UsuarioModel> findAllById(Integer id);
}
