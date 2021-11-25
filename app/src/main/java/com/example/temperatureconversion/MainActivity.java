package com.example.temperatureconversion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView result;
            private EditText EnterTemp;
            double result0;
            @SuppressLint("SetTextI18n")
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Button ctoF = findViewById(R.id.CtoF);
                Button ftoC = findViewById(R.id.FtoC);
                result=findViewById(R.id.result);
                EnterTemp=findViewById(R.id.EnterTemp);

                ctoF.setOnClickListener(v -> {
                    if(EnterTemp.getText().toString().isEmpty())
                    {
                        result.setText("Please Enter Temperature!!");
                    }
                    else
                    {
                        double temp=Double.parseDouble(EnterTemp.getText().toString());
                        result0=(temp*1.8) + 32;
                        result.setText(String.valueOf(result0));
                    }
                });
                ftoC.setOnClickListener(v -> {
                    if(EnterTemp.getText().toString().isEmpty())
                    {
                        result.setText("Please Enter Temperature!!");
                    }
                    else
                    {
                        double temp=Double.parseDouble(EnterTemp.getText().toString());
                        result0=(temp-32)*0.555;
                        result.setText(String.valueOf(result0));
                    }
                });

                    }

            }

