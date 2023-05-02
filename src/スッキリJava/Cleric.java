package スッキリJava;

import java.util.Random;

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
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間点に祈った！");
		
//		理論上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;
//		実際の回復量を計算する
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
