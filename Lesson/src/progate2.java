public class progate2 {
	public static void main(String[] args) {
//	メゾッドの呼び出し
//	  printData();
//	メソッド名(引数) 複数の引数 仮引数をコンマ（,）で区切って定義
//	  printData("纐纈", 23);

//   戻り値
//	  String name = fullName("koketu",  "yusuke");
//	  printData(name, 23);
	  printData(fullName("John", "Christopher", "Smith"), 65);
	}
//	メゾッドの定義
//	public static void printData() {
//	  System.out.println("私の名前は纐纈です");
//	}
	
//	引数を受け取れるメソッドを定義 引数を受け取るための箱となる変数（仮引数（かりひきすう））を指定
//	コンマで区切る
	public static void printData(String name, int age) {
	  System.out.println("私の名前は"+name+"です");
	  System.out.println("年齢は"+age+"歳です");
	}
	
//	public static 戻り値のデータ型 メゾッド名(引数) {
//		return 戻り値;
//	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName; 
	}
//	オーバーロード 引数の型や個数が違う場合は同名のメソッドを定義できる
	public static String fullName(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	 }

}
