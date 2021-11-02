package com.troy.uzhastiki;

public class UzhastikItem {

    private String title;
    private String story;
    private boolean isChecked;

    public UzhastikItem(String title,
                        String recipe,boolean isChecked) {
        this.title = title;
        this.story = recipe;
        this.isChecked = isChecked;
    }

    public String getTitle() {
        return title;
    }

    public String getStory() {
        return story;
    }

    public boolean isChecked() {
        return isChecked;
    }
}
