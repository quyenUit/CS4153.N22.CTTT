package com.example.bt_android4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.edt);
        final AlertDialog alert_dialog = new AlertDialog.Builder(this).create();

        // viet xu ly edittext
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                //
                if (keyEvent.getAction() ==KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_DPAD_CENTER)
                {
                    String message= editText.getText().toString();
                    alert_dialog.setMessage(message);
                    alert_dialog.show();

                    return true;
                }
                return false;
            }
        });
    }
}