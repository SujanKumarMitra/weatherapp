package com.getweather.weatherapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.getweather.weatherapp.model.Error;
import com.getweather.weatherapp.model.WeatherModel;

/**
 * Servlet implementation class GetWeatherByLocation
 */
public class GetWeatherByLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetWeatherByLocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String latitude = request.getParameter("lat");
			String longitude = request.getParameter("lon");
			String key = getServletContext().getInitParameter("auth-key");
			Response res = ClientBuilder.newClient().target("https://api.openweathermap.org/data/2.5/weather")
					.queryParam("lat", latitude)
					.queryParam("lon", longitude)
					.queryParam("appid",key)
					.queryParam("units", "metric")
					.request().get();
			if(res.getStatus()==404)
			{
				Error error = res.readEntity(Error.class);
				request.getSession().setAttribute("Error",error);
				response.sendRedirect("error.jsp");
			}
			else if(res.getStatus()==200)
			{
				String result = res.readEntity(String.class);
//				System.out.println(result);
				ObjectMapper mapper=new ObjectMapper();
				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				WeatherModel data = mapper.readValue(result, WeatherModel.class);
//				System.out.println(data);
//				WeatherModel data = res.readEntity(WeatherModel.class);
				request.getSession().setAttribute("Result", data);
				response.sendRedirect("weather.jsp");
			}
			else
			{
				Error error = res.readEntity(Error.class);
				request.getSession().setAttribute("Error",error);
				response.sendRedirect("error.jsp");
			}
		} catch (Exception e) {
			request.getSession().setAttribute("Error",new Error("500",e.getMessage()));
			response.sendRedirect("error.jsp");
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
