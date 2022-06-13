package com.example.regandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class order extends AppCompatActivity {
    //Initialize a button//
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        //Define a button GOBACK
        b3=(Button) findViewById(R.id.goback);
        //Call OnClickListner//
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }
    //Create intent to go back to home page//
    public void goBack(){
        Intent int4=new Intent(order.this,Home_page.class);
        startActivity(int4);

    }
}