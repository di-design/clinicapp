package com.t6.clinicapp.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class EmpresaModel {
    
    @Id
    private String id;
    private String nit;
	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	private String quienes_somos;
	private String mision;
	private String vision;
	private String ruta_logo;
	private String objetivos;
	private String nombre_corto;
	private String siglas;
	private PortalModel portal;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT-5")
	@Field("create_time")
	private Date fecha_cambio;

	// Constructor sin argumentos
	public EmpresaModel() {
		this.fecha_cambio = new Date();
	}

	public EmpresaModel(String id, String nit, String nombre, String direccion, String telefono, String correo,
			String quienes_somos, String mision, String vision, String ruta_logo, String objetivos, String nombre_corto,
			String siglas, PortalModel portal) {
		this.id = id;
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.quienes_somos = quienes_somos;
		this.mision = mision;
		this.vision = vision;
		this.ruta_logo = ruta_logo;
		this.objetivos = objetivos;
		this.nombre_corto = nombre_corto;
		this.siglas = siglas;
		this.portal = portal;
		this.fecha_cambio = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getQuienes_somos() {
		return quienes_somos;
	}

	public void setQuienes_somos(String quienes_somos) {
		this.quienes_somos = quienes_somos;
	}

	public String getMision() {
		return mision;
	}

	public void setMision(String mision) {
		this.mision = mision;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getRuta_logo() {
		return ruta_logo;
	}

	public void setRuta_logo(String ruta_logo) {
		this.ruta_logo = ruta_logo;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getNombre_corto() {
		return nombre_corto;
	}

	public void setNombre_corto(String nombre_corto) {
		this.nombre_corto = nombre_corto;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public PortalModel getPortal() {
		return portal;
	}

	public void setPortal(PortalModel portal) {
		this.portal = portal;
	}

	public Date getFecha_cambio() {
		return fecha_cambio;
	}

	public void setFecha_cambio(Date fecha_cambio) {
		this.fecha_cambio = fecha_cambio;
	}
	
}
