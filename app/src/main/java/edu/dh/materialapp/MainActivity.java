package edu.dh.materialapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

	MyRecyclerAdapter recyclerAdapter = new MyRecyclerAdapter();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		criarRecyclerView();
	}

	public void criarRecyclerView(){
		RecyclerView listaDeFilmes = findViewById(R.id.lstFilmes);
		listaDeFilmes.setHasFixedSize(true);

		LinearLayoutManager mLinearLayout = new LinearLayoutManager(this);
		listaDeFilmes.setLayoutManager(mLinearLayout);
		listaDeFilmes.setAdapter(recyclerAdapter);
	}

}
