package com.example.miworkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","әpә",R.drawable.family_father));
        words.add(new Word("mother","otikko",R.drawable.family_mother));
        words.add(new Word("son","tolookosu",R.drawable.family_son));
        words.add(new Word("daughter","oyysia",R.drawable.family_daughter));
        words.add(new Word("older brother","massokka",R.drawable.family_older_brother));
        words.add(new Word("younger brother","temokka",R.drawable.family_younger_brother));
        words.add(new Word("older sister","kenekaku",R.drawable.family_older_sister));
        words.add(new Word("younger sister","Kawinta",R.drawable.family_younger_sister));
        words.add(new Word("grandmother","wo'e",R.drawable.family_grandmother));
        words.add(new Word("grandfather","na'acche",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}