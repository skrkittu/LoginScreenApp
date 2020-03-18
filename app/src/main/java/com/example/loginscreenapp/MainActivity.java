package com.example.loginscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1,b2;
TextView t1;
int counter=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.edittext);
        e2=(EditText)findViewById(R.id.edittext2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textview);
        t1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals("password")){
                    Toast.makeText(getApplicationContext(),"redirecting...",Toast.LENGTH_LONG).show();
                }
                else{
                    t1.setVisibility(View.VISIBLE);
                    counter--;
                    t1.setBackgroundColor(Color.RED);
                    t1.setText(Integer.toString(counter));
                    if(counter==0){
                        b1.setEnabled(false);
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    }

