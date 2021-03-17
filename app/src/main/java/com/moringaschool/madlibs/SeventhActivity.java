package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SeventhActivity extends AppCompatActivity {
    @BindView(R.id.button7) Button mNext;
    @BindView(R.id.editTextTextVerb2) EditText mVerb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String secondVerb = mVerb2.getText().toString();
                Intent intent = new Intent(SeventhActivity.this, EighthActivity.class);
                intent.putExtra("secondVerb",secondVerb);
                startActivity(intent);
            }
        });
    }
}