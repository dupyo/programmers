package codingTest_210624;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ManageByteType {

	public static void main(String[] args) {
		String[] Bytes = {"BOOL","SHORT","LONG"};
		System.out.println(new ManageByteType().solution(Bytes));
	}
	
	public String solution(String[] Bytes) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("BOOL", 1);
		map.put("SHORT", 2);
		map.put("FLOAT", 4);
		map.put("INT", 8);
		map.put("LONG", 16);
		int cnt = 0;
		String pre = "";
		for(String str : Bytes) {
			cnt += map.get(str);
			System.out.println(map.get(str));
			if(cnt>128) {
				return "HALT";
			}
		}
		cnt = 0;
		for(int i = 0; i < Bytes.length; i++) {
			if(Bytes[i].equals("BOOL")){
				answer+=new String(new char[1]).replace("\0", "#")+",";
				cnt+=map.get(Bytes[i]);
			}else if(Bytes[i].equals("SHORT")){
				answer+=new String(new char[2]).replace("\0", "#")+",";
				cnt+=map.get(Bytes[i]);
			}else if(Bytes[i].equals("FLOAT")){
				answer+=new String(new char[4]).replace("\0", "#")+",";
				cnt+=map.get(Bytes[i]);
			}else if(Bytes[i].equals("INT")){
				answer+=new String(new char[8]).replace("\0", "#")+",";
				cnt+=map.get(Bytes[i]);
			}else if(Bytes[i].equals("LONG")){
				answer+=new String(new char[8]).replace("\0", "#")+",";
				answer+=new String(new char[8]).replace("\0", "#")+",";
				cnt+=map.get(Bytes[i]);
			}
			pre = Bytes[i];
		}
		return answer;
	}

}
