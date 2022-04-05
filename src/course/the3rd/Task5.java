package course.the3rd;

<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task5 {

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
=======
public class Task5 {
	public static void main(String[] args) {
		System.out.println("A");
		try {
			int[] array = null;
			System.out.println("B");

//			参照先がないのに０番目の要素の値を代入しようとしている
			array[0] = 10;
			System.out.println("C");
		} catch (NullPointerException e) {
			System.out.println("D");
			// TODO: handle exception
		} finally {
			System.out.println("E");
		}
		System.out.println("F");

	}

}
>>>>>>> origin/main
