package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("Lutti", "One", R.drawable.number_one, R.raw.number_one));
        numbers.add(new Word("Otiiko", "Two", R.drawable.number_two, R.raw.number_two));
        numbers.add(new Word("Tolookosu", "Three", R.drawable.number_three, R.raw.number_three));
        numbers.add(new Word("Oyyisa", "Four", R.drawable.number_four, R.raw.number_four));
        numbers.add(new Word("Massokka", "Five", R.drawable.number_five, R.raw.number_five));
        numbers.add(new Word("Temmokka", "Six", R.drawable.number_six, R.raw.number_six));
        numbers.add(new Word("Kenekaku", "Seven", R.drawable.number_seven, R.raw.number_seven));
        numbers.add(new Word("Kawinta", "Eight", R.drawable.number_eight, R.raw.number_eight));
        numbers.add(new Word("Wo’e", "Nine", R.drawable.number_nine, R.raw.number_nine));
        numbers.add(new Word("Na’aacha", "Ten", R.drawable.number_ten, R.raw.number_ten));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootview);
//
//
//        int index = 0;
//
//        while(index<numbers.size())
//        {
//            TextView wordView = new TextView(this);
//            wordView.setText(numbers.get(index));
//            rootView.addView(wordView);
//            index++;
//        }

        WordAdapter adapter = new WordAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setBackgroundColor(getResources().getColor(R.color.category_numbers));

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                mp = MediaPlayer.create(NumbersActivity.this, numbers.get(position).getMediaResourceId());
////                mp.start();
//                if(mp.isPlaying()){
//                    mp.pause();
//                } else {
//                    mp.start();
//                }
//            }
//        });

        listView.setAdapter(adapter);
    }
}
