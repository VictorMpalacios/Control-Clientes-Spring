package co.com.vp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.vp.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
