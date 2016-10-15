package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public String[] Items = new String[] {"Beef", "Beer", "Books","Black", "Balls", "Bats", "Cats", "Cars", "Camping", "Cutters", "Cute Dogs", "Coolers", "Coco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Items);
        AutoCompleteTextView searchBar = (AutoCompleteTextView)
                findViewById(R.id.searchBar);
        searchBar.setAdapter(adapter);
    }

    /** Called when the user clicks the Send button */
    public void managerLogin(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        startActivity(intent);
    }
}