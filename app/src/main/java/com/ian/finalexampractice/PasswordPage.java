package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class PasswordPage extends AppCompatActivity {
    private TextView password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_page);
        password2 = findViewById(R.id.Password2);
    }

    public void PasswordLogIn(View v) {
        boolean pass2b = password2.getText().toString().equals("dora6699");
        if (pass2b) {
            Intent intent = new Intent(this, LogInSucceedPage.class);
            startActivity(intent);
        } else {
            finish();
        }
    }
}