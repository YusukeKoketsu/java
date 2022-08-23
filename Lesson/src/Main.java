public class Main {
	public static void main(String[] ages) {
//	クラスからインスタンスを生成するには「new クラス名()」
//	変数にインスタンスを代入するには「クラス型 変数名 = new クラス名()」
//	Person2 person1 = new Person2();
		
    Person2 person1 = new Person2("koketsu", "yusuke", 23, 1.75, 75.0, "エンジニア");
	
    Person2 person2 = new Person2("John", "Christopher", "Smith", 65, 1.75, 80.0, "マネージャー");
    
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
    
//    セッター  フィールドの値を変更するメソッド
    person2.setMiddleName("Claire");
    
    System.out.println("----------------------");
    System.out.println("ミドルネームを" + person2.getMiddleName() + "に変更しました");
    person2.printData();
    
    System.out.println("----------------------");
    person1.setJob("営業");
    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    person1.printData();
    
    
    
  }
}
