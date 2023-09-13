package com.example.miworkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("Two","otikko",R.drawable.number_two));
        words.add(new Word("Three","tolookosu",R.drawable.number_three));
        words.add(new Word("Four","oyysia",R.drawable.number_four));
        words.add(new Word("Five","massokka",R.drawable.number_five));
        words.add(new Word("Six","temokka",R.drawable.number_six));
        words.add(new Word("Seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight","Kawinta",R.drawable.number_eight));
        words.add(new Word("Nine","wo'e",R.drawable.number_nine));
        words.add(new Word("Ten","na'acche",R.drawable.number_ten));




        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        /*
        for(int i=0;i<=9;i++)
        {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }
*/
    }

}