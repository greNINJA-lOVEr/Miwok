package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        colors.add(new Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        colors.add(new Word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        colors.add(new Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        colors.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setBackgroundColor(getResources().getColor(R.color.category_colors));

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                MediaPlayer mp = MediaPlayer.create(ColorsActivity.this, colors.get(position).getMediaResourceId());
//                mp.start();
//            }
//        });

        listView.setAdapter(adapter);


    }
}
