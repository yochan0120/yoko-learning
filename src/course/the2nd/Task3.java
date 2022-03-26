package course.the2nd;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Task3 {

	public static void main(String[] args) {
		// 現在日付(LocalDateは日時)
//	LocalDateTime today = LocalDateTime.now();
//	System.out.println("今日の日付 : "+ today);

		// ３年後の現在時間
//	System.out.println(today + "の３年後:"+ today.plus(Period.ofYears(3)));

		// ３年後の曜日
		LocalDateTime week = LocalDateTime.now();
//	System.out.println("date2 : "+date);

//	DayOfWeek  dayofweek = date.getDayOfWeek();
//	System.out.println("曜日：" + dayofweek);

		DayOfWeek dayofweek3 = week.plusYears(3).getDayOfWeek();
//	System.out.println("3年後の今日は"+date2.plusYears(3));
		System.out.println("3年後の曜日：" + dayofweek3);
	}
}