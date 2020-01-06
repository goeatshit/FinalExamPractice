package com.ian.finalexampractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class EmailPage extends AppCompatActivity {
    private static final String TAG = EmailPage.class.getSimpleName();
    private TextView email2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_page);
        email2 = findViewById(R.id.Email2);
    }

    public void EmailLogIn(View v) {
            SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
            SharePreferences.Editor editor = pref.edit();
                    editor.putString("email", email2.getText().toString() )
                    .commit();
        Log.d(TAG, "EmailLogIn: "+email2.getText().toString());
            Intent intent = new Intent(this, PasswordPage.class);
            startActivity(intent);
            EmailPage.this.setResult(RESULT_OK);
            finish();

    }
}