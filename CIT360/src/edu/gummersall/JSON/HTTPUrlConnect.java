package edu.gummersall.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HTTPUrlConnect {
	public static void main(String[] args) {
		String apiKey = "fcde6d875a979a91e67c91e2337c270e";
		URL url;
		
		try {
			url = new URL("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=" + apiKey);
			HttpURLConnection httpsURLConnection = (HttpURLConnection) url.openConnection();
			httpsURLConnection.setRequestMethod("GET");
			if (httpsURLConnection.getResponseCode() == 200) {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
			
				String response = null;
			
				while ((response = bufferedReader.readLine()) != null) {
					System.out.println(response);
					System.out.println(response.getClass().getName());
				}
			} else {
				throw new RuntimeException("Failed to connect service" + httpsURLConnection.getResponseCode());
			}
		
		httpsURLConnection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
