package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MembershipClub extends AppCompatActivity {
    TextView userInfo;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_club);
        userInfo = findViewById(R.id.users_name);
        Intent InfoIntent = getIntent();
        name =  InfoIntent.getStringExtra("user");
        userInfo.setText(name);


    }
    public void BacktoHomePage1(View view) {
        Intent homeIntent3 =  new Intent(this, Home.class);
        startActivity(homeIntent3);
    }
}