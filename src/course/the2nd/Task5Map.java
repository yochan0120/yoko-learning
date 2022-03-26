package course.the2nd;

import java.util.HashMap;
import java.util.Map;

public class Task5Map {

	public static void main(String[] args) throws Exception {
		Map<Integer, String> dog = new HashMap<>();

// putメソッドでdogにデータを追加
		dog.put(1, "チワワ");
		dog.put(2, "トイプードル");
		dog.put(3, "ダックスフンド");

//getメソッドでdogに格納したデータを取得
		System.out.println(dog.get(1));
		System.out.println(dog.get(2));
		System.out.println(dog.get(3));

		for (Integer breed : dog.keySet()) {
			System.out.println(dog + ":" + dog.get(breed));
		}
	}
}