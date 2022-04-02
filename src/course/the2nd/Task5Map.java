package course.the2nd;

import java.util.HashMap;
import java.util.Map;

public class Task5Map {

	public static void main(String[] args) {
		Map<Integer, String> dogMap = new HashMap<>();

// putメソッドでdogにデータを追加
		dogMap.put(1, "チワワ");
		dogMap.put(2, "トイプードル");
		dogMap.put(3, "ダックスフンド");

//getメソッドでdogに格納したデータを取得
		System.out.println(dogMap.get(1));
		System.out.println(dogMap.get(2));
		System.out.println(dogMap.get(3));

		for (Integer breed : dogMap.keySet()) {
			System.out.println(dogMap + ":" + dogMap.get(breed));
		}
	}
}