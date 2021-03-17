package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NinthActivity extends AppCompatActivity {
    @BindView(R.id.textView9) TextView story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nineth_activity);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        String name = intent.getStringExtra("name");
        String adjective = intent.getStringExtra("adjective");
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String secondVerb = intent.getStringExtra("secondVerb");
        String thirdVerb = intent.getStringExtra("thirdVerb");

        story.setText("It was "+ food + " day at school, and " + name + " was super "+ adjective +
                " for lunch. But when she went outside to eat, a " + noun + " stole her " + food + name + " chased the " + noun + " all over school. She " + verb + " "+ secondVerb + " and " +  thirdVerb + " through the playground. Then she tripped on her " + noun + " and the " + noun + " escaped! Luckily,  " + name +"’s " + "friends were willing to share their" + food + " with her.");
    }
}