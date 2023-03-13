package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.EditText;
import android.text.TextUtils;
import android.util.Patterns;

public class ResetPassword extends AppCompatActivity {
    EditText newPasswordOne;
    EditText newPasswordTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        newPasswordOne = (EditText) findViewById(R.id.new_password_input);
        newPasswordTwo = (EditText) findViewById(R.id.confirm_new_password_input);
    }
    void newPasswordChecked() {
        if(isEmpty(newPasswordOne)) {
            newPasswordOne.setError("Please enter your new password.");
        }
        if(isEmpty(newPasswordTwo)) {
            newPasswordTwo.setError("Please Try Again");
        }

    }
    boolean isEmpty(EditText passwordTextOne) {
        CharSequence passwd = passwordTextOne.getText().toString();
        return TextUtils.isEmpty(passwd);
    }

    public void SubmitNewPassword (View view) {
        newPasswordChecked();
        Toast.makeText(this, "Your Password Changed.", Toast.LENGTH_LONG);
        Intent passwordIntentOne = new Intent(this,SignIn.class);
        startActivity(passwordIntentOne);
    }

}