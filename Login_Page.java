package com.example.regandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {
    //Declare a button//
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        b3=(Button)findViewById(R.id.login_btn);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t6=(EditText) findViewById(R.id.username);
                EditText t7=(EditText) findViewById(R.id.password);
                String Text6=t6.getText().toString();
                String Text7=t7.getText().toString();
    //Validating the user with the correct username and password//
                if(Text6.matches("admin")&& Text7.matches("password")){
                    openOrderPage();

                }
                //Display message if the username and password is incorrect//
                else{
                    Toast.makeText(getApplicationContext(), "INVALID CREDENTIALS", Toast.LENGTH_LONG).show();
                    t6.setText("");
                    t7.setText("");

                }

            }
        });
    }
    //Create intent for navigating from login page to final page//
    public void openOrderPage(){
        Intent intent3 = new Intent(Login_Page.this,order.class);
        startActivity(intent3);
    }

    }
