package com.discover.discoverapp.item;

/**
 * Created by Kevin on 19/09/2015.
 */
public class Location {

    String city;
    String province;
    String lat;
    String lon;

    public Location() {

    }

    public Location(String city, String province, String lat, String lon) {
        this.city = city;
        this.province = province;
        this.lat = lat;
        this.lon = lon;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
