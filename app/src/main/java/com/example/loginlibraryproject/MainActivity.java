package com.example.loginlibraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.loginlibrary.Constants;
import com.example.loginlibrary.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelConfig modelConfig=new ModelConfig();

        modelConfig.setUserNameWidth(0);
        modelConfig.setUserNameHeight(0);

        modelConfig.setPasswordWidth(0);
        modelConfig.setPasswordHeight(0);

        modelConfig.setLoginButtonWidth(0);
        modelConfig.setLoginButtonHeight(0);

        Intent intent=new Intent(this, LoginActivity.class);
        intent.putExtra(Constants.CONFIGURATION,modelConfig);
        startActivity(intent);
    }
}
