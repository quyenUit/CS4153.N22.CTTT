package com.example.bt_android7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.SystemUpdateInfo;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView HISTORY;
    Button button;

    String a;
    String b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        HISTORY = findViewById(R.id.history);
        button = findViewById(R.id.btn);

        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("history");
        a = bundle.getString("input");
        b = bundle.getString("output");
        HISTORY.setText(a+ "=" + b);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}