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

    public void login(View v){
        boolean nameb=name.getText().toString().equals("Dora");
        boolean emb =email.getText().toString().equals("Dora69@gmail.com");
        boolean passb = password.getText().toString().equals("dora6699");
        if(nameb&&emb&&passb){
            Intent intent = new Intent(this,NamePage.class);
            startActivity(intent);

        }else{
            finish();
        }
}
}