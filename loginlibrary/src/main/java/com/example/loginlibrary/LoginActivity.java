package com.example.loginlibrary;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class LoginActivity extends AppCompatActivity {

    EditText etUserName,etPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        ModelConfiguration modelConfiguration=getIntent().getParcelableExtra(Constants.CONFIGURATION);

        if (modelConfiguration != null) {
            setUserNameSize(modelConfiguration.getUserNameWidth(),modelConfiguration.getUserNameHeight());
         //   init(modelConfiguration);
        }
    }

    /*private void init(ModelConfiguration modelConfiguration) {
        setUserNameSize(modelConfiguration.userNameWidth, modelConfiguration.userNameHeight)
        //setPasswordSize(modelConfiguration.passwordWidth, modelConfiguration.passwordHeight)

    }*/

    private void setUserNameSize(int width, int height) {
        setSize(etUserName, width, height);
    }

    private void setPasswordSize(int width, int height) {
        setSize(etPassword, width, height);
    }
    private void setUserNameBackgroundColor(String color)
    {
        setBackgroundColor(etUserName,color);
    }
    private void setPasswordBackgroundColor(String color)
    {
        setBackgroundColor(etPassword,color);
    }
    private void setButtonBackgroundColor(String color)
    {
        setBackgroundColor(btnLogin,color);
    }

    private void setUserNameBorder(int width, String color,int cornerRedius)
    {
        setBorder(etUserName,width,color,cornerRedius);
    }
    private void setPasswordBorder(int width, String color,int cornerRedius)
    {
        setBorder(etPassword,width,color,cornerRedius);
    }
    private void setButtonBorder(int width, String color,int cornerRedius)
    {
        setBorder(btnLogin,width,color,cornerRedius);
    }

    public void setSize(View view, int width, int height)
    {
        int tmpWidth = width == 0 ? view.getMeasuredWidth() : width;
        int tmpHeight = height == 0 ? view.getMeasuredHeight() : height;
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(tmpWidth, tmpHeight);
        view.setLayoutParams(params);
    }

    public void setBorder(View view, int width, String color,int cornerRadius) {
        GradientDrawable gd = new GradientDrawable();
        //gd.setColor(Color.parseColor(color));
        gd.setCornerRadius(cornerRadius);
        gd.setStroke(width, Color.parseColor(color));
        view.setBackground(gd);
    }
    public void setBackgroundColor(View view,String color)
    {
        view.setBackgroundColor(Color.parseColor(color));
    }

}