package com.getweather.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"cod",
"message"
})
public class Error {

@JsonProperty("cod")
private String cod;
@JsonProperty("message")
private String message;

@JsonProperty("cod")
public String getCod() {
return cod;
}

@JsonProperty("cod")
public void setCod(String cod) {
this.cod = cod;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

public Error() {
	super();
	this.cod = "500";
	this.message = "Something went wrong on the server. Please try again later.";
}

public Error(String cod, String message) {
	super();
	this.cod = cod;
	this.message = message;
}

}