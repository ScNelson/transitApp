package com.tts.transitapp.model;

import java.util.List;

public class GeocodingResponse {

    public List<Geocoding> results;

    public GeocodingResponse() {}
    
    public List<Geocoding> getResults() {
        return this.results;
    }

    public void setResults(List<Geocoding> results) {
        this.results = results;
    }

}
