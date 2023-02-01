package kr.co.greenart.testjson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOkHttp {
	public static void main(String[] args) {
		OkHttpClient client = new OkHttpClient();
		// 설정을 다 한 뒤 빌드 메소드를 호출하면 객체가 만들어진다.
		Request request = new Request.Builder()
				.url("https://webhook.site/ca1a1c63-dab1-4346-a142-09ae7dabaffb")
				.build();
		
		try(Response resp = client.newCall(request).execute()) {
			System.out.println(resp.code());
			System.out.println(resp.headers());
			String json = resp.body().string();
			
			ObjectMapper mapper = new ObjectMapper();
			Person p = mapper.readValue(json, Person.class);
			
			
			System.out.println(p.getName());
			System.out.println(p.getAge());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
