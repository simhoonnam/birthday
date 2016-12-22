package com.example.sunrin.ensol4;

/**
 * Created by Sunrin on 2016-12-22.
 */
public class idList {

    private String name;
    private long phone;

    public idList(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
