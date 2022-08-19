import java.util.Scanner;
//クラス名の最初の文字は大文字
public class Progate3 {
  public static void main(String[] ages) {
//	  クラス名.メソッド名()とすることで、他のクラスのメソッドを呼び出すことができる
//	  Person.hello();
//	  Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
//	  Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("お名前 : ");
      
      String name = scanner.next();
      
      System.out.println("こんにちは"+name+"さん");
  }
}
