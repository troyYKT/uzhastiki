package com.troy.uzhastiki;

public class UzhastikItem {

    private final String title;
    private final String story;
    private final int id;

    public UzhastikItem(int id, String title,
                        String recipe) {
        this.title = title;
        this.story = recipe;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getStory() {
        return story;
    }
    public int getId(){return id;}

}
