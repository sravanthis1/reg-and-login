package com.example.regandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class Registration extends AppCompatActivity {
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        register=(Button) findViewById(R.id.btn_reg);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
    }
    //Create intent to navigate from Registration page to Home page//
    public void next(){
        Intent int_next=new Intent(Registration.this,Home_page.class);
      startActivity(int_next);

    }
    public void validate() {
        {
            String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            EditText t1 = (EditText) findViewById(R.id.fn);
            EditText t2 = (EditText) findViewById(R.id.ln);
            EditText t3 = (EditText) findViewById(R.id.address);
            EditText t4 = (EditText) findViewById(R.id.email);
            EditText t5 = (EditText) findViewById(R.id.pass);

            //Get strings to check if the field is not empty
            String Text1 = t1.getText().toString();
            String Text2 = t2.getText().toString();
            String Text3 = t3.getText().toString();
            String Text4 = t4.getText().toString();
            String Text5 = t5.getText().toString();

            if (Text1.matches("") || Text2.matches("") || Text3.matches("") || Text4.matches("") || Text5.matches("")) {
                Toast.makeText(getApplicationContext(), "Fields cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Text1.length() < 3) {
                t1.requestFocus();
                t1.setError("FirstName must contain atleast 3 characters.");
                Toast.makeText(getApplicationContext(), "FirstName must contain atleast 3 characters.", Toast.LENGTH_LONG).show();
            } else if (Text1.length() > 30) {
                Toast.makeText(getApplicationContext(), "FirstName should not exceed 30", Toast.LENGTH_LONG).show();
            } else if (!Text4.matches(emailPattern)) {
                t4.requestFocus();
                t4.setError("ENTER A VALID EMAIL");

            } else {
                Toast.makeText(getApplicationContext(), "Registration Successful!", Toast.LENGTH_LONG).show();
                next();


    }
};
        }


    }




