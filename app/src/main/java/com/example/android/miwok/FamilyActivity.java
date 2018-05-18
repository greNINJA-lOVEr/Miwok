package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> familyMembers = new ArrayList<Word>();

        familyMembers.add(new Word("әpә", "Father", R.drawable.family_father, R.raw.family_father));
        familyMembers.add(new Word("әṭa", "Mother", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new Word("angsi", "Son", R.drawable.family_son, R.raw.family_son));
        familyMembers.add(new Word("tune", "Daughter", R.drawable.family_daughter, R.raw.family_daughter));
        familyMembers.add(new Word("taachi", "Older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyMembers.add(new Word("chalitti", "Younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyMembers.add(new Word("teṭe", "Older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyMembers.add(new Word("kolliti", "Younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyMembers.add(new Word("ama", "Grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new Word("paapa", "Grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, familyMembers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setBackgroundColor(getResources().getColor(R.color.category_family));

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                MediaPlayer mp = MediaPlayer.create(FamilyActivity.this, familyMembers.get(position).getMediaResourceId());
//                mp.start();
//            }
//        });

        listView.setAdapter(adapter);

    }
}