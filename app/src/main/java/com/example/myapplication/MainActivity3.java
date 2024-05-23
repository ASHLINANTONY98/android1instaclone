package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        EditText username;
        EditText passcode;
        Button login;

        username=(EditText) findViewById(R.id.etUsername);
        passcode=(EditText) findViewById(R.id.etPassword);
        login=(Button)findViewById(R.id.btnLogin);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=passcode.getText().toString();

                if(user.equals("admin") && pass.equals("admin")){
                    Toast.makeText(MainActivity3.this, "Login successful../", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity3.this,"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}