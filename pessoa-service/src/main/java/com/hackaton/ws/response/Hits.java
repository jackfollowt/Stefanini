package com.hackaton.ws.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hits {

    @JsonProperty("total")
    public Total total;

    @JsonProperty("max_score")
    public double max_score;

    @JsonProperty("hits")
    public List<HitsList> hits;

    public Hits() {
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public double getMax_score() {
        return max_score;
    }

    public void setMax_score(double max_score) {
        this.max_score = max_score;
    }

    public List<HitsList> getHits() {
        return hits;
    }

    public void setHits(List<HitsList> hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Hits{" +
                "total=" + total +
                ", max_score=" + max_score +
                ", hits=" + hits +
                '}';
    }
}
