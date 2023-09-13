package com.example.miworkapp;

public class Word {
    String MiworkTranslation;
    String EnglishTransalation;
    private int mImgResourceId=No_Img;
    public final static int No_Img=-1;
    public Word(String defaultTrans , String miwork)
    {
        MiworkTranslation = miwork;
        EnglishTransalation = defaultTrans;
    }
    public Word(String defaultTrans , String miwork, int ImgResourceId)
    {
        MiworkTranslation = miwork;
        EnglishTransalation = defaultTrans;
        mImgResourceId = ImgResourceId;
    }
    public String getMiwork()
    {
        return MiworkTranslation;
    }

    public String getdefaultTranslation()
    {
        return EnglishTransalation;
    }

    public int mImgResourceId()
    {
        return mImgResourceId;
    }

    public boolean hasImg()
    {
            return mImgResourceId != No_Img;
    }

}

