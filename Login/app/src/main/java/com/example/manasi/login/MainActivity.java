package com.example.manasi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    private Button Sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText) findViewById(R.id.EditText1);
        Password = (EditText) findViewById(R.id.EditText2);
        Login = (Button) findViewById(R.id.button4);
        Sign_up = (Button) findViewById(R.id.button5);

        Sign_up.setOnClickListener(new View.OnClickListener(){
            Intent intent = new Intent(MainActivity.this , Main22Activity.class);
            @Override
            public void onClick( View view) {
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Email.getText().toString(), Password.getText().toString());
            }
        });

    }


    private void validate (String userName , String userPassword)
    {
         {
        if ((userName.equals("manasigude@gmail.com")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, Main3Activity.class);
            startActivity(intent);

        } else {
            Intent intent = new Intent(MainActivity.this, Main22Activity.class);
           startActivity(intent);
        }

    }

    }

}
