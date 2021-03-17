package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EighthActivity extends AppCompatActivity {
    @BindView(R.id.button8) Button mNext;
    @BindView(R.id.editTextTextVerb3) EditText mVerb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighth_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thirdVerb = mVerb3.getText().toString();
                Intent intent = new Intent(EighthActivity.this, NinthActivity.class);
                intent.putExtra("thirdVerb",thirdVerb);
                startActivity(intent);
            }
        });
    }
}