package com.josephgasper.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view) {
        EditText cajaConNombre = (EditText) findViewById(R.id.nametext);
        Log.i("Saludo",cajaConNombre.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
