package com.api.gallery.model;

import com.api.gallery.common.ArtType;
import org.springframework.stereotype.Component;

import java.util.UUID;

//https://www.freeprojectz.com/sites/default/files/Art%20Gallery%20Management%20System_0.jpeg

public class Art {
    //@Id
    UUID id;
    String picName;
    String description;
    ArtType artType;
    byte[] image;

    public Art(UUID id, String picName, ArtType artType, byte[] image) {
        this.id = id;
        this.picName = picName;
        this.artType = artType;
        this.image = image;
    }

    public UUID getId() {
        return id;
    }

    public String getPicName() {
        return picName;
    }

    public ArtType getArtType() {
        return artType;
    }

    public byte[] getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String display(){
        return "Spring boot here!";
    }
}
