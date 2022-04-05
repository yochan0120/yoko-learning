package course.the3rd;

import java.io.File;
<<<<<<< HEAD
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
=======
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
//			例外が発生する可能性があるコード
			writer.write("test");

		} catch (FileNotFoundException e) {
//			FileNotFoundExceptionがスローされてきた時の対処方法
//			do something
		} catch (IOException e) {
//		    do something
		}
	}
}
>>>>>>> origin/main
