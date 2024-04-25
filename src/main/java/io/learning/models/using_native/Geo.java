package io.learning.models.using_native;

public class Geo {

    public String lat;
    public String lng;

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String toString() {
        return "Geo [lat=" + lat + ", lng=" + lng + "]";
    }
}

