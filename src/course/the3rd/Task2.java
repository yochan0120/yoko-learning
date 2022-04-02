package course.the3rd;

public class Task2 {
	public static void main(String[] args) {
		try {
//		arrayはどこも参照していない
			int[] array = null;

//		arrayの要素に値を代入しようとしている
			array[0] = 10;
			System.out.println(array[0]);
		} catch (NullPointerException e) {
			System.out.println("error！");
		}
	}
}
