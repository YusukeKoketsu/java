//継承してできる新しいクラスを「サブクラス」
//継承を用いて新しくサブクラスを定義するときは、「class サブクラス名 extends スーパークラス名」
public class Car02 extends Vehicle02 {
  private int fuel = 50;
  
  public int getFuel( ) {
	  return this.fuel;
  }
  
//  オーバーライド ここでスーパークラスのメソッドの内容を上書きをしている
  public void printData() {
//	  以下3行はスーパークラスと重複している為、「super.メソッド名()」と省略出来る
//	  System.out.println("名前：" + this.getName());
//	  System.out.println("色：" + this.getColor());
//	  System.out.println("走行距離：" + this.getDistance() + "km");
	  
	  super.printData();
	  
	  System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void charge(int litre) {
	  System.out.println(litre + "L給油します");
	  
	  if (litre <= 0) {
		  System.out.println("給油出来ません");
	  }else if (litre + fuel >= 100) {
		  System.out.println("満タンまで給油します");
		  this.fuel = 100;
	  }else {
		  this.fuel += litre;
	  }
	  System.out.println("ガソリン量 : " + this.fuel + "L");
  }
}
