package com.example.electronicguide;

public class ColorSpinnerItem {
    private String colorName;
    private int colorImage;

    public ColorSpinnerItem(String colorName,int colorImage){
        this.colorImage=colorImage;
        this.colorName=colorName;
    }
    public int getColorImage() {
        return colorImage;
    }

    public String getColorName() {
        return colorName;
    }
}
