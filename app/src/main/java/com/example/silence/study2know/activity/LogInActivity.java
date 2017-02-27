package com.example.silence.study2know.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.silence.study2know.R;

/**
 * Created by Silence on 26-Feb-17.
 */

public class LogInActivity extends AppCompatActivity {

    private String userName;
    private String password;
    private TextView signup_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        signup_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(signupIntent);
            }
        });
    }

    public void initViews()
    {
        signup_tv = (TextView) findViewById(R.id.signup_link);
    }
}
