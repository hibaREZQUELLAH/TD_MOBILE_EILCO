package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());
        NewsListApplication app = (NewsListApplication) getApplicationContext();
        TextView textView =  findViewById(R.id.detailsmsg);
        textView.setText(app.getLogin());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}