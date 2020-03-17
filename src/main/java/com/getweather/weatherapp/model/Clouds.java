package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "all" })
public class Clouds {
	
	public Clouds() {
		super();
		this.all = 0;
	}

	public Clouds(Integer all) {
		super();
		this.all = all;
	}

	@JsonProperty("all")
	private Integer all;

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

	public Integer getAll() {
		return all;
	}

	public void setAll(Integer all) {
		this.all = all;
	}

}