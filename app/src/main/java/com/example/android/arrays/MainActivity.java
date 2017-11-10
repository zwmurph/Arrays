package com.example.android.arrays;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the ArrayList, so it can be used with objects
        List<Word> words = new ArrayList<>();
        //Populate the ArrayList
        words.add(new Word("One", "Un", R.drawable.number_one));
        words.add(new Word("Two", "Deux", R.drawable.number_two));
        words.add(new Word("Three", "Trois", R.drawable.number_three));
        words.add(new Word("Four", "Quatre", R.drawable.number_four));
        words.add(new Word("Five", "Cinq", R.drawable.number_five));
        words.add(new Word("Six", "Six", R.drawable.number_six));
        words.add(new Word("Seven", "Sept", R.drawable.number_seven));
        words.add(new Word("Eight", "Huit", R.drawable.number_eight));
        words.add(new Word("Nine", "Neuf", R.drawable.number_nine));
        words.add(new Word("Ten", "Dix", R.drawable.number_ten));
        words.add(new Word("Eleven", "Onze"));
        words.add(new Word("Twelve", "Douze"));
        words.add(new Word("Thirteen", "Treize"));
        words.add(new Word("Fourteen", "Quatorze"));
        words.add(new Word("Fifteen", "Quinze"));
        words.add(new Word("Sixteen", "Seize"));
        words.add(new Word("Seventeen", "Dix-sept"));
        words.add(new Word("Eighteen", "Dix-huit"));
        words.add(new Word("Nineteen", "Dix-neuf"));
        words.add(new Word("Twenty", "Vingt"));

        //Creates an adapter for the words to use, appends the array of words to the adapter,
        //the adapter is responsible for making a View for each item in the data set
        WordAdapter adapter = new WordAdapter(this, words);
        //Creates a object constructor for the ListView
        ListView listView = (ListView) findViewById(R.id.rootView);
        //Sets the adapter method on the ListView
        listView.setAdapter(adapter);
    }
}
