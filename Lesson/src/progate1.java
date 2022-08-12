
public class progate1 {
	public static void main(String[] ages) {
//		キャストは,強制的に型変換 (変換したいデータ型)値
//		int num1 = 7;
//		int num2 = 2;
//		System.out.println(num1/num2);
//		System.out.println((double)num1/num2);
		
//		真偽値のデータ型はboolean型
//		boolean bool = (3*9 == 27);
//		System.out.println(bool);
//		!(x >= 30)は「xが30以上でない（つまり30より小さい）」ときtrueになり、「xが30以上」のときfalseになる
//		int x = 40;
//		System.out.println(!(x>=30));
		
//		if文 { }の後ろにはセミコロンは不要
//		int x = 1;
//		if (x > 2) {
//			System.out.println("xは2より大きい");
//		} else if (x == 2){
//			System.out.println("xは2です");
//		} else {
//			System.out.println("xは2より小さい");
		
//		switch文 条件の値がcaseの値と一致するとき、処理が実行 caseの後ろはコロン(:)
//		breakはswitch文を終了する命令
//		int n = 3;
//		switch (n) {
//		 case 1:
//		   System.out.println("大吉");
//		   break;
//		 case 2:
//		   System.out.println("吉");
//		   break;
//		 defaultはどのcaseとも一致しなかったときに実行する処理  elseのようなもの
//		 default:
//		   System.out.println("凶です");
//		   break;
//		}
		
//		while文
//		int num = 10;
//		while (num > 0) {
//			System.out.println(num);
//			num--;
//		}
//		for文
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i+"回目のループ処理です");
//		}
//		continueはその周の処理だけをスキップして、次の周を実行する
//		for (int j = 1; j < 10; j++) {
//          if (j % 3 == 0){
//		    continue;
//		    }
//		 System.out.println(j);
//		}
		
//		配列 上書き
		String[] names = {"纐纈", "鈴木", "山田"};
//		System.out.println(names[0]);
//		names[0] = "優輔";
//		System.out.println(names[0]);
		for (int i = 0; i < names.length; i++) {
		   System.out.println("私の名前は"+names[i]+"です");
		 }
	}
}
