package kr.co.greenart.testjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 {
	public static void main(String[] args) throws JsonProcessingException {
		Person p1 = new Person("둘리", 33);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(p1);
		System.out.println(json);
		
		String strPerson = "{\"name\":\"도우너\",\"age\":34}";
		Person p2 = mapper.readValue(strPerson, Person.class);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}
