public class Person2 {
//	クラスの外部からアクセスできるようにするには「public」
//	アクセスできないようにするには「private」を用いて定義
//	クラスフィールドは、staticをつけて「public static データ型 変数名」と定義する
    private static int count = 0; 

//	インスタンスフィールドの定義  public データ型 変数名
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
	
//	ゲッター  フィールドをprivateにした上で、クラス外から安全にフィールドの値を取得する
//	ゲッターは「getフィールド名」のように命名する
	public String getMiddleName() {
		return this.middleName = middleName;
	}
	
	
	
//	コンストラクタ newを使ってインスタンスを生成した後に自動で呼び出される特別なメソッド
//	①コンストラクタ名はクラス名と同じにする
//	②戻り値を書いてはいけない（voidも書かない）
	Person2(String firstName, String lastName, int age, double height, double weight) {
		System.out.println("インスタンスが生成されました");
//		クラスフィールドには「クラス名.クラスフィールド名」でアクセスすることができる
		Person2.count ++;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	Person2(String firstName, String middleName, String lastName, int age, double height, double weight) {
	    // this()とすると、コンストラクタから他のコンストラクタを呼び出すことができる
//		thisはコンストラクタの先頭でしか呼び出せない
	    this(firstName, lastName, age, height, weight);
	    
	    this.middleName = middleName;
	  }
	
	
	
//	インスタンスメソッドは「public 戻り値の型 メソッド名()」
	public void hello() {
		System.out.println("こんにちは");
//		メソッド内でインスタンスフィールドにアクセスするためには「this」という特殊な変数を用いる
//		thisはクラス内のメソッドの定義の中でのみ使用
//		System.out.println("こんにちは、" + this.name + "さん");
	}
	
	public String fullName() {
		if (this.middleName == null) {
		  return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
	    System.out.println("年齢は" + this.age + "歳です");
	    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	
//	クラスメソッドの定義は、「public static 戻り値の型 メソッド名()」とします
	public static void printCount() {
		System.out.println("合計" + Person2.count + "人です");
	}
	
}
