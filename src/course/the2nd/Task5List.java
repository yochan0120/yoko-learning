package course.the2nd;

import java.util.ArrayList;
import java.util.List;

public class Task5List {
	public static void main(String[] args) {

//	データ型を宣言
		List<String> dogList = new ArrayList<String>();

//	addメソッドで値を追加
		dogList.add("チワワ");
		dogList.add("トイプードル");
		dogList.add("ダックスフンド");

//	拡張for文で順番に出力
//		for (String breed : dogList) {
//			System.out.println(breed);
		
//	メソッド参照で順番に出力
//	forEach( e -> System.out.println(e))の省略記法
		dogList.forEach(System.out::println);
		}
	}
//}
