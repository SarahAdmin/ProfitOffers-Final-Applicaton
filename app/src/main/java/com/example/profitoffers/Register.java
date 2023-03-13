package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.text.TextUtils;
import android.util.Patterns;

public class Register extends AppCompatActivity {
    EditText FirstName;
    EditText LastName;
    EditText Email;
    EditText PhoneNo;
    EditText StreetNo;
    EditText AddLine1;
    EditText AddLine2;
    EditText Town;
    EditText County;
    EditText Postcode;
    EditText Passwd1;
    EditText Passwd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        FirstName = findViewById(R.id.fn_input);
        LastName = findViewById(R.id.ln_input);
        Email = findViewById(R.id.email_input);
        PhoneNo = findViewById(R.id.phone_no);
        StreetNo = findViewById(R.id.street_number_input);
        AddLine1 = findViewById(R.id.address_input_one);
        AddLine2 = findViewById(R.id.address_input_two);
        Town = findViewById(R.id.town_input);
        County = findViewById(R.id.county_input);
        Postcode = findViewById(R.id.postcode_input);
        Passwd1 = findViewById(R.id.password_input_1);
        Passwd2 = findViewById(R.id.password_input_2);
    }
    public void ChooseAMembershipCard(View view) {
        checkInfoSubmitted();
        Intent memberIntentOne = new Intent(this, ChooseACard.class);
        startActivity(memberIntentOne);
    }
    public void backToTermsAndConditions (View view) {
        Intent TCIntent = new Intent (this, TermsandConditions.class);
        startActivity(TCIntent);
    }
    boolean isEmailAddress(EditText textOne) {
        CharSequence Email = textOne.getText().toString();
        return (!TextUtils.isEmpty(Email) && Patterns.EMAIL_ADDRESS.matcher(Email).matches());
    }
    boolean isEmpty(EditText textTwo) {
        CharSequence str = textTwo.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkInfoSubmitted() {
        if (isEmpty(FirstName)) {
            Toast t1 = Toast.makeText(this, "You must enter your forename to sign up", Toast.LENGTH_LONG);
        }
        if (isEmpty(LastName)) {
            LastName.setError("Enter your surname.");
        }
        if (isEmpty(PhoneNo)) {
            PhoneNo.setError("Enter your phone number.");
        }
        if (isEmpty(StreetNo)) {
            StreetNo.setError("Enter your street number.");
        }
        if (isEmpty(AddLine1)) {
            AddLine1.setError("Enter your address.");
        }
        if (isEmpty(AddLine2)) {
            AddLine2.setError("Enter your address.");
        }
        if (isEmpty(Postcode)) {
            Postcode.setError("Enter your postcode.");
        }
        if (isEmpty(Passwd1)) {
            Passwd1.setError("Please Try Again");
        }
        if (isEmpty(Passwd2)) {
            Passwd2.setError("Please Try Again");
        }
        if (isEmailAddress(Email) == false) {
            Email.setError("Please enter your valid email.");
        }

    }
}