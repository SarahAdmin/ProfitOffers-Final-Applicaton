package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.os.Build;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.TextView;
import com.google.firebase.storage.FirebaseStorage;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.content.pm.PackageManager;




public class ProofAddress extends AppCompatActivity {
TextView TextOne;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proof_address);
    }



    public void backToMembership (View view) {
        Intent MembershipIntent = new Intent(this, ChooseACard.class);
        startActivity(MembershipIntent);
    }
    public void NextPayment (View view) {
        Intent PaymentIntent = new Intent (this, PaymentDetails.class);
        startActivity(PaymentIntent);
    }
}