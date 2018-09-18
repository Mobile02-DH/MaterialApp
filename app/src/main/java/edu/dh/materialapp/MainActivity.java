package edu.dh.materialapp;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inicializarLayout();
	}

	public void inicializarLayout(){
		ViewPager viewPager = findViewById(R.id.viewpager);
		TabLayout tabs = findViewById(R.id.tabs);

		MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
		pagerAdapter.setAbas(GeradorFilmes.gerarAbas(5, "Categoria"));


		viewPager.setAdapter(pagerAdapter);
		tabs.setupWithViewPager(viewPager);

	}

	@Override
	public void onFragmentInteraction(Uri uri) {

	}
}
