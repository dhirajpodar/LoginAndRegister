package com.example.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_username;
    private EditText et_password;
    private EditText et_confirmPassword;
    private Button btn_signup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et_name = findViewById(R.id.name);
        et_username = findViewById(R.id.username);
        et_password = findViewById(R.id.password);
        et_confirmPassword = findViewById(R.id.confirm_password);
        btn_signup= findViewById(R.id.signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_name.getText().toString().trim();
                String userName=et_username.getText().toString().trim();
                String passWord=et_password.getText().toString().trim();
                String confirmPassWord=et_confirmPassword.getText().toString().trim();

                if(!name.isEmpty()|!userName.isEmpty()|!passWord.isEmpty()|!confirmPassWord.isEmpty()){
                    if(!passWord.equals(confirmPassWord)){
                        Toast.makeText(SignupActivity.this, "password not match.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(SignupActivity.this, "Signup Success.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignupActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                }
                else {
                    Toast.makeText(SignupActivity.this, "Fields Required!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
