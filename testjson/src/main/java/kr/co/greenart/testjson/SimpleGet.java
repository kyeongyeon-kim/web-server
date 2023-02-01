package kr.co.greenart.testjson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleGet {
	public static void main(String[] args) {
		String apiURL = "https://webhook.site/ca1a1c63-dab1-4346-a142-09ae7dabaffb?name=";
		
		try {
			URL url = new URL(apiURL);
			// 오래된 방식(HttpURLConnection)
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			int code = conn.getResponseCode();
			System.out.println(code);
			if (code == HttpURLConnection.HTTP_OK) {
				try (BufferedReader br = new BufferedReader
						(new InputStreamReader(conn.getInputStream()))) {
					StringBuilder sb = new StringBuilder();
					String line;
					while ( (line = br.readLine()) != null) {
						sb.append(line);
					}
					
					System.out.println(sb.toString());
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
