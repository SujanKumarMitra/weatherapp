package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "speed", "deg" })
public class Wind {

	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Integer deg;
	public Wind(Double speed, Integer deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public Wind() {
		super();
		this.deg = 0;
		this.speed = 0.0;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Integer getDeg() {
		return deg;
	}
	public void setDeg(Integer deg) {
		this.deg = deg;
	}

}