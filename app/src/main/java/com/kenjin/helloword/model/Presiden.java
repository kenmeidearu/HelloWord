package com.kenjin.helloword.model;

public class Presiden {
    private String name, remarks, photo;

    public Presiden() {
    }

    public Presiden(String name, String remarks, String photo) {
        this.name = name;
        this.remarks = remarks;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
