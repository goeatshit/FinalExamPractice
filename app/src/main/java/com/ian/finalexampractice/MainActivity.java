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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);

    }

    public void login(View v) {
        //     boolean nameb = name.getText().toString().equals("Dora");
        //     boolean emb = email.getText().toString().equals("Dora69@gmail.com");
        //    boolean passb = password.getText().toString().equals("dora6699");
        if (name.getText().toString().equals("") && email.getText().toString().equals("") && password.getText().toString().equals("")) {
            Intent intent = new Intent(this, NamePage.class);
            startActivityForResult(intent, RESQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode==RESQUEST_CODE){
            if (resultCode==RESULT_OK){
                SharedPreferences pref = getSharedPreferences("test", Context.MODE_PRIVATE);
                String a = pref.getString("name","");
                String b = pref.getString("email","");
                String c =pref.getString("password","");
                Log.d(TAG, "onActivityResult: "+a+b+c);
                name.setText(a);
                email.setText(b);
                password.setText(c);
            }
        }
    }
}



  //      }else{
   //         finish();
   //     }
//}
