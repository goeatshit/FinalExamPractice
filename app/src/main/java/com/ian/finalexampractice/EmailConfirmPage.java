package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EmailConfirmPage extends AppCompatActivity {
  private TextView email2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_main);
        email2 = findViewById(R.id.Email2);
    }
    public void EmailLogIn(View v){
        if(email2.equals("Dora69@gmail.com")){
            Intent intent = new Intent(this,PasswordConfirmPage.class);
            startActivity(intent);
        }else if(!email2.equals("Dora69@gmail.com")){
            finish();
        }
    }

}