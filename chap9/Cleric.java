public class Cleric{
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	Cleric(String name, int hp){
		this(name, hp, Cleric.MAX_MP);
	}
	Cleric(String name){
		this(name, Cleric.MAX_HP, Cleric.MAX_MP);
	}


	public void selfAid(){
		if (this.mp >=5){
			this.hp = MAX_HP;
			mp = mp - 5;
			System.out.println(this.name + "はセルフエイドを唱えた。HPが全回復した。");
		} else{
			System.out.println("MPが足りない。");
		}
	}
	public int pray(int pray_time){
		int recovery = pray_time + new java.util.Random().nextInt(2);
		return Math.min(MAX_MP, this.mp + recovery);
	}
}