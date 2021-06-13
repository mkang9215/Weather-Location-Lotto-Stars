package com.kang.db.weather;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;


public class WeatherDAO {
	public static void getWeather(HttpServletRequest request) {
		try {
			URL u = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1141071000");
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			ArrayList<Weather> weathers = new ArrayList<Weather>();
			Weather w = null;

			String tagName = null;
			int what = xpp.getEventType();
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("data")) { 
						w = new Weather();
					}
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("day")) {
						w.setDay(xpp.getText());
						if (w.getDay().equals("0")) {
							w.setDay("Today");
						} else if (w.getDay().equals("1")) {
							w.setDay("Tomorrow");
						} else if (w.getDay().equals("2")) {
							w.setDay("The day after tomorrow");
						}
					} else if (tagName.equals("hour")) {
						w.setHour(xpp.getText() + " o'clock");
					} else if (tagName.equals("temp")) {
						w.setTemp(xpp.getText() + "กษ");
					} else if (tagName.equals("wfEn")) {
						w.setWeather(xpp.getText());
						if (w.getWeather().equals("Clear")) {
							w.setImg("sun.gif");
						} else if (w.getWeather().contains("Cloudy")) {
							w.setImg("somecloud.gif");
						} else if (w.getWeather().contains("Mostly Cloudy")) {
							w.setImg("cloud.gif");
						} else if (w.getWeather().contains("Rain")
								|| w.getWeather().contains("Shower")) {
							w.setImg("rain.gif");
						} else {
							w.setImg("olaf.jpg");
						}
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
					if (xpp.getName().equals("data")) { 
						weathers.add(w);
					}
				}
				xpp.next();
				what = xpp.getEventType();
			}
			request.setAttribute("weathers", weathers);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
