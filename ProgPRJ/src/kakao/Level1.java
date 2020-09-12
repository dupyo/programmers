package kakao;

public class Level1 {

	public static void main(String[] args) {
		String new_id = "...-._.....~!@#$%^&*()=+[{]}:?,<>";
		System.out.println("result : " + new Level1().solution(new_id));
	}
	
	public String solution(String new_id) {
		String[] rgx = "~!@#$%^&*()=+[{]}:?,<>".split(""); //2번
		for(String r : rgx) {
			new_id=new_id.replaceAll("\\"+r, "");
		}
		
		while(new_id.contains("..")) { //3번
			new_id=new_id.replaceAll("\\."+"\\.", ".");
		}
		
		if(new_id.indexOf(".") == 0) { //4번
			new_id=new_id.substring(1);
		}
		
		if(new_id.equals("")) { //5번
			new_id="a";
		} else {
			int len = (new_id.length() >= 15) ? 15 : new_id.length(); //6번
			new_id=new_id.substring(0, len);
		}
		
		if(new_id.lastIndexOf(".") == new_id.length()-1) { //4번
			new_id=new_id.substring(0,new_id.length()-1);
		}
		
		new_id=new_id.toLowerCase(); //1번
		
		while(new_id.length() <= 2) { //7번
			new_id+=new_id.toCharArray()[new_id.length()-1];
		}
		
		return new_id;
	}

}
