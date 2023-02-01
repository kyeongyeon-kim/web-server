package kr.co.greenart.testjson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class SimplePost {
	public static void main(String[] args) {
		String apiURL = "https://webhook.site/ca1a1c63-dab1-4346-a142-09ae7dabaffb?name=";
		
		try {
			URL url = new URL(apiURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			// true값을 줘야 바디영역에 값을 넣을 수 있음
			conn.setDoOutput(true);
			
			ObjectMapper mapper = new ObjectMapper();
			ObjectNode node = mapper.createObjectNode();
			node.put("name", "Kyeong Yeon");
			node.put("message", "Hello. message");
			
			try (PrintWriter pw = new PrintWriter(conn.getOutputStream())) {
				pw.println(mapper.writeValueAsString(node));
			}
			
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
