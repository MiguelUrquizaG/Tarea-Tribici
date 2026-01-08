package com.salesianostriana.dam.Tribici.repositories;

import com.salesianostriana.dam.Tribici.models.Estacion;
import com.salesianostriana.dam.Tribici.models.Estados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionRepository extends JpaRepository<Estacion, Long> {
}
