public class Car {
	private String name;
	private String color;
	private int distance = 0;
//	ガソリン量を100Lで満タンに設定
	private int fuel = 100;
	
	
	Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	
	public void printData() {
		System.out.println("【車の情報】");
	    System.out.println("名前 : " + this.name);
	    System.out.println("色 : " + this.color);
	    System.out.println("走行距離 : " + this.distance + "km");
	    System.out.println("ガソリン量 : " + this.fuel + "L");
	}
	
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		
		if (distance <= this.fuel) {
			this.distance += distance;
			this.fuel -= distance;
		} else {
			System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");            
	    System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	
	public void charge(int liter) {
		System.out.println(liter + "L給油します");
		
		if (liter <= 0) {
			System.out.println("給油出来ません");
		} else if (liter + fuel >= 100) {
			System.out.println("満タンまで給油します");
			this.fuel = 100;
		} else {
			this.fuel += liter;
		}
		System.out.println("ガソリン量 : " + this.fuel + "L");
	}
}