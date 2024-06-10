package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entrenadores database table.
 * 
 */
@Entity
@NamedQuery(name="Entrenadores.findAll", query="SELECT e FROM Entrenadores e")
public class Entrenadores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellido;

	private int edad;

	private String nacionalidad;

	private String nombre;

	public Entrenadores() {
	}

	public Entrenadores(String apellido, int edad, String nacionalidad, String nombre) {
		super();
		this.apellido = apellido;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
	}

	public Entrenadores(int id, String apellido, int edad, String nacionalidad, String nombre) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Entrenadores [id=" + id + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ ", nombre=" + nombre + "]";
	}

}