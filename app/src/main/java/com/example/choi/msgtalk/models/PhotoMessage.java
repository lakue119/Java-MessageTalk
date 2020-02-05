package com.example.choi.msgtalk.models;

import lombok.Data;

@Data
public class PhotoMessage extends Message {
    private String photoUrl;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
