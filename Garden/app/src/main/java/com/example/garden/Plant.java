package com.example.garden;

import androidx.annotation.DrawableRes;

public class Plant {

    @DrawableRes
    static int image;
    static int plantType;
    static int progress;
    static int timeNeededToProgress;

    public static void grow(String time, int previousProgress)
    {

    }

    public void updateImage()
    {
        String newImage = "";
        switch (this.progress)
        {
            case 0:
                newImage = plantType+"0";
            case 1:
                newImage = plantType+"1";
            case 2:
                newImage = plantType+"2";
            case 3:
                newImage = plantType+"3";
        }
        this.image = Integer.parseInt(newImage);
    }

}
