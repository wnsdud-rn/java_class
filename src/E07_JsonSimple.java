import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
//json 다시 import하기



public class E07_JsonSimple {

	//google 'maven repo'검색 -> 자바 라이브러리들이 모여있는 사이트
	
	// ※ 외부 라이브러리 추가 방법
	// Build path -> Configure Build Path -> Lib Tab 여기서 class path누르고 -> Add External JAR
	
	
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		//JSON 비열을 만들기 위해서는 ArrayList를 사용해야한다
		ArrayList<String> arr =new ArrayList<>();
		arr.add("Programming");
		arr.add("soccer");
		arr.add("Billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "금천구");
		obj.put("age", 27);
		obj.put("age", arr);
		
		System.out.println(obj);
		
		String jsonStr = obj.toString();
		System.out.println(jsonStr);
		
		
		
		
		
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj2 =(JSONObject)parser.parse(new FileReader("D:\\java_io\\data.json"));
			
			System.out.println(obj2.get("name"));
			System.out.println(obj2.get("programming"));
			System.out.println(obj2.get("민수"));
			
			JSONArray programs = (JSONArray)(obj2.get("programming"));
			for(Object program : programs) {
				System.out.println(program);
			}
			
			
			//JSONObject 내부의 JSONObject 사용하기
			JSONObject minsu = (JSONObject)obj2.get("민수");
			
			System.out.println(minsu.get("성별"));
			
			//JSON - 정보만 가지고 Map을 생성할 수 있는 문자열(전송하기 아주 좋음)
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
