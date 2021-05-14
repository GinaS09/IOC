package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomePageActivity extends AppCompatActivity {

    private String receivedUsername;
    private ImageView cast, bigar,sibiu, sighis, delta, transf, pod;
    private TextView textHi;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        searchText = (EditText) findViewById(R.id.search);
        receivedUsername = getIntent().getStringExtra("username");
        textHi = (TextView) findViewById(R.id.hiText);
        textHi.setText("Hi, "+ receivedUsername+"!");

        cast = (ImageView) findViewById(R.id.imageCast);
        cast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Cantacuzino");
            }
        });
        bigar = (ImageView) findViewById(R.id.bigar);
        bigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Bigar");
            }
        });
        sibiu = (ImageView) findViewById(R.id.sibiu);
        sibiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Sibiu");
            }
        });
        sighis = (ImageView) findViewById(R.id.sighis);
        sighis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaceActivity("Sighisoara");
            }
        });
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

        searchText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    performSearch();
                    return true;
                }
                return false;
            }
        });

    }
    private void openPlaceActivity(String place){
        Intent intent = new Intent(this, PlaceDescriptionActivity.class);
        intent.putExtra("path",place);
        startActivity(intent);
    }

    private void performSearch(){
        String searched = searchText.getText().toString();
        Intent intent = new Intent(this, PlacesListActivity.class);
        intent.putExtra("search",searched);
        startActivity(intent);
    }
}