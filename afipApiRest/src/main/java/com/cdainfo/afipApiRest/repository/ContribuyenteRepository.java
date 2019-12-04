package com.cdainfo.afipApiRest.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.afipApiRest.domunio.Contribuyente;

import java.sql.Date;
import java.util.List;

@Repository
public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Integer> {
//cuil - clavefiscal 
    List<Contribuyente> findAllByNombreLike(String nombre);

    //List<Contribuyente> findAllByNombreLikeOrFecha_liqLike(String nombre, Date fecha_liq);

}
