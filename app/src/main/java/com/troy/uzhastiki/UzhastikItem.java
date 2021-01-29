package com.troy.uzhastiki;

public class UzhastikItem {

    private String title;
    private String recipe;

    public UzhastikItem(String title,
                        String recipe) {
        this.title = title;
        this.recipe = recipe;
    }

    public String getTitle() {
        return title;
    }

    public String getRecipe() {
        return recipe;
    }
}
