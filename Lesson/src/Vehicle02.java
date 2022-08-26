//既存のクラスのフィールドやメソッドを別のクラスに引き継ぐ機能を継承という
//継承されるクラスを「スーパークラス」
//抽象メソッドを1つでも持つクラスは、「抽象クラス」と呼ばれ、クラス名の前にabstractをつける必要がある
abstract public class Vehicle02 {
	private String name;
	private String color;
//	private int distance = 0;
	
//	protectedを用いると、クラス内とサブクラスからのみアクセスを許すフィールドを作ることができる
	protected int distance = 0;
	
	Vehicle02(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
	  return this.name;
	}
	
	public String getColor() {
	  return this.color;
	}
	
	public int getDistance() {
	  return this.distance;
	}
	
	public void setName(String name) {
	  this.name = name;
	}
	
	public void setColor(String color) {
	  this.color = color;
	}
	
	public void printData() {
	  System.out.println("名前：" + this.name);
	  System.out.println("色：" + this.color);
	  System.out.println("走行距離：" + this.distance + "km");
	}
	
//	abstractとは「抽象的な」という意味
//	具体的な処理が決まっていない未完成のメソッドであるため、「抽象メソッド」と呼ばれる
	public abstract void run(int distance);
}
