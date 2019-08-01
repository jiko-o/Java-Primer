public class Cleric{
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
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