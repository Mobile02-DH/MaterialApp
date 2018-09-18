package edu.dh.materialapp;

import java.util.ArrayList;

public class GeradorFilmes {

	public static ArrayList<FilmeModelo> gerarFilmes(int quantidade){
		ArrayList<FilmeModelo> lista = new ArrayList<>(quantidade);

		for (int i=1; i < quantidade; i++) {
			lista.add(new FilmeModelo("Filme " + i));
		}

		return lista;
	}
}
