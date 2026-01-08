package com.salesianostriana.dam.Tribici.repositories;

import com.salesianostriana.dam.Tribici.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
