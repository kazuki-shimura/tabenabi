package com.example.tabenabi.model.locations;

import java.util.ArrayList;

public class Results {
    public String api_version;
    public int results_available;
    public String results_returned;
    public int results_start;
    public ArrayList<Shop> shops;

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public int getResults_available() {
        return results_available;
    }

    public void setResults_available(int results_available) {
        this.results_available = results_available;
    }

    public String getResults_returned() {
        return results_returned;
    }

    public void setResults_returned(String results_returned) {
        this.results_returned = results_returned;
    }

    public int getResults_start() {
        return results_start;
    }

    public void setResults_start(int results_start) {
        this.results_start = results_start;
    }

    public ArrayList<Shop> getShop() {
        return shops;
    }

    public void setShop(ArrayList<Shop> shops) {
        this.shops = shops;
    }

}
