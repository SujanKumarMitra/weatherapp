package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "main", "description", "icon" })
public class Weather {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("main")
	private String main;
	@JsonProperty("description")
	private String description;
	@JsonProperty("icon")
	private String icon;
	public Weather(Integer id, String main, String description, String icon) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}
	public Weather() {
		super();
		this.id = 0;
		this.main = "Not Available";
		this.description="Not Available";
		this.icon = "Not Available";
	}
	@Override
	public String toString() {
		return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

}