package スッキリJava;

public class Main {

	public static void main(String[] args) {
//		勇者の生成
		Hero h = new Hero();
//		フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
//		System.out.println("勇者" + h.name + "を生み出しました！");
		
//		お化けキノコAの生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
//		お化けキノコBの生成
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
//		勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		
//		冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
