package com.example.silence.study2know.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.silence.study2know.R;

/**
 * Created by Silence on 25-Feb-17.
 */

public class SignUpActivity extends AppCompatActivity {

    private String userName;
    private String emailId;
    private String mobileNo;
    private String firstName;
    private String lastName;
    private String password;
    private String comformPassword;
    private long userId;
    private TextView login_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initViews();
        login_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(SignUpActivity.this,LogInActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    public void initViews()
    {
        login_tv = (TextView)findViewById(R.id.login_link);
    }
}
