import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_JSON {

	// # JSON
	//	- JavaScript에서 사용하는 Map타입
	//	- 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다
	//	- {Key : Value, Key : Value}의 형태를 가진다
	
	// # JSON Value에 사용되는 자바스크립트 타입들
	//	-'',"" : String
	//	-숫자,소수 : Number
	//	-[] : Array
	//	-{} : JSON
	
	// #JAVA에서는 JSON타입을 지원하지 않기때문에 데이터들을 JSON 형태의 문자열로 만들어 줘야한다(Parsing, Binding)
	
	
	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		
		int count = 0;
		int size = map.size()-1;
		
		for(Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			sb.append("\t\""+ key + "\"\t: ");
			if(value == null) {
				sb.append("null");
			}
			
			if(value instanceof String) {
				sb.append("'"+value+"'");
			} else if(value instanceof Object[]) {
				Object[] arr = (Object[]) value;
				
				if(arr.length ==0) {
					sb.append("[]");
				}
				
				if(arr instanceof String[]) {
					sb.append("[");
					
					int len = arr.length-1;
					int lencount = 0;
					
					for(Object obj : arr) {
						sb.append("'"+obj+"'");
						
						if(lencount++== len) {
							sb.append("]");
						}else {
							sb.append(", ");
						}
					}
					
				}else {
					sb.append("[");
					
					int len = arr.length-1;
					int lencount = 0;
					
					for(Object obj : arr) {
						sb.append(obj);
						
						if(lencount++== len) {
							sb.append("]");
						}else {
							sb.append(", ");
						}
					}
				}
				
			} else {
				sb.append(value);
			}
			
			if(count++==size) {
				sb.append("\n}");
			}else {
				sb.append(",\n");
			}
			
		}
		
		//System.out.println(sb);
		
		
		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
		fw.write(new String(sb));
		fw.close();
		System.out.println("파일쓰기완료");
	}
	
	
	public static void jsonFileToMap(Map<String, Object> map) throws IOException {
		
		FileReader fr = new FileReader("D:\\java_io\\data.json");	
		
		StringBuilder sb = new StringBuilder();
		int ch;
		while((ch = fr.read())!=-1) {
			sb.append((char)ch);
		}
		System.out.println("파일에서 읽어온 내용 : ");	
		System.out.println(sb);	
		
		fr.close();
		
		String jsonObj = new String(sb);
		
		
		Pattern entry_pattern = Pattern.compile(".+:.+\n");
		Matcher matcher = entry_pattern.matcher(jsonObj);
		
		while(matcher.find()) {
			//정규표현식으로 엔트리를 추출한 뒤 쉼표와 공백을 제거
			String entry = matcher.group().trim(); // trim은 공백제거
			
			if(entry.charAt(entry.length()-1)==',') {
				entry = entry.substring(0,entry.length()-1);
			}
			System.out.println("Entry : "+entry);
			
			String[] split_entry = entry.split(":");
			
			String key = split_entry[0].trim().replaceAll("[\"\']", "");
			String value = split_entry[1].trim();
			
			System.out.println("key : "+key);
			System.out.println("value : "+value);
			
			if(value.equals("null")) {
				System.err.println("null");
				map.put(key, null);
				
			}else if(Pattern.matches("[\"\'].+[\"\']", value)) {//"나'로 시작해 "나'로 끝나면 => 문자열
				System.err.println("문자열임");
				map.put(key, value.replaceAll("[\"\']", ""));
				
			}else if(Pattern.matches("\\d+", value)) {
				System.err.println("숫자임");
				map.put(key, Integer.parseInt(value));
				
			}else if(Pattern.matches("\\d+\\.\\d", value)) {
				System.err.println("소수임");
				map.put(key, Double.parseDouble(value));
				
			}else if(Pattern.matches("\\[.+\\]", value)) {
				System.err.println("배열임");
				
				value = value.replaceAll("[\\[\\]]", "");
				
				String[] items = value.split(",");
				Object[] objs = null;
				
				int index = 0;
				
				//배열 내부의 내용이 문자열일 때 
				if(Pattern.matches("[\"\'].+[\"\']", items[0])) {
					objs = new String[items.length];
					
					for(int i=0; i < items.length;i++) {
						objs[i] = items[i].trim().replaceAll("[\"\']", "");
					}
					
				}else if(Pattern.matches("\\d+", items[0])) {
					objs = new Integer[items.length];
					
					for(int i=0; i < items.length;i++) {
						objs[i] = Integer.parseInt(items[i].trim());
					}
				}else if(Pattern.matches("\\d+\\.\\d", items[0])) {
					objs = new Double[items.length];
					
					for(int i=0; i < items.length;i++) {
						objs[i] = Double.parseDouble(items[i].trim());
					}
				}
				map.put(key, objs);
			}
			
			System.out.println("-----------------------------");
		}
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		//다음 Map에 저장된 데이터를 JSON형태의 문자열로 생성하여 출력해보세요
		//출력 : {name: "홍길동", age: 15, tel: "010-1234-1234"}
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		String[] a = {"JAVA","Python","JS"};
		map.put("programming", a);
		map.put("lotto", new Integer[] {1,2,3,4,5,6});
		
		
		
		
		
		//instanceof 연산자를 통해 해당 값의 타입을 구분할 수 있다
//		System.out.println(map.get("name") instanceof String);
//		System.out.println(map.get("age") instanceof Integer);
//		System.out.println(map.get("tel") instanceof String);
//		System.out.println(map.get("programming") instanceof Object[]);
		
		
		//mapToJsonFile(map);
		
		
		
		//- json파일에 저장된 데이터를 JAVA맵으로 변환하는 메서드를 만들어보세요
		HashMap<String, Object> map2 = new HashMap<>();
		
		
		jsonFileToMap(map2);
		System.out.println(map2);
		System.out.println(Arrays.toString((Integer[])map2.get("lotto")));
		System.out.println(Arrays.toString((String[])map2.get("programming")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//내코드
//		StringBuilder sb = new StringBuilder();
//		System.out.println("{");
//		
//		for(String key : map.keySet()) {
//			
//			if(map.get(key) instanceof Integer) {
//				sb.append(key+":"+map.get(key)+", \n");
//			}else if(map.get(key) instanceof Object[]){
//				sb.append(key+":"+"["+"\"");
//				for(int i=0;i<a.length;i++) {
//					sb.append(((Object[])map.get(key))[i]);// 배열로 내려야 한다
//					
//					
//					if(i==a.length-1) {
//						sb.append("\"");
//					}else {
//						sb.append("\", "+"\"");
//					}
//				}
//				
//				sb.append("]"+", \n");
//			}else {
//				sb.append(key+":"+"\""+map.get(key)+"\""+", \n");
//			}
//			
//		}
//		System.out.print(sb);
//		System.out.println("}");
		
	}
}
