package com.example.informationbook.model;


public class ModelClass {

    public ModelClass(String imageName, String categoryName) {
        this.imageName = imageName;
        this.categoryName = categoryName;
    }

    private String imageName;
    private String categoryName;

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
