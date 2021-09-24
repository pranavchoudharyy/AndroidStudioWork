package com.example.incometax_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView PA;
    TextView Interest_Rate;
    TextView Years;
    EditText PA_bar;
    EditText IR_bar;
    Button calculate;
    TextView t1;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PA = (TextView) findViewById(R.id.PA);
        Interest_Rate = (TextView) findViewById(R.id.Interest_Rate);
        Years = (TextView) findViewById(R.id.Years);
        PA_bar = (EditText) findViewById(R.id.PA_bar);
        IR_bar = (EditText) findViewById(R.id.IR_bar);
        calculate = (Button) findViewById(R.id.calculate);
        t1 = (TextView) findViewById(R.id.t1);
        reset = (Button) findViewById(R.id.reset);


        calculate.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View v) {
                                             double num1 = Double.parseDouble(PA_bar.getText().toString());
                                             double num2 = Double.parseDouble(IR_bar.getText().toString());
                                             double num3 = num1 - num2-500000;
                                             double num4 = 500000;
                                             double num5 = num1 - num2- 1000000;
                                             if (num1 <= 500000) {
                                                 t1.setText("NO TAX , ThankYou!!!");
                                             } else if (num1 <= 1000000) {
                                                 double tax = 20 * num3 / 100 + 4 * num2 / 100;
                                                 t1.setText(Double.toString(tax));
                                             } else if (num1 > 1000000) {
                                                 double tax = 30 * num5/ 100 + 20*num4/100+ 4* num2 / 100;
                                                 t1.setText(Double.toString(tax));
                                             } else {
                                                 t1.setText("Processing, it will take time");

                                             }
                                         }
                                     }
        );

        reset.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View u) {
                                         PA_bar.setText("");
                                         IR_bar.setText("");
                                     }
                                 }
        );
    }
}
