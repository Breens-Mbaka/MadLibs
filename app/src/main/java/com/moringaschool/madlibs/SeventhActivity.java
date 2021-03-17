package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SeventhActivity extends AppCompatActivity {
    @BindView(R.id.button7) Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String secondVerb = mNext.getText().toString();
                Intent intent = new Intent(SeventhActivity.this, EighthActivity.class);
                intent.putExtra("secondVerb",secondVerb);
                startActivity(intent);
            }
        });
    }
}