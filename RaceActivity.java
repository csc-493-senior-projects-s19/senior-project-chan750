package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race);
    }

    public void moveDwarfPage(View view) {
        Intent change_dwarf_activity = new Intent(this,DwarfActivity.class);
        startActivity(change_dwarf_activity);
    }

    public void moveDragonbornPage(View view){
        Intent change_dragonborn_activity = new Intent(this, DragonbornActivity.class);
        startActivity(change_dragonborn_activity);
    }

    public void moveElfPage(View view) {
        Intent change_elf_page = new Intent (this, ElfActivity.class);
        startActivity(change_elf_page);
    }
}
