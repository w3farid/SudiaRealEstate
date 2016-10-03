package com.exam.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LocationV implements Serializable {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String location;
    private String place;
    private Map<String, String> locations;
    private Map<String, String> places;

    public LocationV() {
        locations = new HashMap<String, String>();
        locations.put("Dhanmondi", "Dhanmondi");
        locations.put("Mohammadpur", "Mohammadpur");
        locations.put("Ramna", "Ramna");
//        data.put(location, locations);
        Map<String, String> map = new HashMap<String, String>();
        map.put("Jigatala", "Jigatala");
        map.put("Satmazid", "Satmazid");
        map.put("8/A", "8/A");
        data.put("Dhanmondi", map);
        map = new HashMap<String, String>();
        map.put("Mohammadpur Bazar", "Mohammadpur Bazar");
        map.put("M-Cntral", "M-Cntral");
        map.put("Main Road", "Main Road");
        data.put("Mohammadpur", map);
    }

    public String go() {
        if (location != null || location != "" && place != null || place != "") {
            System.out.println(place.substring(0,3).toLowerCase());
            return place.substring(0,3).toLowerCase();
        } else {
            return "notfoundpage";
        }
    }

    public void locationChange() {
        if (location != null) {
            places = data.get(location);
        } else {
            places = new HashMap<String, String>();
        }
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, String>> data) {
        this.data = data;
    }

    public Map<String, String> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, String> locations) {
        this.locations = locations;
    }

    public Map<String, String> getPlaces() {
        return places;
    }

    public void setPlaces(Map<String, String> places) {
        this.places = places;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
