package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public MediaPlayer mediaPlayer;
    //public int shouldPlay = 1;

    public WordAdapter(Context context, ArrayList<Word> words)
    {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_word);
        TextView englishWord = (TextView) listItemView.findViewById(R.id.english_word);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

//        LinearLayout item = (LinearLayout) listItemView.findViewById(R.id.item);
//        item.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getMediaResourceId());
//                mediaPlayer.start();
//            }
//        });

        ImageView play = (ImageView) listItemView.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getContext(), currentWord.getMediaResourceId());
                mediaPlayer.start();
//                while (shouldPlay == 1) {
//                    mediaPlayer.start();
//                    if(isPlaying(shouldPlay) == 0)
//                        break;
//                }
            }
        });
        ImageView pause = (ImageView) listItemView.findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getContext(), currentWord.getMediaResourceId());
                    mediaPlayer.pause();
                //shouldPlay = 0;
            }
        });


        miwokWord.setText(currentWord.getMiwokWord());
        englishWord.setText(currentWord.getEnglishWord());
        if(currentWord.getImageResourceId() == -1)
        {
            image.setVisibility(View.GONE);
        }
        else
        {
            image.setImageResource(currentWord.getImageResourceId());
        }

        return listItemView;
    }

//    public int isPlaying(int shouldPlay)
//    {
//        return shouldPlay;
//    }
}
