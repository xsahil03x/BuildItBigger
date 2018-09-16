package com.magarex.joketeller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView tvJoke = findViewById(R.id.tvJoke);
        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        tvJoke.setText(joke);

    }
}
