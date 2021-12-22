package com.aprende.rest.webservice.restfulwebservices.controller;

public class SaludarBean {
	
	private String mensaje;

	public SaludarBean(String mensaje) {
		this.mensaje = mensaje;
		
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "SaludarBean [mensaje=" + mensaje + "]";
	}

}
