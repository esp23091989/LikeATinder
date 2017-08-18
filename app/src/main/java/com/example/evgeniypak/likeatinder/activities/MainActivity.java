package com.example.evgeniypak.likeatinder.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.evgeniypak.likeatinder.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;

import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LoginButton loginButton = (LoginButton) findViewById(R.id.btnLogin);
    }

    @OnClick(R.id.llFacebookLogin)
    public void onFacebookLoginClick(){
        LoginManager =
    }
}
