package edu.dh.materialapp;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

	private String titulo;

	private MainFragment.OnFragmentInteractionListener mListener;
	RecyclerView listaDeFilmes ;
	MyRecyclerAdapter myRecyclerAdapter;

	public MainFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
													 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		listaDeFilmes = view.findViewById(R.id.lstFilmes);
		criarRecyclerView(listaDeFilmes,myRecyclerAdapter);
		return view;
	}


	public void setTxtTituloAba(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	private void criarRecyclerView(RecyclerView listaDeFilmes, MyRecyclerAdapter recyclerAdapter){
		listaDeFilmes.setHasFixedSize(true);

		LinearLayoutManager mLinearLayout = new LinearLayoutManager(getContext());
		listaDeFilmes.setLayoutManager(mLinearLayout);
		listaDeFilmes.setAdapter(recyclerAdapter);
	}

	public void setMyRecyclerAdapter(MyRecyclerAdapter myRecyclerAdapter) {
		this.myRecyclerAdapter = myRecyclerAdapter;
	}

	public interface OnFragmentInteractionListener {
		// TODO: Update argument type and name
		void onFragmentInteraction(Uri uri);
	}

}
