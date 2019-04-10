package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreationMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_menu);
    }
    public void moveRacePage(View view) {
        Intent change_race_activity = new Intent(this,RaceActivity.class);
        startActivity(change_race_activity);
    }
    public void moveClassPage(View view) {
        Intent change_class_activity = new Intent(this, ClassActivity.class);
        startActivity(change_class_activity);
    }

    public void moveBioPage(View view) {
        Intent change_bio_activity = new Intent(this, CharacterBioActivity.class);
        startActivity(change_bio_activity);
    }
}
