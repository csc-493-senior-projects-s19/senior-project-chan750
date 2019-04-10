package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CharacterBioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_bio);
    }

    public void moveCharacterBio2(View view) {
        Intent changeBio2Activity = new Intent(this, CharacterBio2.class);
        startActivity(changeBio2Activity);
    }
}
