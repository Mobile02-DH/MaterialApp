package edu.dh.materialapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyViewPagerAdapter extends PagerAdapter{

	private Context mContext;
	MyRecyclerAdapter recyclerAdapter = new MyRecyclerAdapter();
	private final ArrayList<FilmeModelo> sampleData = GeradorFilmes.gerarFilmes(5, "Categoria ");

	public MyViewPagerAdapter(Context context){
		mContext = context;
	}

	@Override
	public Object instantiateItem (ViewGroup collection, int position){
		LayoutInflater inflater = LayoutInflater.from(mContext);
		ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.view_list, collection, false);
		criarRecyclerView(layout);
		collection.addView(layout);

		return layout;
	}

	@Override
	public void destroyItem(ViewGroup collection, int position, Object view){
		collection.removeView((View)view);
	}

	@Override
	public int getCount() {
		return sampleData.size();
	}

	@Override
	public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
		return view == object;
	}

	@Override
	public CharSequence getPageTitle(int position){
		FilmeModelo filmeModelo = sampleData.get(position);

		return filmeModelo.getTitulo();
	}

	public void criarRecyclerView(ViewGroup viewGroup){
		RecyclerView listaDeFilmes = viewGroup.findViewById(R.id.lstFilmes);
		listaDeFilmes.setHasFixedSize(true);

		LinearLayoutManager mLinearLayout = new LinearLayoutManager(mContext);
		listaDeFilmes.setLayoutManager(mLinearLayout);
		listaDeFilmes.setAdapter(recyclerAdapter);
	}

}
