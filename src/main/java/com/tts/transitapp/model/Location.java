package com.tts.transitapp.model;

public class Location {
    public String lat;
    public String lng;

    public Location() {}

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return this.lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "{" +
            " lat='" + lat + "'" +
            ", lng='" + lng + "'" +
            "}";
    }
}
