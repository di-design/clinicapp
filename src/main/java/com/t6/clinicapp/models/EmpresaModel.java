package com.t6.clinicapp.models;

import org.springframework.data.annotation.Id;

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
	private String objetivos;
	private String nombre_corto;
	private String siglas;
	
	public EmpresaModel() {
	}

	public EmpresaModel(String id, String nit, String nombre, String direccion, String telefono, String correo,
			String quienes_somos, String mision, String vision, String objetivos, String nombre_corto, String siglas) {
		this.id = id;
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.quienes_somos = quienes_somos;
		this.mision = mision;
		this.vision = vision;
		this.objetivos = objetivos;
		this.nombre_corto = nombre_corto;
		this.siglas = siglas;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mision == null) ? 0 : mision.hashCode());
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombre_corto == null) ? 0 : nombre_corto.hashCode());
		result = prime * result + ((objetivos == null) ? 0 : objetivos.hashCode());
		result = prime * result + ((quienes_somos == null) ? 0 : quienes_somos.hashCode());
		result = prime * result + ((siglas == null) ? 0 : siglas.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((vision == null) ? 0 : vision.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaModel other = (EmpresaModel) obj;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mision == null) {
			if (other.mision != null)
				return false;
		} else if (!mision.equals(other.mision))
			return false;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombre_corto == null) {
			if (other.nombre_corto != null)
				return false;
		} else if (!nombre_corto.equals(other.nombre_corto))
			return false;
		if (objetivos == null) {
			if (other.objetivos != null)
				return false;
		} else if (!objetivos.equals(other.objetivos))
			return false;
		if (quienes_somos == null) {
			if (other.quienes_somos != null)
				return false;
		} else if (!quienes_somos.equals(other.quienes_somos))
			return false;
		if (siglas == null) {
			if (other.siglas != null)
				return false;
		} else if (!siglas.equals(other.siglas))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (vision == null) {
			if (other.vision != null)
				return false;
		} else if (!vision.equals(other.vision))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmpresaModel [correo=" + correo + ", direccion=" + direccion + ", id=" + id + ", mision=" + mision
				+ ", nit=" + nit + ", nombre=" + nombre + ", nombre_corto=" + nombre_corto + ", objetivos=" + objetivos
				+ ", quienes_somos=" + quienes_somos + ", siglas=" + siglas + ", telefono=" + telefono + ", vision="
				+ vision + "]";
	}

	
}
