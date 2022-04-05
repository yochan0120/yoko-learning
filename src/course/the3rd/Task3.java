package course.the3rd;

<<<<<<< HEAD
public class Task3 {
	public static void main(String[] args) {
		System.out.println("プログラムの実行");
		
		try{
			System.out.println("IndexOutOfBoundsExtentionを意図的に発生");
			int[] a = new int[2];
			for(int i = 0; i <= 2; i++) {
				a[i] = i;
			}
			System.out.println("例外発生せず");
			} catch(NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("NullPointerExceltion発生");
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Exception発生");
		}
	}

=======
import java.io.File;
import java.io.IOException;

public class Task3 {
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
>>>>>>> origin/main
}
