package com.cdainfo.afipApiRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cdainfo.afipApiRest.domunio.Impuesto;
import com.cdainfo.afipApiRest.repository.ImpuestoRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class AfipController {
    @Autowired
    ImpuestoRepository impuestoRepository;//muesta todos los impuestos
    @GetMapping("/impuesto")
    public List<Impuesto> getAllImpuestos() {
        return impuestoRepository.findAll();
    }
    
    
    @GetMapping("/impuesto/{idimpuestos}") // muestra impuesto por id
    public List<Impuesto> getAllImpuestos(@PathVariable Integer idimpuestos) {
        return impuestoRepository.findByIdimpuestos(idimpuestos);
    }
    
    
    @PostMapping("/impuestos/add")
    public Impuesto createImpuesto(@RequestBody Impuesto body) {
      return impuestoRepository.save(body);
    }
    
   
    @GetMapping("/impuestos/search2/{fecha1}/{fecha2}")
    public List<Impuesto> getImpuestosByFecha_liq(@PathVariable Date fecha1 ,@PathVariable Date fecha2 ) {
        return impuestoRepository.findAllByFechaLiqBetween(fecha1, fecha2);
    }
   /* 
    @GetMapping("/impuestos/claveFiscal")
    public List<ImpuestoClaveFiscalDto> getClaveFiscalContribuyente() {
    	return impuestoRepository.findAllByClaveFiscalContribuyente();
    }
   */
	}

