package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class PasswordPage extends AppCompatActivity {
    private static final String TAG = PasswordPage.class.getSimpleName();
    private TextView password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_page);
        password2 = findViewById(R.id.Password2);
    }

    public void PasswordLogIn(View v) {
            SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
            SharePreferences.Editor editor = pref.edit();
                    editor.putString("password", password2.getText().toString() )
                    .commit();
        Log.d(TAG, "PasswordLogIn: "+password2.getText().toString());
        PasswordPage.this.setResult(RESULT_OK);
            finish();

    }
}