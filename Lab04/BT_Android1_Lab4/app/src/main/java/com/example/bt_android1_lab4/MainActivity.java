package com.example.bt_android1_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button) findViewById(R.id.readData);
        final EditText editdata = (EditText) findViewById(R.id.edt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data;
                InputStream in = getResources().openRawResource(R.raw.myfile);
                InputStreamReader inreader = new InputStreamReader(in);
                BufferedReader bufreader = new BufferedReader(inreader);
                StringBuilder builder = new StringBuilder();
                if (in!=null){
                    try {
                        while ((data=bufreader.readLine())!=null){
                            builder.append(data);
                            builder.append("\n");
                        }
                        in.close();
                        editdata.setText(builder.toString());
                    }
                    catch (IOException ex){
                        Log.e("ERROR", ex.getMessage());
                    }
                }
            }
        });
    }
}