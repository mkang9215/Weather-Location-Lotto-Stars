package com.kang.db.loc;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LocDAO {

	public static void getLocation(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("euc-kr");
			
			String what = request.getParameter("what");

			what = URLEncoder.encode(what, "utf-8");
			
			String s = "https://dapi.kakao.com/v2/local/search/keyword.json";
			s += "?query=" + what;
			s += "&x=127.023626&y=37.502520&radius=5000";
			s += "&sort=distance";

			URL u = new URL(s);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();

			huc.addRequestProperty("Authorization", "KakaoAK fabaf074944c68c1a737d743f2b61c4e");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray d = (JSONArray) jo.get("documents");
			JSONObject d2 = null;

			ArrayList<Location> locs = new ArrayList<Location>();
			Location l = null;

			for (int i = 0; i < d.size(); i++) {
				l = new Location();
				d2 = (JSONObject) d.get(i);
				l.setName(d2.get("place_name") + "");
				l.setAddress(d2.get("road_address_name") + "");
				l.setDistance(d2.get("distance") + "");
				l.setPhone(d2.get("phone") + "");
				locs.add(l);
			}
			request.setAttribute("locs", locs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
