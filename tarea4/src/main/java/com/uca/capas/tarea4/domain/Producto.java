package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Pattern(regexp="^[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$", message="Ingresa un codigo con exactamente 12 digitos")
	String codigo;
	
	@Size(min=1, max=100, message = "El campo nombre debe tener una longitud entre 1 y 100 caracteres.")
	String nombre;
	
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 caracteres.")
	String marca;
	
	@Size(min=1, max=500, message = "El campo descripción debe tener una longitud entre 1 y 500 caracteres.")
	String descripcion;
	
	@Min(0)
	int existencia;
	
	@Pattern(regexp ="^\\s*(3[01]|[12][0-9]|0?[1-9])\\/(1[012]|0?[1-9])\\/((?:19|20)\\d{2})\\s*$", message="Fecha mal ingresada")
	String fecha;
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getExistencia() {
		return existencia;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
