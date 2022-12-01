package com.api.gallery.model;

import java.util.UUID;

public class Gallery {
    UUID galleryId;
    String galleryDescription;
    String galleryType;
    String galleryTitle;
    ArtCollection artCollection;

    public Gallery(UUID galleryId, String galleryTitle) {
        this.galleryId = galleryId;
        this.galleryTitle = galleryTitle;
    }

    public UUID getGalleryId() {
        return galleryId;
    }

    public String getGalleryTitle() {
        return galleryTitle;
    }

    public String getGalleryDescription() {
        return galleryDescription;
    }

    public void setGalleryDescription(String galleryDescription) {
        this.galleryDescription = galleryDescription;
    }

    public ArtCollection getArtCollection() {
        return artCollection;
    }

    public void setArtCollection(ArtCollection artCollection) {
        this.artCollection = artCollection;
    }
}
