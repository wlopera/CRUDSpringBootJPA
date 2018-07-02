package com.wlopera.crud.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private BigDecimal cantidad;
	
	public Product() {}

	public Product(String nombre, BigDecimal cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Product(int id, String nombre, BigDecimal cantidad) {
		this(nombre, cantidad);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}

}
