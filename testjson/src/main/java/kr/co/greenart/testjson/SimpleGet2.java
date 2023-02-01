package kr.co.greenart.testjson;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleGet2 {
	public static void main(String[] args) {
		String apiURL = "http://localhost:8080/web06/file/download?id=1";

		try {
			URL url = new URL(apiURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			int code = conn.getResponseCode();
			System.out.println(code);
			if (code == HttpURLConnection.HTTP_OK) {
				
				try (BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
						BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("save.png"))) {
					
					int b;
					while ((b = bis.read()) != -1) {
						bos.write(b);
					}
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
