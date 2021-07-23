package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register3 extends AppCompatActivity {
    private TextView Login ;
    private Button Create ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);
        Login =(TextView)findViewById(R.id.login3);
        Create=(Button)findViewById(R.id.next) ;
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register3.this, Login.class);
                startActivity(intent);
            }
        });
    }
}