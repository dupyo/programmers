package level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Year2016 {

	public static void main(String[] args) {
		
		//2016년
		int a = 5;
		int b = 25;
		System.out.println(new Year2016().solution(a, b));
		
	}
	
	//2016년
	public String solution(int a, int b) {
		String answer = "2016/" + a + "/" + b;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");	//날짜 형식 지정
		Calendar cal = Calendar.getInstance();	//
		
		Date date;
		try {
			date = sdf.parse(answer);
			cal.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cal.getTime().toString().substring(0, 3).toUpperCase();
	}
	

}
