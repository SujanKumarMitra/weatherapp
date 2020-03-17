package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "temp", "feels_like", "temp_min", "temp_max", "pressure", "humidity", "sea_level", "grnd_level" })
public class Main {

	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("feels_like")
	private Double feelsLike;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;
	@JsonProperty("pressure")
	private Integer pressure;
	@JsonProperty("humidity")
	private Integer humidity;
	@JsonProperty("sea_level")
	private Integer seaLevel;
	@JsonProperty("grnd_level")
	private Integer grndLevel;

	@JsonProperty("temp")
	public Double getTemp() {
		return temp;
	}

	public Main() {
		super();
		this.temp=0.0;
		this.feelsLike = 0.0;
		this.grndLevel = 0;
		this.humidity = 0;
		this.pressure = 0;
		this.seaLevel = 0;
		this.temp =0.0;
		this.tempMax = 0.0;
		this.tempMin = 0.0;
	}

	public Main(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity,
			Integer seaLevel, Integer grndLevel) {
		super();
		this.temp = temp;
		this.feelsLike = feelsLike;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.pressure = pressure;
		this.humidity = humidity;
		this.seaLevel = seaLevel;
		this.grndLevel = grndLevel;
	}

	@JsonProperty("temp")
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	@JsonProperty("feels_like")
	public Double getFeelsLike() {
		return feelsLike;
	}

	@JsonProperty("feels_like")
	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	@JsonProperty("temp_min")
	public Double getTempMin() {
		return tempMin;
	}

	@JsonProperty("temp_min")
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}

	@JsonProperty("temp_max")
	public Double getTempMax() {
		return tempMax;
	}

	@JsonProperty("temp_max")
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}

	@JsonProperty("pressure")
	public Integer getPressure() {
		return pressure;
	}

	@JsonProperty("pressure")
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	@JsonProperty("humidity")
	public Integer getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("sea_level")
	public Integer getSeaLevel() {
		return seaLevel;
	}

	@JsonProperty("sea_level")
	public void setSeaLevel(Integer seaLevel) {
		this.seaLevel = seaLevel;
	}

	@JsonProperty("grnd_level")
	public Integer getGrndLevel() {
		return grndLevel;
	}

	@JsonProperty("grnd_level")
	public void setGrndLevel(Integer grndLevel) {
		this.grndLevel = grndLevel;
	}

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", feelsLike=" + feelsLike + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", pressure=" + pressure + ", humidity=" + humidity + ", seaLevel=" + seaLevel + ", grndLevel="
				+ grndLevel + "]";
	}

}