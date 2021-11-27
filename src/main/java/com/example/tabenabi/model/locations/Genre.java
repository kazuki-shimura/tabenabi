package com.example.tabenabi.model.locations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {
    @JsonProperty("catch")
    public String catch_sample; // catchが使えない
    public String code;
    public String name;

    public String getCatch_sample() {
        return catch_sample;
    }

    public void setCatch_sample(String catch_sample) {
        this.catch_sample = catch_sample;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
