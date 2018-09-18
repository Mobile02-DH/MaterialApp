package edu.dh.materialapp;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

public class GeradorFilmes {

	public static ArrayList<FilmeModelo> gerarFilmes(int quantidade, String nome){
		ArrayList<FilmeModelo> lista = new ArrayList<>(quantidade);

		for (int i=1; i < quantidade; i++) {
			lista.add(new FilmeModelo(nome + i));
		}

		return lista;
	}

	public static ArrayList<MainFragment> gerarAbas(int quantidade, String nome){
		ArrayList<MainFragment> lista = new ArrayList<>(quantidade);

		for (int i=1; i < quantidade; i++) {
			MainFragment mainFragment = new MainFragment();
			mainFragment.setTxtTituloAba(nome + i);
			mainFragment.setMyRecyclerAdapter(new MyRecyclerAdapter());
			lista.add(mainFragment);
		}

		return lista;
	}
}
