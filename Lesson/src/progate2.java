public class progate2 {
	public static void main(String[] args) {
//	メゾッドの呼び出し
//	  printData();
//	メソッド名(引数) 複数の引数 仮引数をコンマ（,）で区切って定義
//	  printData("纐纈", 23);

//   戻り値
//	  String name = fullName("koketu",  "yusuke");
//	  printData(name, 23);
//	  printData(fullName("John", "Christopher", "Smith"), 65);
	  printData(fullName("koketsu", "yusuke"), 23, 1.75, 80.0);
	}
//	メゾッドの定義
//	public static void printData() {
//	  System.out.println("私の名前は纐纈です");
//	}
	
//	引数を受け取れるメソッドを定義 引数を受け取るための箱となる変数（仮引数（かりひきすう））を指定
//	コンマで区切る
	public static void printData(String name, int age, double height, double weight) {
	  System.out.println("私の名前は"+name+"です");
	  System.out.println("年齢は"+age+"歳です");
	  System.out.println("身長は" + height + "mです");
	  System.out.println("体重は" + weight + "kgです");
	  double bmi = bmi(height, weight);
	  System.out.println("BMIは" + bmi + "です");
	  
//	  条件分岐
	  if (isHealthy(bmi)) {
		  System.out.println("健康です");
	  } else {
		  System.out.println("健康ではありません");
	  }
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
	public static double bmi(double height, double weight) {
	    return weight / height / height;
	  }
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}
}
