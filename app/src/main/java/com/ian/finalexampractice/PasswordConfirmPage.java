package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class PasswordConfirmPage extends AppCompatActivity {
    private TextView password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_main);
        password2 = findViewById(R.id.Password2);
    }
    public void PasswordLogIn(View v){
        if(password2.equals("dora6699")){
            Intent intent = new Intent(this,LogInSucceed.class);
            startActivity(intent);
        }else if(!password2.equals("dora6699")){
            finish();
        }
    }


}