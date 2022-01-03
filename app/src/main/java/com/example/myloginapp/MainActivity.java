package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn= (MaterialButton) findViewById(R.id.loginbtn);

        //dhivya and dhiv123
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                MainActivity context;
                if(username.getText().toString().equals("dhivya") && password.getText().toString().equals("dhiv123"))
                {

                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else if (username.getText().toString().equals("dhivya") && password.getText().toString().equals("dhiv1234"))
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else if (username.getText().toString().equals("dhivya") && password.getText().toString().equals("1234"))
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else if (username.getText().toString().equals("dhivya") && password.getText().toString().equals("abcd"))
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else if (username.getText().toString().equals("dhivya") && password.getText().toString().equals("dhivya"))
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN SUCCESSFUL:)",Toast.LENGTH_SHORT).show();
                    openWelcomePage();
                }
                else
                {
                    Toast.makeText(context = MainActivity.this, text="LOGIN FAILED:( Please give correct credentials)",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void openWelcomePage() {
        Intent intent = new Intent(this, WelcomePage.class);
        startActivity(intent);
    }
}