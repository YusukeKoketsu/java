//既存のクラスのフィールドやメソッドを別のクラスに引き継ぐ機能を継承という
//継承されるクラスを「スーパークラス」
public class Vehicle02 {
	private String name;
	private String color;
	private int distance = 0;

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
}
