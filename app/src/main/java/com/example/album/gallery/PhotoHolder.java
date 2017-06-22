package com.example.album.gallery;

import android.graphics.Bitmap;

public class PhotoHolder {

    private String mTitle = "";
    private Bitmap mImage;
    private String mImagepath = null;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Bitmap getImage() {
        return mImage;
    }

    public void setImage(Bitmap mImage) {
        this.mImage = mImage;
    }

    public String getImagepath() {
        return mImagepath;
    }

    public void setImagepath(String imagepath) {
        this.mImagepath = imagepath;
    }
}
