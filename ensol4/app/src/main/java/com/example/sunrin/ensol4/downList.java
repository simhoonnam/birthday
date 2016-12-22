package com.example.sunrin.ensol4;

/**
 * Created by Sunrin on 2016-12-22.
 */
public class downList {
    private String petname;
    private String pettype;
    private long petage;

    public downList(String petname, String pettype, long petage) {
        this.petname = petname;
        this.pettype = pettype;
        this.petage = petage;
    }

    public String getPetname() {
        return petname;
    }

    public String getPettype() {
        return pettype;
    }

    public long getPetage() {
        return petage;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public void setPettype(String pettype) {
        this.pettype = pettype;
    }

    public void setPetage(long petage) {
        this.petage = petage;
    }
}
