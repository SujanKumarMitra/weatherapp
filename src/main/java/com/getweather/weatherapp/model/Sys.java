package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "country", "sunrise", "sunset" })
public class Sys {

	@JsonProperty("type")
	private Integer type;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("country")
	private String country;
	@JsonProperty("sunrise")
	private Integer sunrise;
	@JsonProperty("sunset")
	private Integer sunset;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", country=" + country + ", sunrise=" + sunrise + ", sunset="
				+ sunset + "]";
	}
	public Sys() {
		super();
		this.type = 0;
		this.id = 0;
		this.country = "";
		this.sunrise = 0;
		this.sunset = 0;
	}
	public Sys(Integer type, Integer id, String country, Integer sunrise, Integer sunset) {
		super();
		this.type = type;
		this.id = id;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

}