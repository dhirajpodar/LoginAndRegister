package com.example.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button signup;
    private static final String USERNAME ="admin";
    private static final String PASSWORD ="password";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent is used to from one activity to another activity.
                * It needs two activities: first parameter is for source activity
                * and second parameter is for destination activity.*/
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    private void login() {
        String userName;
        String passWord;

        userName = username.getText().toString();
        passWord = password.getText().toString();

        if(userName.isEmpty()| passWord.isEmpty()){
            Toast.makeText(this, "username and password required.", Toast.LENGTH_SHORT).show();
        }
        if(userName.equals(USERNAME) && passWord.equals(PASSWORD)){
            Toast.makeText(this, "login success.", Toast.LENGTH_SHORT).show();
        }
    }
}
