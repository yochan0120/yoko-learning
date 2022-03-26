package course.the2nd;

import java.util.ArrayList;
import java.util.List;

public class Task5_List {
public static void main(String[] args) {
	
//	データ型を宣言
	List<String> dog = new ArrayList<String>();
	
//	addメソッドで値を追加
	dog.add("チワワ");
	dog.add("トイプードル");
	dog.add("ダックスフンド");
	
//	拡張for文で順番に出力
	for(String breed : dog) {
		System.out.println(breed);	
	}
	}
}
	