package com.example.bt_android4_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_name, edt_email, edt_project;
    Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_project = findViewById(R.id.edt_project);
        btnView = findViewById(R.id.btn);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactActivity.class);
                Bundle bundle = new Bundle();
                String name = edt_name.getText().toString();
                String email = edt_email.getText().toString();
                String project = edt_project.getText().toString();
                bundle.putString("nameKey", name);
                bundle.putString("emailKey",email);
                bundle.putString("projectKey", project);
                iGetContactInfo.putExtra("mybackage", bundle);
                startActivity(iGetContactInfo);
            }
        });
    }





}