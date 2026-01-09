package com.salesianostriana.dam.Tribici.services;

import com.salesianostriana.dam.Tribici.models.Bicicleta;
import com.salesianostriana.dam.Tribici.repositories.BicicletaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BicicletaService {

    private final BicicletaRepository bicicletaRepository;

    public List<Bicicleta> getAll(){

        List<Bicicleta> lista = bicicletaRepository.findAll();

        if(lista.isEmpty()){
            throw new RuntimeException("No se encuentran bicicletas");
        }

        return lista;

    }

    public Bicicleta findById(Long id){
        return bicicletaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No se ha encontrado una bicicleta con ese ID"));
    }


    public Bicicleta save(Bicicleta bicicleta){
        return bicicletaRepository.save(bicicleta);
    }

    public Bicicleta edit (Long id,Bicicleta bicicleta){

        return bicicletaRepository.findById(id)
                .map(bicicleta1 -> {
                    bicicleta1.setEstacion(bicicleta.getEstacion());
                    bicicleta1.setEstados(bicicleta.getEstados());
                    bicicleta1.setModelo(bicicleta.getModelo());
                    bicicleta1.setMarca(bicicleta.getMarca());
                    return bicicletaRepository.save(bicicleta1);
                }).orElseThrow(() -> new RuntimeException("No se puede editar esta bicicleta"));
    }

    public void delete(Long id){
        bicicletaRepository.deleteById(id);
    }

}
