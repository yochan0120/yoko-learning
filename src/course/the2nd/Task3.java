package course.the2nd;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Task3 {

	public static void main(String[] args) {

		LocalDateTime week = LocalDateTime.now();

		DayOfWeek dayofweek3 = week.plusYears(3).getDayOfWeek();

		System.out.println("3年後の曜日：" + dayofweek3);
	}
}