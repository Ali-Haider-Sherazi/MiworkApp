package com.example.miworkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*    TextView number= (TextView) findViewById(R.id.numbers);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Open the list number",Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    public void numbers(View view)
    {
        Intent i = new Intent(this, NumberActivity.class);
        startActivity(i);
    }
    public void Family(View view)
    {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void colors(View view)
    {
        Intent i = new Intent(this, ColorActivity.class);
        startActivity(i);
    }
    public void phrase(View view)
    {
        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }
}
