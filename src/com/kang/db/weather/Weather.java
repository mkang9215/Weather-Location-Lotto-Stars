package com.kang.db.weather;

public class Weather {
	private String day;
	private String hour;
	private String temp;
	private String weather;
	private String img;
	
	public Weather() {
	}

	public Weather(String day, String hour, String temp, String weather, String img) {
		super();
		this.day = day;
		this.hour = hour;
		this.temp = temp;
		this.weather = weather;
		this.img = img;
	}

	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	

}
