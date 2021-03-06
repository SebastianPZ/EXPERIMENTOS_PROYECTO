package com.myorg.ezdeal.repository;

import com.myorg.ezdeal.models.Reseña;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReseñaRepository extends JpaRepository<Reseña, Integer> {

    @Query("SELECT r FROM Reseña r where r.servicio.id = ?1")
    List<Reseña> listarReseñasPorServicio(Integer servicioId) throws Exception;

}
