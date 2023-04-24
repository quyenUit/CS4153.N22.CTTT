package com.example.bt_android7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity3 extends AppCompatActivity {

    EditText et;
    TextView tv;
    String url = "api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key}";
    String apikey = "fcd2c236893559071f53147e2c72132f";
    LocationManager manager;
    LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv);
    }
    public void getweather(View v) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherapi myapi = retrofit.create(weatherapi.class);
        Call<Example> examplecall = myapi.getweather(et.getText().toString().trim(), apikey);
        examplecall.enqueue(new Callback<Example>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(@NonNull Call<Example> call, @NonNull Response<Example> response) {
                if (response.code() == 404) {
                    Toast.makeText(MainActivity3.this, "Please Enter a valid City", Toast.LENGTH_LONG).show();
                } else if (!(response.isSuccessful())) {
                    Toast.makeText(MainActivity3.this, response.code() + " ", Toast.LENGTH_LONG).show();
                    return;
                }
                Example mydata = response.body();
                assert mydata != null;
                Main main = mydata.getMain();
                Double temp = (main).getTemp();
                Integer temperature = (int) (temp - 273.15);
                tv.setText(temperature + "C");
            }

            @Override
            public void onFailure(@NonNull Call<Example> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity3.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}






