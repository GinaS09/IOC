package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    private String receivedUsername;
    private ImageView cast, bigar,sibiu, sighis, delta, transf, pod;
    private TextView textHi;
    private EditText searchText;

    Spinner spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final List<String> variante=new ArrayList<>();
        variante.add("Varianta 1: 5km");
        variante.add("Varianta 2: 10km");
        variante.add("Varianta 3: 15km");
        variante.add("Varianta 4: 20km");
        variante.add("Varianta 5: 25km");

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        spin = findViewById(R.id.spinnerl);
        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter<String> aa = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,variante);
        //Setting the ArrayAdapter data on the Spinner
        aa.notifyDataSetChanged();

        spin.setAdapter(aa);



        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        HomePageActivity.this,
                        "Ati ales:"+variante.get(position),
                        Toast.LENGTH_SHORT
                ).show();

                if(variante.get(position).equals("Varianta 4: 20km")
                || variante.get(position).equals("Varianta 4: 10km")
                || variante.get(position).equals("Varianta 4: 25km")) {
                    Intent intent = new Intent(HomePageActivity.this, NearListActivity.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(HomePageActivity.this, "Nu ati ales nimic", Toast.LENGTH_SHORT).show();
            }
        });


        //////////////

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

    public void clicknear(View view) {
        Intent intent =new Intent(this, NearListActivity.class);
        startActivity(intent);

    }
}