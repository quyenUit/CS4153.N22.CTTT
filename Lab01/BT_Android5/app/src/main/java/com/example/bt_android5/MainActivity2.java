package com.example.bt_android5;

import static com.example.bt_android5.R.id.history;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView history;
    String lishsu ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        history = (TextView) findViewById(R.id.history);
        SharedPreferences myprefs =
                getSharedPreferences("mysave", MODE_PRIVATE);
        String a = myprefs.getString("sol", "");
        String b = myprefs.getString("ls", "");
        lishsu =  a + b;
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        history.setText(lishsu);

    }
}