package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.cbir.models.PlaceModel;

import org.w3c.dom.Text;

public class PlacesListActivity extends AppCompatActivity {

    private TextView result, bigarT, caraimanT, mireasaT, caiT, beusnitaT;
    private ImageView bigar,caraiman,mireasa,cai,beusnita;
    private RatingBar bigR, caraiR, mirR, caiR, beuR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);

        String text = getIntent().getStringExtra("search");
        result = (TextView) findViewById(R.id.result);
        result.setText("Results for the word \"" + text + "\"");

        bigarT = (TextView) findViewById(R.id.textBigar);
        caraimanT = (TextView) findViewById(R.id.caraimanText);
        mireasaT = (TextView) findViewById(R.id.mireasaText);
        caiT = (TextView) findViewById(R.id.caiNume);
        beusnitaT = (TextView) findViewById(R.id.beusnitaText);

        bigR = (RatingBar) findViewById((R.id.rbig));
        caraiR = (RatingBar) findViewById((R.id.rcaraiman));
        mirR = (RatingBar) findViewById((R.id.rmireasa));
        caiR = (RatingBar) findViewById((R.id.rcai));
        beuR = (RatingBar) findViewById((R.id.rbeus));

        PlaceModel mBigar = new PlaceModel("Bigar");
        bigarT.setText(mBigar.placeName);
        bigR.setRating(mBigar.placeRating);

        PlaceModel mCarai = new PlaceModel("caraiman");
        caraimanT.setText(mCarai.placeName);
        caiR.setRating(mCarai.placeRating);

        PlaceModel mCai = new PlaceModel("cailor");
        caiT.setText(mCai.placeName);
        caiR.setRating(mCai.placeRating);

        PlaceModel mMirea = new PlaceModel("mireasa");
        mireasaT.setText(mMirea.placeName);
        mirR.setRating(mMirea.placeRating);

        PlaceModel mBeus = new PlaceModel("beusnita");
        beusnitaT.setText(mBeus.placeName);
        beuR.setRating(mBeus.placeRating);


        bigar = (ImageView) findViewById(R.id.bigarImage);
        caraiman = (ImageView) findViewById(R.id.caraimanimage);
        mireasa = (ImageView) findViewById(R.id.mireasa);
        cai = (ImageView) findViewById(R.id.caiImage);
        beusnita = (ImageView) findViewById(R.id.beusnitaImg);

        bigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Bigar");
            }
        });
        caraiman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("caraiman");
            }
        });
        mireasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("mireasa");
            }
        });
        cai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("cailor");
            }
        });
        beusnita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("beusnita");
            }
        });

    }

    private void openPlaceActivity(String place){
        Intent intent = new Intent(this, PlaceDescriptionActivity.class);
        intent.putExtra("path",place);
        startActivity(intent);
    }
}