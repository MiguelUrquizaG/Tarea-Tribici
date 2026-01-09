package com.salesianostriana.dam.Tribici.services;

import com.salesianostriana.dam.Tribici.models.Uso;
import com.salesianostriana.dam.Tribici.repositories.UsoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsoService {

    private final UsoRepository usoRepository;

    public List<Uso> getAll(){
        List<Uso>usoList = usoRepository.findAll();

        if(usoList.isEmpty()){
            throw new EntityNotFoundException("No se han encontrado usos");
        }

        return usoList;
    }

}
