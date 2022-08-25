import java.util.Scanner;
public class Main01 {
	public static void main(String[] ages) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("ビアンカ", "緑");
		Car car = new Car("フェラーリ", "赤");
	
	    bicycle.printData();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください : ");
	    int bicycleDistance = scanner.nextInt();
	    bicycle.run(bicycleDistance);
	    
	    System.out.println("-----------------");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください : ");
	    int carDistance = scanner.nextInt();
	    car.run(carDistance);
	}
}
