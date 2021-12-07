package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    final static String url = "https://news.google.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        Intent intent = getIntent();
        String loginValue;
        if (intent.hasExtra("login")) {
            loginValue = intent.getStringExtra("login");
            TextView textView =  findViewById(R.id.login);
            textView.setText("Bienvenue " + loginValue);
        }
        Button detail = findViewById(R.id.details);
        detail.setOnClickListener(view -> {
            Intent details = new Intent(this, DetailsActivity.class);
            startActivity(details);
        });
        Button logout = findViewById(R.id.logout);
        logout.setOnClickListener(view -> {
            Intent backlogin = new Intent(this,LoginActivity.class);
            startActivity(backlogin);
        });

        Button about = findViewById(R.id.about);
        about.setOnClickListener(view -> {
            Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(web);
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}