package level2;

import java.util.Arrays;

public class PhoneList {
	public static String[] phone_book = { "134", "123", "1235", "567", "88" };

	public static void main(String[] args) {
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length-1; i++) {
			if (phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
				break;
			}
		}
		System.out.println(answer);
	}

}
