package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FifthActivity extends AppCompatActivity {
    @BindView(R.id.button5) Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNext.getText().toString();
                Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                intent.putExtra("noun",noun);
                startActivity(intent);
            }
        });
    }
}