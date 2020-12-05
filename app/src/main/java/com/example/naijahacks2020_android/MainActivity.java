package com.example.naijahacks2020_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button SigninButton;
    private Button SignUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SigninButton = findViewById(R.id.signInBtn);
        SignUpButton = findViewById(R.id.signUpbtn);

        SigninButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent termsofservice = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(termsofservice);
            }
        });

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent termsofservice = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(termsofservice);
            }
        });
    }
}
