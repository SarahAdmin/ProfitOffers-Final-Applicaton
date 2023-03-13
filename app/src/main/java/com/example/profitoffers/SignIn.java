package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.EditText;
import android.util.Patterns;
import android.text.TextUtils;


public class SignIn extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);
    }

    void checkUser() {
     if(isEmpty(username)) {
         username.setError("Please Enter your Username");
     }

     if(isEmpty(password)) {
         password.setError("Please Enter your Password");
     }


    }

    boolean isEmpty(EditText LogText) {
        CharSequence str = LogText.getText().toString();
        return TextUtils.isEmpty(str);
    }
    public void BackToHomePage (View view) {
        Intent homeIntent1 = new Intent(this, Home.class);
        startActivity(homeIntent1);
    }

    public void RegisterNow (View view) {
        Intent registerIntent = new Intent(this, TermsandConditions.class);
        startActivity(registerIntent);
    }
    public void ChangeYourPassword (View view) {
        Intent passwordIntent = new Intent(this, ResetPassword.class);
        startActivity(passwordIntent);
    }

    public void SubmitLogin (View view) {
        checkUser();
        Intent logInIntent = getIntent();
        String UserName = username.getText().toString();
        Intent submitIntent = new Intent(this, MembershipClub.class);
        logInIntent.putExtra("user", UserName);
        startActivity(submitIntent);
    }
}