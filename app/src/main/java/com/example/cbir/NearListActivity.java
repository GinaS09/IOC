package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NearListActivity extends AppCompatActivity {

    private ImageView cast, bigar,sibiu, sighis, delta, transf, pod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_list);

        pod = (ImageView) findViewById(R.id.pod);
        pod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("PodDumnezeu");
            }
        });
        transf = (ImageView) findViewById(R.id.trans);
        transf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Transfagarasan");
            }
        });
        delta = (ImageView) findViewById(R.id.delta);
        delta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Delta");
            }
        });
    }

    private void openPlaceActivity(String place){
        Intent intent = new Intent(this, PlaceDescriptionActivity.class);
        intent.putExtra("path",place);
        startActivity(intent);
    }

}