package com.example.experiment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font=30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t=(TextView) findViewById(R.id.textView);
        final TextView t1=(TextView) findViewById(R.id.textView1);
        Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font=font+5;
                if(font==50)
                    font=30;
            }
        });
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1:
                        t1.setTextColor(Color.RED);
                        break;
                    case 2:
                        t1.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t1.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t1.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t1.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t1.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if(ch==7)
                    ch=1;
            }
        });
    }
}
