package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void clickRegister(View view) {
//        somedatabase
    }

    public void clickGotoLogin(View view) {
//        EditText cityNameEditText = findViewById(R.id.editTextCityName);
//        EditText countyNameEditText = findViewById(R.id.editTextCountryName);
//
//        String city = cityNameEditText.getText().toString();
//        String country = countyNameEditText.getText().toString();

//        if(city.isEmpty() || country.isEmpty()) {
            Toast.makeText(getApplicationContext(), "RegisterPage", Toast.LENGTH_LONG).show();
      //  } else {
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            setResult(RESULT_OK, intent);
            finish();
        }
//    }
//    }
}