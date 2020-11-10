package com.tts.transitapp.model;

public class Bus {
    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;

    public Bus() {}

    public String getADHERENCE() {
        return this.ADHERENCE;
    }

    public void setADHERENCE(String ADHERENCE) {
        this.ADHERENCE = ADHERENCE;
    }

    public String getBLOCKID() {
        return this.BLOCKID;
    }

    public void setBLOCKID(String BLOCKID) {
        this.BLOCKID = BLOCKID;
    }

    public String getBLOCK_ABBR() {
        return this.BLOCK_ABBR;
    }

    public void setBLOCK_ABBR(String BLOCK_ABBR) {
        this.BLOCK_ABBR = BLOCK_ABBR;
    }

    public String getDIRECTION() {
        return this.DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public String getLATITUDE() {
        return this.LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getLONGITUDE() {
        return this.LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getMSGTIME() {
        return this.MSGTIME;
    }

    public void setMSGTIME(String MSGTIME) {
        this.MSGTIME = MSGTIME;
    }

    public String getROUTE() {
        return this.ROUTE;
    }

    public void setROUTE(String ROUTE) {
        this.ROUTE = ROUTE;
    }

    public String getSTOPID() {
        return this.STOPID;
    }

    public void setSTOPID(String STOPID) {
        this.STOPID = STOPID;
    }

    public String getTIMEPOINT() {
        return this.TIMEPOINT;
    }

    public void setTIMEPOINT(String TIMEPOINT) {
        this.TIMEPOINT = TIMEPOINT;
    }

    public String getTRIPID() {
        return this.TRIPID;
    }

    public void setTRIPID(String TRIPID) {
        this.TRIPID = TRIPID;
    }

    public String getVEHICLE() {
        return this.VEHICLE;
    }

    public void setVEHICLE(String VEHICLE) {
        this.VEHICLE = VEHICLE;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    @Override
    public String toString() {
        return "{" +
            " ADHERENCE='" + ADHERENCE + "'" +
            ", BLOCKID='" + BLOCKID + "'" +
            ", BLOCK_ABBR='" + BLOCK_ABBR + "'" +
            ", DIRECTION='" + DIRECTION + "'" +
            ", LATITUDE='" + LATITUDE + "'" +
            ", LONGITUDE='" + LONGITUDE + "'" +
            ", MSGTIME='" + MSGTIME + "'" +
            ", ROUTE='" + ROUTE + "'" +
            ", STOPID='" + STOPID + "'" +
            ", TIMEPOINT='" + TIMEPOINT + "'" +
            ", TRIPID='" + TRIPID + "'" +
            ", VEHICLE='" + VEHICLE + "'" +
            ", distance='" + distance + "'" +
            "}";
    }    
}
