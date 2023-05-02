package スッキリJava;

public class Thief {
	String name;
	int hp;
	int mp;

  //コンストラクタ定義
	public Thief (String name, int hp, int mp) {
		
	}
	
	public Thief (String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief (String name) {
		this(name, 40);
	}
}


