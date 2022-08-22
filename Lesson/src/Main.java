public class Main {
	public static void main(String[] ages) {
//	クラスからインスタンスを生成するには「new クラス名()」
//	変数にインスタンスを代入するには「クラス型 変数名 = new クラス名()」
//	Person2 person1 = new Person2();
		
    Person2 person1 = new Person2("koketsu", "yusuke", 23, 1.75, 75.0);
	
    Person2 person2 = new Person2("John", "Christopher", "Smith", 65, 1.75, 80.0);
    
//	person1.name = "koketsu";
	
	person1.hello();
//	System.out.println(person1.name);
	
//	System.out.println(person1.fullName());
//  System.out.println(person1.age);
//  System.out.println(person1.bmi());
    
    person1.printData();
    
    person2.printData();
    
//    System.out.println("合計" + Person2.count + "人です");
	
//    クラスメソッドは「クラス名.メソッド名()」と呼び出す
    Person2.printCount();
    
    System.out.println("----------------------");
    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
  }
}
