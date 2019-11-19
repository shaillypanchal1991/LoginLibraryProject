package com.example.loginlibrary;

import android.content.Context;
import android.widget.Toast;

public class LoginMessage {
    public static void show(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }
}
