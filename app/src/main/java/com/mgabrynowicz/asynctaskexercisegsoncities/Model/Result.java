package com.mgabrynowicz.asynctaskexercisegsoncities.Model;

/**
 * Created by RENT on 2017-01-03.
 */

public class Result {


    private String countryIso2;
    private String stateAbbr;
    private String postal;
    private String continent;
    private String state;
    private String longtitude;
    private String latitude;
    private String ds;
    private String ip;
    private String city;
    private String country;


    public Result(String countryIso2, String stateAbbr, String postal, String continent, String state, String longtitude, String latitude, String ds, String ip, String city, String country) {
        this.countryIso2 = countryIso2;
        this.stateAbbr = stateAbbr;
        this.postal = postal;
        this.continent = continent;
        this.state = state;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.ds = ds;
        this.ip = ip;
        this.city = city;
        this.country = country;
    }

    public String getCountryIso2() {
        return countryIso2;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public String getPostal() {
        return postal;
    }

    public String getContinent() {
        return continent;
    }

    public String getState() {
        return state;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getDs() {
        return ds;
    }

    public String getIp() {
        return ip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountryIso2(String countryIso2) {
        this.countryIso2 = countryIso2;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}



