package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NamePage extends AppCompatActivity {
    private TextView name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_page);
        name2 = findViewById(R.id.Name2);

    }

    public void NameLogIn(View v) {
        boolean name2b = name2.getText().toString().equals("Dora");
        if (name2b) {
            Intent intent = new Intent(this, EmailPage.class);
            startActivity(intent);
        } else {
            finish();
        }
    }
}