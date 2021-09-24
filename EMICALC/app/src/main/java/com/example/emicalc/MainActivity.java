package com.example.emicalc;

import androidx.appcompat.app.AppCompatActivity;

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
    EditText year_bar;
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
        year_bar = (EditText) findViewById(R.id.year_bar);
        calculate = (Button) findViewById(R.id.calculate);
        t1 = (TextView) findViewById(R.id.t1);
        reset = (Button) findViewById(R.id.reset);


        calculate.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View v) {
                                             int num1 = Integer.parseInt(PA_bar.getText().toString());
                                             int num2 = Integer.parseInt(IR_bar.getText().toString());
                                             int num = Integer.parseInt(year_bar.getText().toString());

                                             float emi = num1 * num2 * (1 + num2)^num/((1 + num2)^num - 1);
                                             t1.setText(Float.toString(emi));
                                         }
                                     }
        );

        reset.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View u) {
                                         PA_bar.setText("");
                                         IR_bar.setText("");
                                         year_bar.setText("");
                                     }
                                 }
        );
    }
}
