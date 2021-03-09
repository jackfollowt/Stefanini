package com.hackaton.ws.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SusApiResponse implements Serializable {

    @JsonProperty("took")
    public int took;

    @JsonProperty("timed_out")
    public boolean timed_out;

    @JsonProperty("_shards")
    public Shards _shards;

    @JsonProperty("hits")
    public Hits hits;

    public SusApiResponse() {
    }

    public int getTook() {
        return took;
    }

    public void setTook(int took) {
        this.took = took;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }

    public Shards get_shards() {
        return _shards;
    }

    public void set_shards(Shards _shards) {
        this._shards = _shards;
    }

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "SusApiRequest{" +
                "took=" + took +
                ", timed_out=" + timed_out +
                ", _shards=" + _shards +
                ", hits=" + hits +
                '}';
    }
}
