package com.example.android.secondpractice;

/**
 * Created by Bartek on 2016-07-20.
 */
public class ListElement {

    private String title;
    private String url;
    private String image;

    public ListElement(String title, String url, String image) {
        this.title = title;
        this.url = url;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
