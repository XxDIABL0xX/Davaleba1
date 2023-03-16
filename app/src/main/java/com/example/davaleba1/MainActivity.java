package com.example.davaleba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Text_View;
    private Button Plus_Button;
    private Button Minus_Button;
    private Button Restart_Button;
    private Button Exit_Button;
    private Button About_Button;

    protected int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Init();
        SetLisenery();

    }

    private  Void Init () {

        Text_View = findViewById(R.id.Text_View);
        Plus_Button = findViewById(R.id.Puse_Button);
        Minus_Button = findViewById(R.id.Minus_Button);
        Restart_Button = findViewById(R.id.Reset_Button);
        Exit_Button = findViewById(R.id.Exit_Button);
        About_Button = findViewById(R.id.About_Button);
        return null;
    }

    private  Void SetLisenery(){
        Plus_Button.setOnClickListener(view -> {
            a++;
            String text = String.valueOf(a);
            Text_View.setText(text);
        });

        Minus_Button.setOnClickListener(view -> {
            a--;
            String text = String.valueOf(a);
            Text_View.setText(text);
        });

        Restart_Button.setOnClickListener(view -> {
            a=0;
            String text = String.valueOf(a);
            Text_View.setText(text);
        });

        Exit_Button.setOnClickListener(view -> {
            finish();
            System.exit(0);
        });

        About_Button.setOnClickListener(view -> {
            Intent SecondActivityIntent = new Intent(this,second_activity.class);
            startActivity(SecondActivityIntent);
        });

        return null;


    }




}