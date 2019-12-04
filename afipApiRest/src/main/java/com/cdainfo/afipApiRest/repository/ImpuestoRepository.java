package com.cdainfo.afipApiRest.repository;


import com.cdainfo.afipApiRest.domunio.Impuesto;
//import com.cdainfo.dto.ImpuestoClaveFiscalDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Integer> {
	/*
	String query = "select i.nombre, c.claveFiscal\r\n" + 
			"from contribuyente c\r\n" + 
			"inner join contribuyente_impuesto ci on ci.idcontribuyente = c.idcontribuyente\r\n" + 
			"inner join impuesto i on i.idimpuestos = ci.idimpuestos";
	
	@Query(query)
	List<ImpuestoClaveFiscalDto> findAllContribuyentes();
	
	//List<Impuesto> findAllByNombreLikeOrFecha_liqLike(String nombre, Date fecha_liq);
	*/
	
    List<Impuesto> findAllByNombreLike(String nombre);

    

	List<Impuesto> findByIdimpuestos(Integer idimpuestos);

	List<Impuesto> findAllByFechaLiqBetween(Date fecha1, Date fecha2);

}
