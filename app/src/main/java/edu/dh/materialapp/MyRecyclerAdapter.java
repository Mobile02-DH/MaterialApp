package edu.dh.materialapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{

	private final ArrayList<FilmeModelo> filmeData = GeradorFilmes.gerarFilmes(20, "Filme ");

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View novaView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.filme_item, parent, false);

		return new ViewHolder(novaView);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		final FilmeModelo filme = filmeData.get(position);

		holder.txtTitulo.setText(filme.getTitulo());

		holder.itemView.setTag(filme);
	}

	@Override
	public int getItemCount() {
		return filmeData.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		private final TextView txtTitulo;

		public ViewHolder(View itemView){
			super(itemView);
			txtTitulo = itemView.findViewById(R.id.txtTitulo);
		}
	}
}
