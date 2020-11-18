package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onbutton.OnButton;

public class MainActivity extends AppCompatActivity {

    private OnButton button;
    TextView textView;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                top(v);
            }
        });

    }


    public void top(View v){
        if(a == 0){
          textView.setText("dsds");
          a=1;
        }else{
            textView.setText("eferer");
            a=0;
        }

    }
}