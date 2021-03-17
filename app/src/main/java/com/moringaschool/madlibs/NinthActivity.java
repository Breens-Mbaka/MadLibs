package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nineth_activity);

        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        String name = intent.getStringExtra("name");
        String adjective = intent.getStringExtra("adjective");
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String secondVerb = intent.getStringExtra("secondVerb");
        String thirdVerb = intent.getStringExtra("thirdVerb");
    }
}