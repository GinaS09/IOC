package com.example.cbir.adapters;

import android.app.Activity;
import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.cbir.R;

public class HomeAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] descriere;
    private final Integer[] imgid;

    public HomeAdapter(Activity context, String[] maintitle,String[] descriere,Integer[] imgid) {
        super(context, R.layout.obiect_turistic, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.imgid=imgid;
        this.descriere=descriere;

    }

    public View getView(int position,View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.obiect_turistic, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.titlu);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView descText = (TextView) rowView.findViewById(R.id.descriere);
        RatingBar ratingBar = (RatingBar) rowView.findViewById(R.id.ratingBar);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        descText.setText(descriere[position]);
        ratingBar.setNumStars(5);

        return rowView;

    };
}
