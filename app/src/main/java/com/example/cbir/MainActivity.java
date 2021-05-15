package com.example.cbir;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
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
    private EditText username,pass;
    private TextView title;

    private String usernameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.et_user);
        pass = (EditText)findViewById(R.id.et_password);

        title = findViewById(R.id.tv_title);


        Log.d("MainActivity", "Aplicatia a pornit!");
        Toast.makeText(getApplicationContext(), "Aplicatia a pornit!", Toast.LENGTH_LONG).show();





    }


    protected void onDestroy() {
        super.onDestroy();
    }

    public void clickLogin(View view) {
        usernameString= username.getText().toString();
        if (usernameString.equals("oana") || usernameString.equals("gina") || usernameString.equals("maria")) {
            Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
            intent.putExtra("username", usernameString);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Wrong Credentials! \n Login Fail !", Toast.LENGTH_LONG).show();
            username.setText("");
            pass.setText("");

            username.startAnimation(AnimationUtils.loadAnimation( this,android.R.anim.fade_in));
            pass.startAnimation(AnimationUtils.loadAnimation( this,android.R.anim.fade_in));

            username.setBackgroundColor(Color.parseColor("#ff8080"));
            pass.setBackgroundColor(Color.parseColor("#ff9999"));

        }
    }

    public void clickGotoRegister(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }
}