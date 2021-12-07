package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(view -> {
            EditText editText = findViewById(R.id.face);
            int nb_face = Integer.parseInt(editText.getText().toString());
            TextView textView1 =  findViewById(R.id.text1);
            TextView textView2 =  findViewById(R.id.text2);
            textView1.setText(Integer.toString(getRandomNumber(1,nb_face)));
            textView2.setText(Integer.toString(getRandomNumber(1,nb_face)));
        });
    }
    public int getRandomNumber(int min, int max) {
        return new Random().nextInt(max-min) + min;
    }

}