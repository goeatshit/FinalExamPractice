package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NameConfirmPage extends AppCompatActivity {
    private  TextView name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_main);
        name2 = findViewById(R.id.Name2);

    }
    public void NameLogIn (View v){
        if(name2.equals("Dora")){
            Intent intent = new Intent(this,EmailConfirmPage.class);
            startActivity(intent);
        }else if(!name2.equals("Dora")){
            finish();
        }
    }
}