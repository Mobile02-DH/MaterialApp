package edu.dh.materialapp;

import java.io.Serializable;

public class FilmeModelo implements Serializable {

	private String titulo;

	public FilmeModelo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
