package course.the2nd;

class Task4 {
	public static void main(String[] args) {

//		コマンドライン引数を数値に変換
		int num = Integer.parseInt(args[0]);

//		コマンドライン0を入力
		if (num == 0) {
			System.out.println("偽");

//		コマンドライン1を入力
		} else if (num == 1) {
			System.out.println("真");
		}
	}
}
