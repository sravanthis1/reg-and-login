package com.example.regandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_page extends AppCompatActivity {
    //initialize Buttons//
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_home_page);
        super.onCreate(savedInstanceState);
        //Initialize login Button//
        b1 = (Button) findViewById(R.id.btn_login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();

            }
        });
        //Initialize Register Button//
        b2 = (Button) findViewById(R.id.btn_register);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity();
            }
        });
    }
    //Crete intent to go from home page to login page//
        public void openLoginActivity(){
            Intent intent=new Intent(Home_page.this,Login_Page.class);
            startActivity(intent);
        }
    //Crete intent to go from home page to Register page//
    public void openRegisterActivity(){
        Intent intent=new Intent(Home_page.this,Registration.class);
        startActivity(intent);

            }
        }


