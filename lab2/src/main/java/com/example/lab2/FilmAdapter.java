package com.example.lab2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;




public class FilmAdapter extends BaseAdapter {

    private String[] genres = Resources .getSystem().getStringArray(R.array.film_genre);
    private String[] years = Resources.getSystem().getStringArray(R.array.film_years);
    private String[] names = Resources.getSystem().getStringArray(R.array.film_name_list);
    private int[] posters = Resources.getSystem().getIntArray(R.array.film_posters);
    LayoutInflater  lInflater;

    public FilmAdapter(Context context) {
        this.lInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return genres.length;
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
        View view = lInflater.inflate(R.layout.film_item, parent, false);

        ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView filmName = (TextView)view.findViewById(R.id.film_name);
        TextView filmGenre = (TextView)view.findViewById(R.id.genre);
        TextView filmYear = (TextView)view.findViewById(R.id.year);

        imageView.setImageResource(posters[position]);
        filmGenre.setText(genres[position]);
        filmName.setText(names[position]);
        filmYear.setText(years[position]);

        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
