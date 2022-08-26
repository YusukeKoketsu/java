import java.util.Scanner;
public class Main02 {
	public static void main(String[] ages) {
		Scanner scanner = new Scanner(System.in);
	    Car02 car = new Car02("フェラーリ", "赤");
//	    car.setName("フェラーリ");
//	    car.setColor("赤");
	    Bicycle02 bicycle = new Bicycle02("ビアンキ", "緑");
//	    bicycle.setName("ビアンキ");
//	    bicycle.setColor("緑");

	    System.out.println("【車の情報】");
	    car.printData();
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
	    System.out.print("走る距離を入力してください：");
	    int bicycleDistance = scanner.nextInt();
	    bicycle.run(bicycleDistance);
    }
}