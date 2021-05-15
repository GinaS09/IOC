package com.example.cbir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText name, pass, email, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name= (EditText) findViewById(R.id.et_name);
        pass= (EditText) findViewById(R.id.et_password);
        email= (EditText) findViewById(R.id.et_email);
        repass= (EditText) findViewById(R.id.et_repassword);
    }

    public void clickRegister(View view) {

        String n = name.getText().toString();
        String p = pass.getText().toString();
        String e = email.getText().toString();
        String rp = repass.getText().toString();


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        if (!p.equals(rp)) {
            Toast.makeText(context, "Password is not matched with repass! \n Please insert same pass", duration).show();
        } else if (n.isEmpty() || p.isEmpty() || e.isEmpty()) {
            Toast toast = Toast.makeText(context, "Please enter ALL", duration);
            toast.show();
        } else {
            if (n.equals("oana") || n.equals("gina")) {
                name.startAnimation(AnimationUtils.loadAnimation( this,android.R.anim.fade_in));
                name.setBackgroundColor(Color.parseColor("#ff8080"));
                Toast.makeText(context, "Username  " + n + "already exist ! \n Please insert a new one!", duration).show();
            } else {
                name.setText("");
                email.setText("");
                pass.setText("");
                repass.setText("");
                Toast.makeText(context, "Success" + n, duration).show();

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                setResult(RESULT_OK, intent);
                finish();
            }
        }

         name.setText("");
         email.setText("");
         pass.setText("");
         repass.setText("");
    }

    public void clickGotoLogin(View view) {

            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            setResult(RESULT_OK, intent);
            finish();
        }
//    }
//    }
}