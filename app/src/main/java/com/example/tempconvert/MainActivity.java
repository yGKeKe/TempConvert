package com.example.tempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button butConvertToCelsius;
    private Button butconvertToFahrenheit;
    private EditText editFahrenheit;
    private EditText editCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butConvertToCelsius = findViewById(R.id.butConvertToCelsius);
        butconvertToFahrenheit = findViewById(R.id.butConvertToFahrenheit);
        editCelsius = findViewById(R.id.editCelsius);
        editFahrenheit = findViewById(R.id.editFahrenheit);
    }

    public void clickConvertToCelsius(View view){
        double fahValue = Double.parseDouble(editFahrenheit.getText().toString());
        double celValue = (fahValue-32) * (5.0/9.0);
        editCelsius.setText(celValue+"");
    }

    public void clickConvertToFahrenheit(View view){
        double celValue = Double.parseDouble(editCelsius.getText().toString());
        double fahValue = (celValue * (9.0/5.0)) + 32;
        editFahrenheit.setText(fahValue+"");
    }
}
