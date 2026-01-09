package com.salesianostriana.dam.Tribici.services;

import com.salesianostriana.dam.Tribici.models.Usuario;
import com.salesianostriana.dam.Tribici.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Optional<Usuario> inicializarUsuario(String tarjeta,int pin){
        return usuarioRepository.findByNumTarjetaAndPin(tarjeta,pin);

    }

}
