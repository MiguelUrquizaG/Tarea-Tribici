package com.salesianostriana.dam.Tribici.repositories;

import com.salesianostriana.dam.Tribici.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Optional<Usuario> findByNumTarjetaAndPin(String numTarjeta, int pin);
}
