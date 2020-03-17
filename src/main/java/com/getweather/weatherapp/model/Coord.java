package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "lon", "lat" })
public class Coord {

	@JsonProperty("lon")
	private Double lon;
	@JsonProperty("lat")
	private Double lat;
	public Coord() {
		super();
		this.lat=0.0;
		this.lon=0.0;
	}
	public Coord(Double lon, Double lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "Coord [lon=" + lon + ", lat=" + lat + "]";
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}

}