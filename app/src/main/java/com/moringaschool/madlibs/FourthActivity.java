package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FourthActivity extends AppCompatActivity {
    @BindView(R.id.button4) Button mNext;
    @BindView(R.id.editTextTextAdjective) EditText mAdjective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adjective = mAdjective.getText().toString();
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                intent.putExtra("adjective",adjective);
                startActivity(intent);
            }
        });
    }
}