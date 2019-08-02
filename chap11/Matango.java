public class Matango{
	int hp = 50;
	private char suffix;
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}
}

public class PoisonMatango extends Matango{
	private int poisonCount = 5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	public void attack(Hero h){
		super.attack();
		if (this.posionCount >= 1) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = g.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.printf("%dポイントのダメージを与えた", dmg);
			this.poisonCount--;
		}
	}
}