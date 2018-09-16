package com.example.sammy.jsonplaceholder;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("albumId")
    private int albumId;

    @SerializedName("title")
    private String Title;

    @SerializedName("url")
    private String URl;

    @SerializedName("thumbnailUrl")
    private String PosterImage;

    public Item(int albumId, String title, String URl, String posterImage) {
        this.albumId = albumId;
        Title = title;
        this.URl = URl;
        PosterImage = posterImage;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getURl() {
        return URl;
    }

    public void setURl(String URl) {
        this.URl = URl;
    }

    public String getPosterImage() {
        return PosterImage;
    }

    public void setPosterImage(String posterImage) {
        PosterImage = posterImage;
    }

    @Override
    public String toString() {
        return "Item{" + "albumId=" + albumId + ", Title='" + Title + '\'' + ", URl='" + URl + '\'' + ", PosterImage='" + PosterImage + '\'' + '}';
    }
}
