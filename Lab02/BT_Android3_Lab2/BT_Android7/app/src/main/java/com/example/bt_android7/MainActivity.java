package com.example.bt_android7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.util.Log;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {


    String finalResult="";
    TextView inputtxt, outPuttxt;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    Button btn_his, btn_ac, btn_power, btn_back, btn_dot, btn_equal, btn_ans, btn_plus, btn_minus, btn_multiplication, btn_divi;

    Button btn_wearther, btn_api;
    String data="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_wearther = (Button) findViewById(R.id.weather);
        btn_api = findViewById(R.id.api1);

        btn_api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i);
            }
        });


        btn_wearther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(MainActivity.this, MainActivity3.class);
              startActivity(i);
            }
        });

        outPuttxt = (TextView) findViewById(R.id.outPuttxt);
        inputtxt = (TextView) findViewById(R.id.inputTxt);
        btn_his = (Button) findViewById(R.id.histo);

        btn_0 = (Button) findViewById(R.id.zero);
        btn_1 = (Button) findViewById(R.id.one);
        btn_2 = (Button) findViewById(R.id.two);
        btn_3 = (Button) findViewById(R.id.three);
        btn_4 = (Button) findViewById(R.id.four);
        btn_5 = (Button) findViewById(R.id.five);
        btn_6 = (Button) findViewById(R.id.six);
        btn_7 = (Button) findViewById(R.id.seven);
        btn_8 = (Button) findViewById(R.id.eight);
        btn_9 = (Button) findViewById(R.id.nine);

        btn_ac = (Button) findViewById(R.id.ac);
        btn_ans = (Button) findViewById(R.id.ans);
        btn_power = (Button) findViewById(R.id.power);
        btn_back = (Button) findViewById(R.id.back);
        btn_plus = (Button) findViewById(R.id.plus);
        btn_minus = (Button) findViewById(R.id.min);
        btn_multiplication = (Button) findViewById(R.id.mul);
        btn_divi = (Button) findViewById(R.id.div);
        btn_dot = (Button) findViewById(R.id.point);
        btn_equal = (Button) findViewById(R.id.equal);


        btn_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                SharedPreferences myprefs = getSharedPreferences("mysave", MODE_PRIVATE);
                String a = myprefs.getString("data", "");
                String b = myprefs.getString("result", "");
                Bundle bundle = new Bundle();
                bundle.putString("input", a);
                bundle.putString("output", b);
                i.putExtra("history", bundle);
                startActivity(i);
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "9");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data="";
                inputtxt.setText(data);
                outPuttxt.setText(data);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + ".");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "-");
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "*");
            }
        });

        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();
                inputtxt.setText(data + "/");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtxt.getText().toString();

                data=data.replaceAll("x", "*");
                data=data.replaceAll("%", "/100");
                data=data.replaceAll("÷","/");
                Context rhino= Context.enter();
                rhino.setOptimizationLevel(-1);

//                String finalResult="";

                Scriptable scriptable=rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javsscript",1,null).toString();
                outPuttxt.setText(finalResult);
            }
        });

//        buttonListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button bt = (Button) v;
//                switch (bt.getId()) {
//                    case R.id.zero:
//                        setvalue(outPuttxt, "0");
//                        break;
//                    case R.id.one:
//                        setvalue(outPuttxt, "1");
//                        break;
//                    case R.id.two:
//                        setvalue(outPuttxt, "2");
//                        break;
//                    case R.id.three:
//                        setvalue(outPuttxt, "3");
//                        break;
//                    case R.id.four:
//                        setvalue(outPuttxt, "4");
//                        break;
//                    case R.id.five:
//                        setvalue(outPuttxt, "5");
//                        break;
//                    case R.id.six:
//                        setvalue(outPuttxt, "6");
//                        break;
//                    case R.id.seven:
//                        setvalue(outPuttxt, "7");
//                        break;
//                    case R.id.eight:
//                        setvalue(outPuttxt, "8");
//                        break;
//                    case R.id.nine:
//                        setvalue(outPuttxt, "9");
//                        break;
//                    case R.id.plus:
//                        operation= "plus";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.min:
//                        operation= "min";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.mul:
//                        operation= "mul";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.div:
//                        operation= "div";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.power:
//                        operation= "power";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.ac:
//                        operation= "ac";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.back:
//                        operation= "back";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.point:
//                        operation= "point";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                    case R.id.equal:
//                        operation= "equal";
//                        lastvalue = Integer.parseInt(outPuttxt.getText().toString());
//                        resetvalue();
//                        break;
//                }
//
//                btn_0.setOnClickListener(buttonListener);
//                btn_1.setOnClickListener((buttonListener));
//                btn_2.setOnClickListener((buttonListener));
//                btn_3.setOnClickListener((buttonListener));
//                btn_4.setOnClickListener((buttonListener));
//                btn_5.setOnClickListener((buttonListener));
//                btn_6.setOnClickListener((buttonListener));
//                btn_7.setOnClickListener((buttonListener));
//                btn_8.setOnClickListener((buttonListener));
//                btn_9.setOnClickListener((buttonListener));
//                btn_ac.setOnClickListener((buttonListener));
//                btn_ans.setOnClickListener((buttonListener));
//                btn_power.setOnClickListener((buttonListener));
//                btn_back.setOnClickListener((buttonListener));
//                btn_plus.setOnClickListener((buttonListener));
//                btn_minus.setOnClickListener((buttonListener));
//                btn_multiplication.setOnClickListener((buttonListener));
//                btn_divi.setOnClickListener((buttonListener));
//                btn_dot.setOnClickListener((buttonListener));
//                btn_equal.setOnClickListener((buttonListener));
//
//            }
//
//
//
//            private void setvalue(TextView a, String b) {
//                String last = a.getText().toString();
//                if (!last.equals("0")){
//                    last += b;
//                    b=last;
//                }
//                a.setText(b);
//            }
//            private void resetvalue() {
//                outPuttxt.setText("0");
//            }
//
//            public Integer process(Integer a, Integer b) {
//                Integer presult = 0;
//                if(operation == "plus"){
//                    presult = a + b;
//                    outPuttxt.setText(presult.toString());
//                }
//                if (operation == "min"){
//                    presult = a - b;
//                    outPuttxt.setText(presult.toString());
//                }
//                if (operation == "mul"){
//                    presult = a * b;
//                    outPuttxt.setText(presult.toString());
//                }
//                if (operation == "div"){
//                    presult = a / b;
//                    outPuttxt.setText(presult.toString());
//                }
//                return presult;
//            }
//
//        };
        }

    protected void onPause() {
        super.onPause();
        SharedPreferences myprefs = getSharedPreferences("mysave", MODE_PRIVATE);
        SharedPreferences.Editor myedit = myprefs.edit();
        myedit.putString("data", data);
        myedit.putString("result", finalResult);
        myedit.commit();
    }
}





