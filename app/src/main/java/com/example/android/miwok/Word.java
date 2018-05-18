package com.example.android.miwok;

public class Word {

    private String miwokWord;
    private String englishWord;
    private int imageResourceId = -1;
    private int mediaResourceId;

    public Word(String miwokWord, String englishWord, int mediaResourceId)
    {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.mediaResourceId = mediaResourceId;
    }

    public Word(String miwokWord, String englishWord, int imageResourceId, int mediaResourceId)
    {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.imageResourceId = imageResourceId;
        this.mediaResourceId = mediaResourceId;
    }


    public String getEnglishWord()
    {
        return englishWord;
    }

    public String getMiwokWord()
    {
        return miwokWord;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public int getMediaResourceId()
    {
        return  mediaResourceId;
    }
}
