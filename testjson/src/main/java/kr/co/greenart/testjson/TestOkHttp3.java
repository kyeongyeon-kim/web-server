package kr.co.greenart.testjson;

import java.io.IOException;
import java.util.List;

import com.example.Example;
import com.example.Result;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOkHttp3 {
	public static void main(String[] args) {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("http://www.gimhae.go.kr/openapi/tour/restaurant.do")
				.build();
		
		try (Response resp = client.newCall(request).execute()) {
			System.out.println(resp.code());
			System.out.println(resp.headers());
			String json = resp.body().string();
			
			ObjectMapper mapper = new ObjectMapper();
			Example example = mapper.readValue(json, Example.class);
			
			System.out.println(example);
			
			List<Result> list = example.getResults();
			for (Result r : list) {
				System.out.print(r.getName() + " : ");
				System.out.println(r.getAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
