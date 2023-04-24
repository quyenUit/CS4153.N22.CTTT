package com.example.bt_android4_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactActivity extends AppCompatActivity {

    TextView txtNameValue;
    TextView txtEmaiValue;
    TextView txtProjectValue;
    Button finishbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contact);

        txtNameValue = (TextView) findViewById(R.id.tv_name);
        txtEmaiValue = (TextView) findViewById(R.id.tv_email);
        txtProjectValue = (TextView) findViewById(R.id.tv_project);
        finishbtn = (Button) findViewById(R.id.btn);


        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("mybackage");
        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");

        txtNameValue.setText(name);
        txtEmaiValue.setText(email);
        txtProjectValue.setText(project);

        finishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}