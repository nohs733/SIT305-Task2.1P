package com.example.task21p;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerUnit;
    String[] units;
    ArrayAdapter<CharSequence> adapter;

    EditText enterMeters;
    ImageButton convertButton, convertButton2, convertButton3;
    TextView resultTextView, resultTextView2, resultTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerUnit = findViewById(R.id.spinnerUnit);
        populateSpinnerUnit();
        String[] units;

        enterMeters = (EditText)findViewById(R.id.UnitValue);

        resultTextView = (TextView)findViewById(R.id.Centimeter);
        resultTextView2 = (TextView)findViewById(R.id.Foot);
        resultTextView3 = (TextView)findViewById(R.id.Inch);

        convertButton = (ImageButton) findViewById(R.id.ButtonMeter);
        convertButton2 = (ImageButton) findViewById(R.id.ButtonKg);
        convertButton3 = (ImageButton) findViewById(R.id.ButtonTem);


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String unit = spinnerUnit.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, unit + " conversion success" , Toast.LENGTH_SHORT).show();

                double multiple = 39.37;
                double result = 0;

                double multiple2 = 100;
                double result2 = 0;

                double multiple3 = 3.28;
                double result3 = 0;

                if (enterMeters.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);


                } else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());

                    result = meterValue * multiple;
                    result2 = meterValue * multiple2;
                    result3 = meterValue * multiple3;

                    resultTextView.setTextColor(Color.GRAY);
                    resultTextView.setText(String.format("%.2f             ", result) + "Inches");

                    resultTextView2.setTextColor(Color.GRAY);
                    resultTextView2.setText(String.format("%.2f             ", result2) + "Centimeter");

                    resultTextView3.setTextColor(Color.GRAY);
                    resultTextView3.setText(String.format("%.2f             ", result3) + "Foot");
                }
            }
        });

        convertButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String unit = spinnerUnit.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, unit + " conversion success" , Toast.LENGTH_SHORT).show();

                double multiple4 = 1000;
                double result4 = 0;

                double multiple5 = 35.27;
                double result5 = 0;

                double multiple6 = 2.20;
                double result6 = 0;

                if (enterMeters.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);

                } else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());

                    result4 = meterValue * multiple4;
                    result5 = meterValue * multiple5;
                    result6 = meterValue * multiple6;

                    resultTextView.setTextColor(Color.GRAY);
                    resultTextView.setText(String.format("%.2f             ", result4) + "Gram");

                    resultTextView2.setTextColor(Color.GRAY);
                    resultTextView2.setText(String.format("%.2f             ", result5) + "Ounce(Oz)");

                    resultTextView3.setTextColor(Color.GRAY);
                    resultTextView3.setText(String.format("%.2f             ", result6) + "Pound(Ib)");
                }
            }
        });

        convertButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String unit = spinnerUnit.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, unit + " conversion success" , Toast.LENGTH_SHORT).show();

                double multiple7 = 33.8;
                double result7 = 0;

                double multiple8 = 274.15;
                double result8 = 0;

                double result9 = 0;

                if (enterMeters.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);


                } else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());

                    result7 = meterValue * multiple7;
                    result8 = meterValue * multiple8;

                    resultTextView.setTextColor(Color.GRAY);
                    resultTextView.setText(String.format("%.2f             ", result7) + "Fahrenheit");

                    resultTextView2.setTextColor(Color.GRAY);
                    resultTextView2.setText(String.format("%.2f             ", result8) + "Kelvin");

                    resultTextView3.setTextColor(Color.GRAY);
                    resultTextView3.setText(String.format("", result9) + "");
                }
            }
        });

    }

    private void populateSpinnerUnit() {
        ArrayAdapter<String> unitAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.spinner_unit));
        unitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUnit.setAdapter(unitAdapter);
    }
}