package edu.dh.materialapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	private ArrayList<MainFragment> abas = new ArrayList<>();

	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public MainFragment getItem(int position) {
		return abas.get(position);
	}

	@Override
	public int getCount() {
		return abas.size();
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return abas.get(position).getTitulo();
	}

	public void setAbas(ArrayList<MainFragment> abas) {
		this.abas = abas;
	}
}
