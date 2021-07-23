package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button login ;
    private Button account ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();*/

        login=(Button) findViewById(R.id.login);
        account=(Button)findViewById(R.id.create);


        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_Account();
            }
        });




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_login();
            }
        });
    }
    public void Activity_login(){
        Intent intent =new Intent(this,Login.class);
        startActivity(intent);
    }
    public void Activity_Account(){
        Intent intent =new Intent(this, Register.class);
        startActivity(intent);
    }
}