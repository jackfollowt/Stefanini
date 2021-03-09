package com.hackaton.ws.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Total implements Serializable {

    @JsonProperty("value")
    public int value;

    @JsonProperty("relation")
    public String relation;

    public Total() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Total{" +
                "value=" + value +
                ", relation='" + relation + '\'' +
                '}';
    }
}
