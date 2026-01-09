package com.salesianostriana.dam.Tribici.services;

import com.salesianostriana.dam.Tribici.models.Bicicleta;
import com.salesianostriana.dam.Tribici.models.Estacion;
import com.salesianostriana.dam.Tribici.models.Uso;
import com.salesianostriana.dam.Tribici.models.Usuario;
import com.salesianostriana.dam.Tribici.repositories.BicicletaRepository;
import com.salesianostriana.dam.Tribici.repositories.EstacionRepository;
import com.salesianostriana.dam.Tribici.repositories.UsoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsoService {

    private static final double UMBRA_SALDO_MIN =5;

    private final UsoRepository usoRepository;
    private final UsuarioService usuarioService;
    private final EstacionRepository estacionRepository;
    private final BicicletaRepository bicicletaRepository;

    public List<Uso> getAll(){
        List<Uso>usoList = usoRepository.findAll();

        if(usoList.isEmpty()){
            throw new EntityNotFoundException("No se han encontrado usos");
        }

        return usoList;
    }

    // Usuario "inicializado"
    // Estación
    // Bici

    public Uso inicializarUso(String numTarjeta,int pin,Long idEstacion,Long idBicicleta){

        Usuario usuario = usuarioService.inicializarUsuario(numTarjeta,pin)
                .orElseThrow(() -> new EntityNotFoundException("No se ha encontrado"));

        //if(usuario.getSaldo()<UMBRA_SALDO_MIN)
            //throw new BadRequestException("No tiene dinero suficiente.");

        Estacion inicio =  estacionRepository.findById(idEstacion)
                .orElseThrow(() ->new EntityNotFoundException("No se ha encontrado la estación"));
        Bicicleta bicicleta = bicicletaRepository.findById(idBicicleta)
                .orElseThrow(() -> new EntityNotFoundException("No se ha encontrado la bicicleta"));

        return null;
    }



}
