package com.example.myapplicationday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTitle;
    EditText myInputName;
    TextView myName;
    TextView myDisplay;
    Button myClick;
    Button myReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num1;
        int countNumber;
        int xy;

        char cat;

        myTitle = findViewById(R.id.txtTitle);
        myName = findViewById(R.id.txtInputName);
        myInputName = findViewById(R.id.txtInputName);
        myDisplay = findViewById(R.id.txtDisplay);
        myClick = findViewById(R.id.BTNtryme);
        myReverse = findViewById(R.id.BTNreverse);

        //myDisplay.setText("FANTASTIC LOVER");

        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        String name = myInputName.getText().toString();

                myDisplay.setText("FANTASTIC LOVER " + name + "!");
            }
        });

        myReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setText("ROMANTIC BOMBASTIC");
            }
        });

    }
}