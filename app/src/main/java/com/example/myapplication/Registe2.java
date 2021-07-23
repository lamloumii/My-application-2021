package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registe2 extends AppCompatActivity {
    private TextView Log_reg2 ;
    private Button next_reg2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registe2);

        Log_reg2 =(TextView)findViewById(R.id.login2);
        next_reg2=(Button)findViewById(R.id.next2) ;
        next_reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registe2.this, Verification.class);
                startActivity(intent);
            }
        });
        Log_reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registe2.this, Login.class);
                startActivity(intent);
            }
        });
    }
}