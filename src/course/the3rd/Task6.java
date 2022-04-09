package course.the3rd;

public class Task6 {
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
