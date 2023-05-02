package スッキリJava;

public class Cleric {
//	属性の定義
	String name;
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 10;
	
//	操作の定義
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}
	public void pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間点に祈った！");
		
//		理論上の回復量を乱数を用いて決定する
		int correction = new java.util.Random().nextInt(3);
		int p = sec + correction;
		
		if (this.mp + p > this.MAX_MP) {
			this.mp = this.MAX_MP;
		} else {
			this.mp = this.mp + p;
		}
	}
}
