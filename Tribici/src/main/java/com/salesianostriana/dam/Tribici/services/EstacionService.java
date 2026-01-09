package com.salesianostriana.dam.Tribici.services;

import com.salesianostriana.dam.Tribici.models.Bicicleta;
import com.salesianostriana.dam.Tribici.models.Estacion;
import com.salesianostriana.dam.Tribici.repositories.EstacionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionService {

    private final EstacionRepository estacionRepository;

    public List<Estacion> getAll(){
        List<Estacion>estacionList = estacionRepository.findAll();

        if(estacionList.isEmpty()){
            throw  new EntityNotFoundException("No se encuentran estaciones");
        }

        return estacionList;
    }

    public Estacion findById(Long id){
        return estacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No se encuentra una estación con ese ID"));
    }

    public Estacion save(Estacion estacion){
        return estacionRepository.save(estacion);
    }

    public Estacion edit (Long id, Estacion estacion){
        return estacionRepository.findById(id)
                .map(estacion2->{
                    estacion2.setBicicletas(estacion.getBicicletas());
                    estacion2.setNumero(estacion.getNumero());
                    estacion2.setNombre(estacion.getNombre());
                    estacion2.setCoordenadas(estacion.getCoordenadas());
                    estacion2.setCapacidad(estacion.getCapacidad());
                    return estacionRepository.save(estacion2);
                }).orElseThrow(() -> new EntityNotFoundException("No se ha encontrado la estación a modificar."));
    }

    public void delete (Long id){
        estacionRepository.deleteById(id);
    }

    public void agregarBicicletaEstacion(Bicicleta bicicleta, Long idEstacion){
        Estacion estacion = estacionRepository.findById(idEstacion).orElseThrow(() -> new EntityNotFoundException("No se encuentra la estación"));
        estacion.addBicicleta(bicicleta);
    }

}
