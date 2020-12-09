package com.example.firebasetrail2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText userName,phoneNumber,passWord;
    Button loginButton,signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.userNameId);
        phoneNumber = findViewById(R.id.phoneNumberId);
        passWord = findViewById(R.id.passwordId);
        loginButton = findViewById(R.id.loginButtonId);
        signUpButton = findViewById(R.id.signUpButtonId);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SignUppActivity.class);
                //intent.putExtra();
                startActivity(intent);
            }
        });
    }
}