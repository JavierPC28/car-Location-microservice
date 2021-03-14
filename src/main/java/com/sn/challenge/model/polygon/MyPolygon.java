package com.sn.challenge.model.polygon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MyPolygon {

    @JsonProperty("_id")
    private String id;
    private String updatedAt;
    private String createdAt;
    @JsonProperty("__v")
    private Double v;
    private String name;
    private String cityId;
    private String legacyId;
    private String type;
    private List<GeoFeature> geoFeatures = null;
    private Options options;
    private List<TimedOption> timedOptions = null;
    private Geometry geometry;
    private Double version;
    @JsonProperty("$computed")
    private Computed computed;
}
