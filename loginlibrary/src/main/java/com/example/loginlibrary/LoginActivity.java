package com.example.loginlibrary;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUserName,etPassword;
    private Button btnLogin;
    private  ModelConfiguration config;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);

        config = getIntent().getParcelableExtra(Constants.CONFIGURATION);
        if (config != null) {
            setUserNameSize(dpToPx(config.getUserNameWidth()), dpToPx(config.getUserNameHeight()));
            setPasswordSize(dpToPx(config.getPasswordWidth()), dpToPx(config.getPasswordHeight()));
            setLoginButtonSize(dpToPx(config.getLoginButtonWidth()), dpToPx(config.getLoginButtonHeight()));
        }
    }

    private void setUserNameSize(int configuredWidth, int configuredHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) etUserName.getLayoutParams();
        int width = configuredWidth <= 0 ? params.width : configuredWidth;
        int height = configuredHeight <= 0 ? params.height : configuredHeight;
        params.width = width;
        params.height = height;
        etUserName.setLayoutParams(params);
    }

    private void setPasswordSize(int configuredWidth, int configuredHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) etPassword.getLayoutParams();
        int width = configuredWidth <= 0 ? params.width : configuredWidth;
        int height = configuredHeight <= 0 ? params.height : configuredHeight;
        params.width = width;
        params.height = height;
        etPassword.setLayoutParams(params);
    }

    private void setLoginButtonSize(int configuredWidth, int configuredHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) btnLogin.getLayoutParams();
        int width = configuredWidth <= 0 ? params.width : configuredWidth;
        int height = configuredHeight <= 0 ? params.height : configuredHeight;
        params.width = width;
        params.height = height;
        btnLogin.setLayoutParams(params);
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

    private void setUserNameBorder(int width, String color,int cornerRedius) {
        setBorder(etUserName,width,color,cornerRedius);
    }
    private void setPasswordBorder(int width, String color,int cornerRedius) {
        setBorder(etPassword,width,color,cornerRedius);
    }
    private void setButtonBorder(int width, String color,int cornerRedius) {
        setBorder(btnLogin,width,color,cornerRedius);
    }

    public void setBorder(View view, int width, String color,int cornerRadius) {
        GradientDrawable gd = new GradientDrawable();
        //gd.setColor(Color.parseColor(color));
        gd.setCornerRadius(cornerRadius);
        gd.setStroke(width, Color.parseColor(color));
        view.setBackground(gd);
    }
    public void setBackgroundColor(View view,String color) {
        view.setBackgroundColor(Color.parseColor(color));
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
}