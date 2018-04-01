package com.example.fina.fina_1202150284_modul6;

public class InfoUploadImage {

    public String imageName;

    public String imageURL;

    public InfoUploadImage() {

    }

    public InfoUploadImage(String name, String url) {

        this.imageName = name;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

}
