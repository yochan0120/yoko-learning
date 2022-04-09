package course.the3rd;

public class Task1 {

	public static void main(String[] args) {
		int[] array = new int[3];

		try {
			array[3] = 10;
			System.out.println(array[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーが発生しました");
			// TODO 自動生成されたメソッド・スタブ
		}
	}

}
