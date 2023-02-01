package kr.co.greenart.testjson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOkHttp2 {
	public static void main(String[] args) {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("https://webhook.site/ca1a1c63-dab1-4346-a142-09ae7dabaffb")
				.build();
		
		try (Response resp = client.newCall(request).execute()) {
			System.out.println(resp.code());
			System.out.println(resp.headers());
			System.out.println(resp.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
