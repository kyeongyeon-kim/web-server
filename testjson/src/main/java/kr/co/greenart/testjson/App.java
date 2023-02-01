package kr.co.greenart.testjson;

import java.time.LocalTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class App {
    public static void main( String[] args ) throws JsonProcessingException {
    	ObjectMapper mapper = new ObjectMapper();
    	ObjectNode node = mapper.createObjectNode();
    	//node = 이름과 값을 갖는 객체
    	node.put("name1", 100);
    	node.put("name2", 45.33);
    	node.put("name3", true);
    	node.put("name4", "문자열값");
    	
    	// 매퍼야 노드객체를 문자열타입으로 바꿔줘
    	String json = mapper.writeValueAsString(node);
    	System.out.println(json);
    	
    	// 현재 시간을 표현 가능한 json 자료 만들기
    	LocalTime now = LocalTime.now();
    	ObjectNode timeNode = mapper.createObjectNode();
    	timeNode.put("hour", now.getHour());
    	timeNode.put("minute", now.getMinute());
    	timeNode.put("second", now.getSecond());
    	String timeJson = mapper.writeValueAsString(timeNode);
    	System.out.println(timeJson);
    }
}
