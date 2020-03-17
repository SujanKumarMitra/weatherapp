package com.getweather.weatherapp.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"coord",
"weather",
"base",
"main",
"visibility",
"wind",
"clouds",
"dt",
"sys",
"timezone",
"id",
"name",
"cod"
})
public class WeatherModel {
	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("weather")
	private List<Weather> weather = null;
	@JsonProperty("base")
	private String base;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("visibility")
	private Integer visibility;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("dt")
	private Integer dt;
	@JsonProperty("sys")
	private Sys sys;
	@JsonProperty("timezone")
	private Integer timezone;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private Integer cod;
	public WeatherModel(Coord coord, List<Weather> weather, String base, Main main, Integer visibility, Wind wind,
			Clouds clouds, Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	public WeatherModel() {
		super();
		this.visibility=0;
		this.name = "Not Available";
		this.cod = 0;
		this.id  = 0;
	}
	@Override
	public String toString() {
		return "WeatherModel [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
				+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys
				+ ", timezone=" + timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Integer getDt() {
		return dt;
	}
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public Integer getTimezone() {
		return timezone;
	}
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
}
