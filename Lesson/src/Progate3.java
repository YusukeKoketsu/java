import java.util.Scanner;
//クラス名の最初の文字は大文字
public class Progate3 {
  public static void main(String[] ages) {
//	  クラス名.メソッド名()とすることで、他のクラスのメソッドを呼び出すことができる
//	  Person.hello();
//	  Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
//	  Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	  Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("何人分の情報を入力しますか：");
	    int count = scanner.nextInt();
	    
	    int maxAge = 0;
	    
	    int totalAge = 0;
	    
	    for (int i = 0; i < count; i++) {
	    
	    System.out.println(i + 1 + "人目");
	    
	    System.out.println("名前：");
	    String firstName = scanner.next();
	    
	    System.out.print("名字：");
	    String lastName = scanner.next();
	    
	    System.out.println("年齢：");
	    int age = scanner.nextInt();
	    
	    if (age > maxAge) {
	        maxAge = age;
	      }
	    
	    totalAge += age;
	    
	    System.out.println("身長(m)：");
	    double height = scanner.nextDouble();
	    
	    System.out.println("体重(kg)：");
	    double weight = scanner.nextDouble();
	    
	    Person.printData(firstName, lastName, age, height, weight);
	}
	    System.out.println("最高年齢は" + maxAge + "歳です");
	    
	    System.out.println("平均年齢は" + totalAge / count + "歳です");
  }
}
