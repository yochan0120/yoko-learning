package course.the2nd;

public class Task4AnotherSolution {

	public static void main(String[] args) {

//	0と１の乱数
		var rndm = Math.floor(Math.random() * 2);

		int num = (int) rndm;
		if (num == 0) {
			System.out.println("0:偽");
		} else if (num == 1) {
			System.out.println("1:真");
		}
	}
}
