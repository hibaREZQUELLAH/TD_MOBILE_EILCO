package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());
        Button loginB = findViewById(R.id.login_button);
        EditText mEdit   =  findViewById(R.id.username);
        loginB.setOnClickListener(view -> {
            NewsListApplication app = (NewsListApplication) getApplicationContext();
            Intent news = new Intent(this, NewsActivity.class);
            app.setLogin(mEdit.getText().toString());
            String login = app.getLogin();
            news.putExtra("login", login);
            startActivity(news);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}