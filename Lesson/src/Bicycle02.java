//継承してできる新しいクラスを「サブクラス」
//継承を用いて新しくサブクラスを定義するときは、「class サブクラス名 extends スーパークラス名」
public class Bicycle02 extends Vehicle02 {
	
//	スーパークラスのコンストラクタを呼び出すには、super()
	Bicycle02(String name, String color) {
		super(name, color);
	}
	
	public void run(int distance) {
	  System.out.println(distance + "km走ります");
	  this.distance += distance;
	  System.out.println("走行距離：" + this.distance + "km");
	}

}
