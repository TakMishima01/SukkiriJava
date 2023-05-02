package スッキリJava;

public class Main {

	public static void main(String[] args) {
//		剣の生成
		Sword s = new Sword();
//		フィールドに初期値をセット
		s.name = "炎の剣";
		s.damage = 10;
		
//		勇者1の生成
		Hero h1 = new Hero("ミナト");
//		フィールドに初期値をセット
		h1.sword = s;
		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println(h1.hp);
//		勇者2の生成
		Hero h2 = new Hero();
//		フィールドに初期値をセット
		h2.sword = s;
		System.out.println("現在の武器は" + h2.sword.name);
		
//		ウィザードの生成
		Wizard w = new Wizard();
//		フィールドの初期化
		w.name = "スガワラ";
		w.hp = 50;
//		メソッドの呼び出し
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
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
		h1.slip();
		m1.run();
		m2.run();
		h2.attack();
	}

}
