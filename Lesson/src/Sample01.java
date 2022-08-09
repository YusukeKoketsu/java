
//public class Sample01 {
//	public static void main(String[] args) {
////		処理(文)　System.out.println はJavaの標準出力用メソッド
//		System.out.println("Hello WEBCAMP!");
//		System.out.println("Hello Java!");
//	}
//}

//public class Sample01 {
//	public static void main(String[] args) {
////		型 変数名 = 代入するデータ;
////		識別子の命名のルールに注意
//		int num1;
//		String str1;
//		num1 = 10;
//		str1 = "Hello World!";
//		System.out.println(num1);
//		System.out.println(str1);
//		
//		num1 = 20;
//		System.out.println(num1);
//		
//		int num2 = 30;
//		System.out.println(num2);
//	}
//}

//定数の宣言 final 定数の型 定数名 = 初期値;
//定数とは、最初に代入した値を後から変更できない変数のこと
//public class Sample01 {
//	public static void main(String[] args) {
//		final int MIN_NUMBER = 10;
//		System.out.println(MIN_NUMBER);
//		
////		再代入しようとするとエラー
////		MIN_NUMBER = 20;
//	}
//}

public class Sample01 {
	public static void main(String[] args) {
		String name = "koketsu";
		System.out.println(name);
		name = "monster";
		System.out.println(name);
		final int num = 4;
		System.out.println(num);
	}
}