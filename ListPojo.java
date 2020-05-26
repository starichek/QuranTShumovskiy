package com.qurantshumovskiy.tj;

public class ListPojo {
    private String title;
    private String desription;
    private  int images;

    public ListPojo(String title, String desription, int images) {
        this.title = title;
        this.desription = desription;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public String getDesription() {
        return desription;
    }

    public int getImages() {
        return images;
    }
}

