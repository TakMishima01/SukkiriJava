package スッキリJava;

public class Main {

	public static void main(String[] args) {
//		スーパーヒーロー生成
		SuperHero sh = new SuperHero();
		sh.run();
		
//		剣の生成
		Sword s = new Sword();
//		フィールドに初期値をセット
		s.name = "炎の剣";
		s.damage = 10;
		
//		勇者1の生成
		Hero h1 = new Hero();
		h1.run();
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
		System.out.println(h1.hp);
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.hp);
		
//		お化けキノコAの生成
		Matango m1 = new Matango('A');
		m1.hp = 50;

//		お化けキノコBの生成
		PoisonMatango pm1 = new PoisonMatango('A');
		pm1.hp = 48;
		System.out.println(h1.hp);
		pm1.attack(h1);
		System.out.println(h1.hp);
//		勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		
//		冒険のはじまり
//		h1.slip();
//		m1.run();
//		m2.run();
//		h2.attack();
	}

}
