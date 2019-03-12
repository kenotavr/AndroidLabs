package com.example.lab2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class FilmAdapter extends BaseAdapter {

    private ArrayList<String> genres = new ArrayList<>();
    private ArrayList<String> years = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Drawable> posters = new ArrayList<>();
    LayoutInflater lInflater;

    public FilmAdapter(Context context) {
        String[] tempGenres = context.getResources().getStringArray(R.array.film_genre);
        String[] tempYears = context.getResources().getStringArray(R.array.film_years);
        String[] tempNames =  context.getResources().getStringArray(R.array.film_name_list);
        for (int i = 0; i < tempGenres.length; i++) {
            genres.add(tempGenres[i]);
            years.add(tempYears[i]);
            names.add(tempNames[i]);

        }

        TypedArray typedArray = context.getResources().obtainTypedArray(R.array.film_posters);
        for (int i = 0; i < typedArray.length(); i++) {
            posters.add(typedArray.getDrawable(i));
        }
        this.lInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return genres.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView = lInflater.inflate(R.layout.film_item, parent, false);
        }


        ImageView imageView = (ImageView) convertView.findViewById(R.id.poster);
        TextView filmName = (TextView) convertView.findViewById(R.id.film_name);
        TextView filmGenre = (TextView) convertView.findViewById(R.id.genre);
        TextView filmYear = (TextView) convertView.findViewById(R.id.year);

        imageView.setImageDrawable(posters.get(position));
        filmGenre.setText(genres.get(position));
        filmName.setText(names.get(position));
        filmYear.setText(years.get(position));

        return convertView;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }
}
