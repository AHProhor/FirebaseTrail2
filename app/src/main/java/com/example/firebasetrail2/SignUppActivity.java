package com.example.firebasetrail2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUppActivity extends AppCompatActivity {
    EditText fullName,userName,email,password,phoneNumber;
    Button signUpButton;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upp);

        fullName = findViewById(R.id.fullNameId);
        userName = findViewById(R.id.userNameId);
        email = findViewById(R.id.emailId);
        password = findViewById(R.id.passwordId);
        phoneNumber = findViewById(R.id.phoneNumberId);

        signUpButton = findViewById(R.id.signUpButtonId);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                reference.setValue("First data storage");

            }
        });
    }
}