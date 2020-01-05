package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView name;
    private TextView email;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
    }

    public void LogIn(View v){
    if("Dora".equals(name)&&"Dora69@gmail.com".equals(email)&&"dora6699".equals(password)){
        Intent intent = new Intent(this,NameConfirmPage.class);
        startActivity(intent);
    }else if(!"Dora".equals(name)||!"Dora69@gmail.com".equals(email)||!"dora6699".equals(password)){
        finish();
    }
}
}