package com.example.cbir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.cbir.adapters.CommentAdapter;
import com.example.cbir.models.CommentModel;
import com.example.cbir.models.PlaceModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class PlaceDescriptionActivity extends FragmentActivity implements OnMapReadyCallback {

    private TextView title, description;
    private ImageView imageView;
    private RatingBar ratingBar;
    GoogleMap map;
    private float latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_description);

        title = (TextView) findViewById(R.id.title);
        description = (TextView) findViewById(R.id.description);
        imageView = (ImageView) findViewById(R.id.photo);
        ratingBar = (RatingBar) findViewById(R.id.rating);

        String received = getIntent().getStringExtra("path");

        PlaceModel model = new PlaceModel(received);
        latitude = model.latit;
        longitude = model.longit;
        title.setText(model.placeName);
        description.setText(model.placeDesciption);
        ratingBar.setNumStars(5);

        if(received.equals("Cantacuzino")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cast, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("Bigar")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.bigar, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("Sibiu")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.sibiu, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("Sighisoara")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.sighisoara, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("PodDumnezeu")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.pod, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("Transfagarasan")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.trans, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("Delta")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.delta, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("mireasa")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.mireasa, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("cailor")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cai, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("caraiman")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.caraiman, null));
            ratingBar.setRating(model.placeRating);
        }
        else if(received.equals("beusnita")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.beusnita, null));
            ratingBar.setRating(model.placeRating);
        }

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
/*
        List<CommentModel> models = model.comments;

        this.runOnUiThread(()-> {
            CommentAdapter adapter = new CommentAdapter(PlaceDescriptionActivity.this, R.layout.comment_item, models);
            ListView listView = this.findViewById(R.id.commList);
            listView.setAdapter(adapter);
        });*/


        }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
        LatLng coord = new LatLng(latitude,longitude);
        map.addMarker(new MarkerOptions().position(coord).title("Your location"));
        map.moveCamera(CameraUpdateFactory.newLatLng(coord));
    }
}