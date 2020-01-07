package com.ian.finalexampractice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int RESQUEST_CODE = 9487;
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView name;
    private TextView email;
    private TextView password;
    private String a;
    private String b;
    private String c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);

    }

    public void login(View v) {
        Log.d(TAG, "login: ");
        //     boolean nameb = name.getText().toString().equals("Dora");
        //     boolean emb = email.getText().toString().equals("Dora69@gmail.com");
        //    boolean passb = password.getText().toString().equals("dora6699");
        String n = name.getText().toString();
        String e = email.getText().toString();
        String p = password.getText().toString();
        Log.d("Ding", "login: "+n+","+e+","+p+","+a+","+b+","+c);

        if (n.equals("") && e.equals("") && p.equals("")) {
            Intent intent = new Intent(this, NamePage.class);
            startActivityForResult(intent, RESQUEST_CODE);
        }else{
            Intent intent = new Intent(this, LogInSucceedPage.class);
            startActivity(intent);

            Log.d("Ding", "login: "+n+","+e+","+p+","+a+","+b+","+c);

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==RESQUEST_CODE){
            if (resultCode==RESULT_OK){
                SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
                a = pref.getString("name","");
                b = pref.getString("email","");
                c = pref.getString("password","");
                Log.d(TAG, "onActivityResult: "+ a +"/"+ b +"/"+ c);
                name.setText(a);
                email.setText(b);
                password.setText(c);

            }
        }
    }

}




