package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText numberOfWachingMachine = findViewById(R.id.wachingMachineText);
        TextView wachingMachineInfo = findViewById(R.id.waschingMachineInfo);
        TextView vacuumInfo = findViewById(R.id.vacuumInfo);
        Button firstButton = findViewById(R.id.firstBtn);
        Button secondButton = findViewById(R.id.secondBtn);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOfWachingMachine.getText().toString().isEmpty()) return;
                int numberText = Integer.parseInt(numberOfWachingMachine.getText().toString());
                if(numberText>=1 && numberText<=12){
                    wachingMachineInfo.setText("Numer prania: "+numberText);
                }
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusOfVacuum = secondButton.getText().toString().toLowerCase();
                if(statusOfVacuum.equals("włącz")){
                    secondButton.setText("WYŁĄCZ");
                    vacuumInfo.setText("Odkurzacz: włączony");
                } else {
                    secondButton.setText("WŁĄCZ");
                    vacuumInfo.setText("Odkurzacz: wyłączony");
                }
            }
        });
    }
}