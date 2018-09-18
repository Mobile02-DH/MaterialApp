package edu.dh.materialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		FilmeModelo filme = (FilmeModelo) getIntent().getSerializableExtra("filme");
		TextView txt = findViewById(R.id.txtTituloDetalhe);

		txt.setText(filme.getTitulo());
	}

}
