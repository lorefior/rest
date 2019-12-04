package com.cdainfo.afipApiRest.domunio;

import javax.persistence.*;

@Entity
public class Contribuyente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcontribuyente;

    @Column(name = "cuil_cuit_cdi")
    private Double cuil_cuit_cdi;

    @Column(name = "claveFiscal")
    private  String claveFiscal;
    
    @Column(name = "nombre")
    private  String nombre;
    
    @Column(name = "apellido")
    private  String apellido;
    
	@Column(name = "dni")
    private  Integer dni;

	public Long getIdcontribuyente() {
		return idcontribuyente;
	}

	public void setIdcontribuyente(Long idcontribuyente) {
		this.idcontribuyente = idcontribuyente;
	}

	public Double getCuil_cuit_cdi() {
		return cuil_cuit_cdi;
	}

	public void setCuil_cuit_cdi(Double cuil_cuit_cdi) {
		this.cuil_cuit_cdi = cuil_cuit_cdi;
	}

	public String getClaveFiscal() {
		return claveFiscal;
	}

	public void setClaveFiscal(String claveFiscal) {
		this.claveFiscal = claveFiscal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Contribuyente [idcontribuyente=" + idcontribuyente 
				+ ", cuil_cuit_cdi=" + cuil_cuit_cdi
				+ ", claveFiscal=" + claveFiscal 
				+ ", nombre=" + nombre 
				+ ", apellido=" + apellido 
				+ ", dni=" + dni + "]";
	}
    

	
}

/*****************************
 
 */