package course.the3rd;

import java.io.File;
import java.io.IOException;

public class Task4 {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		try {

//			例外が発生する可能性のあるコード
			file.createNewFile();
		} catch (IOException e) {

//			IOExceptionOがスローされてきた時の対処方法
//			do something
		}
		System.out.println("finish");
	}
}
