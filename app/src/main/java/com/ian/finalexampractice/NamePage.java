package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class NamePage extends AppCompatActivity {
    private static final String TAG = NamePage.class.getSimpleName();
    private TextView name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_page);
        name2 = findViewById(R.id.Name2);

    }

    public void NameLogIn(View v) {

            SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
                    editor.putString("name", name2.getText().toString())
                    .commit();
            Log.d(TAG, "NameLogIn: "+name2.getText().toString());
            Intent intent = new Intent(this, EmailPage.class);
            startActivity(intent);
            NamePage.this.setResult(RESULT_OK);
            finish();
        }

    }
