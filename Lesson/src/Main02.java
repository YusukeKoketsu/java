import java.util.Scanner;
public class Main02 {
	public static void main(String[] ages) {
		
		Person3 person1 = new Person3("Koketsu", "Yusuke", 27, 1.6, 50.0);
	    Person3 person2 = new Person3("John", "Christopher", "Smith", 65, 1.75, 80.0);
	    
	    
		Scanner scanner = new Scanner(System.in);
	    Car02 car = new Car02("フェラーリ", "赤");
//	    carの所有者をperson1に設定
	    car.setOwner(person1);
	    
//	    car.setName("フェラーリ");
//	    car.setColor("赤");
	    Bicycle02 bicycle = new Bicycle02("ビアンキ", "緑");
//	    bicycle.setName("ビアンキ");
//	    bicycle.setColor("緑");
	    
//	    bicycleの所有者をperson2に設定
	    bicycle.setOwner(person2);

	    System.out.println("【車の情報】");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.println("【車の所有者の情報】");
	    
//	    getOwnerメソッドのあとにそのまま続けてPersonクラスのインスタンスメソッドprintDataを呼びだすことが可能
	    car.getOwner().printData();
	    
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int carDistance = scanner.nextInt();
	    car.run(carDistance);
	    	    
	    System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int litre = scanner.nextInt();
	    
	    car.charge(litre);

	    System.out.println("=================");
	    System.out.println("【自転車の情報】");
	    bicycle.printData();
	    
	    System.out.println("-----------------");
	    System.out.println("【自転車の所有者の情報】");
//	    getOwnerメソッドのあとにそのまま続けてPersonクラスのインスタンスメソッドprintDataを呼びだすことが可能
	    bicycle.getOwner().printData();
	    
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int bicycleDistance = scanner.nextInt();
	    bicycle.run(bicycleDistance);
    }
}