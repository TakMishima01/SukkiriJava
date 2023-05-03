package スッキリJava;

public class Hero {
//	属性の定義
	String name = "ミナト";
	int hp;
	Sword sword;
//	コンストラクタ定義
	public Hero() {
		this.hp = 100;
	}
//	コンストラクタのオーバーロード
//	public Hero() {
//		this( "ダミー");
//	}
//	操作の定義
	public void attack(Matango m1) {
		System.out.println(this.name + "の攻撃！");
		m1.hp -= 5;
		System.out.println("お化けキノコ" + m1.suffix + "５ポイントのダメージをあたえた！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
//	public void sleep() {
//		this.hp = 100;
//		System.out.println(this.name + "は、眠って回復した！");
//	}
//	public void sit(int sec) {
//		this.hp += sec;
//		System.out.println(this.name + "は、" + sec + "秒座った！");
//		System.out.println("HPが" + sec + "ポイント回復した");
//	}
//	public void slip() {
//		this.hp -= 5;
//		System.out.println(this.name + "は、転んだ！");
//		System.out.println("5のダメージ！");
//	}
//	
//	

}
