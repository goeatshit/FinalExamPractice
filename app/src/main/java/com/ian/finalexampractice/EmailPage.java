package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EmailPage extends AppCompatActivity {
    private TextView email2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_page);
        email2 = findViewById(R.id.Email2);
    }

    public void EmailLogIn(View v) {
        boolean em2b = email2.getText().toString().equals("Dora69@gmail.com");
        if (em2b) {
            Intent intent = new Intent(this, PasswordPage.class);
            startActivity(intent);
        } else {
            finish();
        }
    }
}