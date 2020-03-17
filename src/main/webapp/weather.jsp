<%@page import="com.getweather.weatherapp.model.WeatherModel"%>
<%@page contentType="text/html; charset=ISO-8859-1" language="java"  %>
<%@page errorPage="error.jsp" %>
<%
WeatherModel result = (WeatherModel)request.getSession().getAttribute("Result");

%>
<!DOCTYPE html>
<html>
<head>
	<title>Weather App</title>
	<!-- bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
	<!-- fontawesome -->
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<!-- weather icons -->
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/weather-icons/2.0.9/css/weather-icons.min.css">
	<!-- stylesheet -->
	<link rel="stylesheet" type="text/css" href="./weather_page.css">
	<link rel="icon" href="./icon.png" type="image/png" >
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <a class="navbar-brand" href="index.html">Weather App</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <!-- <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          
        </ul> -->
        <form class="form-inline my-2 my-lg-0 navbar-brand" action="GetWeather">
          <input class="form-control mr-sm-2" type="search" placeholder="Enter a city name" aria-label="Search" name="city">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
	<div class="hero">
		<!-- navbar -->
		
		<!-- weather section  -->
		<div class="container">
			<div class="row">
				<div id="" class="col-10 mx-auto weather">
					<!-- weather header section -->
					<div class="weather-head">
						<h1 id="location" class="text-center display-4"><%=result.getName()+","+result.getSys().getCountry()%></h1>
						<div class="row">							
							<div id="description" class="description col-6 text-center">
								<!-- <i id="icon-desc" class="wi wi-owm-200"></i> -->
								<img alt="result.getWeather().get(0).getDescription()" src="http://openweathermap.org/img/wn/<%=result.getWeather().get(0).getIcon()%>@2x.png">
								<p class="desc"><%=result.getWeather().get(0).getMain()+"," %>&nbsp;<%=result.getWeather().get(0).getDescription() %></p>			
							</div>
							<div id="temperature" class="col-6 text-center">
								<%=result.getMain().getTemp()%><i id="icon-thermometer" class="wi wi-thermometer"></i><i class="wi wi-celsius"></i>				
							</div>	
						</div>
						<!-- weather body header -->
						<div class="weather-body">					
							<div class="row">
								 <div class="Max & Min temparature col-4 text-center">
									<i class="wi wi-day-sunny"></i><span> Feels Like <%=": "+result.getMain().getFeelsLike() %> </span>
                                </div>
                                <div class="Max & Min temparature col-4 text-center">
									<i class="wi wi-sunrise"></i><span> Max Temparature <%=": "+result.getMain().getTempMax() %> </span>
                                </div>
                                <div class="Max & Min temparature col-4 text-center">
									<i class="wi wi-sunset"></i><span> Min Temparature <%=": "+result.getMain().getTempMin() %> </span>
                                </div>
                                <div class="Pressure col-4 text-center">
									<i class="wi wi-barometer"></i><span> Pressure <%=": "+result.getMain().getPressure() %> </span>
                                </div>
								<div class="humidity col-4 text-center">
									<i class="wi wi-humidity"></i><span> Humidity <%=": "+result.getMain().getHumidity() %></span>
								</div>
								<div class="humidity col-4 text-center">
									<i class="wi wi-cloud"></i><span> Cloudiness <%=": "+result.getClouds().getAll() +"%" %></span>
								</div>
								<div class="wind col-4 text-center">
									<i class="wi wi-strong-wind"></i><span> Wind Speed <%=": "+result.getWind().getSpeed() %></span>
								</div>
								<div class="wind col-4 text-center">
									<i class="wi wi-strong-wind"></i><span> Wind Degree <%=": "+result.getWind().getDeg() %></span>
								</div>
                                <div class="wind col-4 text-center">
									<i class="wi wi-horizon"></i><span> Visibility <%=": "+result.getVisibility() %></span>
								</div>	
                                	
                                					
							</div>
							<!-- weather body data -->
							
						</div>						
					</div>					
				</div>
			</div>
		</div>
		
	</div>
	<!-- javascript file -->
	<script src="js/weather.js"></script>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  

</body>
</html>