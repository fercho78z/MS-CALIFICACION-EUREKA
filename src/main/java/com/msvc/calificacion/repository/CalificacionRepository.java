package com.msvc.calificacion.repository;

import com.msvc.calificacion.entity.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalificacionRepository extends MongoRepository<Calificacion,String> { //se cambia de Longa String pero esta bien 

    List<Calificacion> findByUsuarioId(String usuarioId);
    List<Calificacion> findByHotelId(String hotelId);
}
