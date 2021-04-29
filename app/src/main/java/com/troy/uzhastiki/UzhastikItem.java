package com.troy.uzhastiki;

public class UzhastikItem {

    private String title;
    private String story;

    public UzhastikItem(String title,
                        String recipe) {
        this.title = title;
        this.story = recipe;
    }

    public String getTitle() {
        return title;
    }

    public String getStory() {
        return story;
    }
}
