package com.tts.transitapp.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Geometry {

    @Autowired
    public Location location;

    public Geometry() {}

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" +
            " location='" + location + "'" +
            "}";
    }
}
