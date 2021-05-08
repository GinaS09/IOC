package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 1;

    private Spinner spinnerName = null;
    private ArrayAdapter<String> adapter = null;
    private List<String> names = new ArrayList<>();
    private EditText username;

    private String usernameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.et_email);


        Log.d("MainActivity", "Aplicatia a pornit!");
        Toast.makeText(getApplicationContext(), "Aplicatia a pornit!", Toast.LENGTH_LONG).show();

        SharedPreferences sharedPreferences = getSharedPreferences("names", MODE_PRIVATE);
//        Set<String> namesSet = sharedPreferences.getStringSet("name", null);
//        if(namesSet != null) {
//            names.clear();
//            for(String name : namesSet) {
//                names.add(name);
//            }
//        }

//        spinnerName = findViewById(R.id.spinnerName);
//        adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, names);
//        spinnerName.setAdapter(adapter);

    }


    protected void onDestroy() {
        super.onDestroy();
//
        SharedPreferences sharedPreferences = getSharedPreferences("names", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
//        Set<String> set = new HashSet<>();
//        for(String name : names) {
//            set.add(name);
//        }
//        editor.putStringSet("name", set);
//        editor.commit();
    }

    public void clickLogin(View view) {
        usernameString= username.getText().toString();
        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
        intent.putExtra("username", usernameString);
        startActivity(intent);
    }

    public void clickGotoRegister(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }
}