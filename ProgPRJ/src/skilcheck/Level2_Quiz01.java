package skilcheck;

public class Level2_Quiz01 {

	public static void main(String[] args) {
		// 방금그곡
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = { "02:58,03:20,FOO,CC#B", "03:59,05:01,BAR,CC#BCC#BCC#B" };
		System.out.println(solution(m, musicinfos));
	}

	public static String solution(String m, String[] musicinfos) {
		String answer = "";
		int pre_time = 0;
		m = m.replaceAll("C#", "c").replaceAll("D#", "d")
				.replaceAll("F#", "f").replaceAll("G#", "g").replaceAll("A#", "a");
		for (String each : musicinfos) {
			String[] musicinfo = each.split(",");
			musicinfo[3] = musicinfo[3].replaceAll("C#", "c").replaceAll("D#", "d")
					.replaceAll("F#", "f").replaceAll("G#", "g").replaceAll("A#", "a");
			int starttime = Integer.parseInt(musicinfo[0].replaceAll(":", ""));
			int endtime = Integer.parseInt(musicinfo[1].replaceAll(":", ""));
			int time = Math.abs(endtime - starttime);
			time -= ((endtime / 100 - starttime / 100) * 40);
			while (musicinfo[3].length() < time)
				musicinfo[3] += musicinfo[3];
			musicinfo[3] = musicinfo[3].substring(0, time);
			
			// 시간만큼 반복한 문자열에 네오가 들었던 멜로디가 있는지 확인하라
			if (musicinfo[3].contains(m)) {
				if (pre_time < time) {
					answer = musicinfo[2];
					pre_time = time;
				}
			}
		}

		// 예외 처리 - 조건이 일치하는 음악이 없을 때에는 "(None)"을 반환
		if (answer.isEmpty())
			return "(None)";
		return answer;
	}

}
