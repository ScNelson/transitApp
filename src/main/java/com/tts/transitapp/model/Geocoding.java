package com.tts.transitapp.model;

public class Geocoding {
    public Geometry geometry;

    public Geocoding() {}

    public Geometry getGeometry() {
        return this.geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "{" +
            " geometry='" + geometry + "'" +
            "}";
    }
}
