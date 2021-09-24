package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {
    Toolbar toolbar;
    EditText name;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_activity);
        toolbar=findViewById(R.id.toolbar);
        getActionBar().setTitle("Food Factory");

        name=findViewById(R.id.editText);
        login=findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("")) {
                    Toast.makeText(login_activity.this, "Please Enter your name ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(login_activity.this, MainActivity.class);
                    intent.putExtra("Name", name.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
