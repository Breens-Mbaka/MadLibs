package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SixthActivity extends AppCompatActivity {
    @BindView(R.id.button6) Button mNext;
    @BindView(R.id.editTextTextVerb)
    EditText mVerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_activity);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verb = mVerb.getText().toString();
                Intent intent = new Intent(SixthActivity.this, SeventhActivity.class);
                intent.putExtra("verb",verb);
                startActivity(intent);
            }
        });
    }
}