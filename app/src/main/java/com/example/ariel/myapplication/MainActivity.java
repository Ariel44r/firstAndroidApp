package com.example.ariel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.txtUser);
        password = (EditText)findViewById(R.id.txtPassword);
        login = (Button)findViewById(R.id.btnLogin);
    }
}
