package com.aprende.rest.webservice.restfulwebservices.model;

import java.util.Date;

public class User {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fecNacimiento;
	
	public User(Integer id, String nombre, String apellido, Date fecNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecNacimiento = fecNacimiento;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	
	@Override
	public String toString() {
		return "user [nombre=" + nombre + ", apellido=" + apellido + ", fecNacimiento=" + fecNacimiento + "]";
	}
	
	
}
