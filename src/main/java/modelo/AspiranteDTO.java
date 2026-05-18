package modelo;

import java.io.Serializable;

public class AspiranteDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String identificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String programaInteres;


    public AspiranteDTO() {
    }


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getProgramaInteres() {
		return programaInteres;
	}


	public void setProgramaInteres(String programaInteres) {
		this.programaInteres = programaInteres;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
