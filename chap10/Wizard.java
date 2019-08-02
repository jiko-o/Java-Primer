public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public int getHp() { return this.hp ;}
	public void setHp(int hp) { 
		this.hp= Math.max(hp, 0);
	}
	
	public int getMp() { return this.mp ;}
	public void setMp(int mp) { 
		if (Mp < 0){
			throw new IllegalArgumentException
				("設定しようとしてるmpの値が異常です");
		}	
		this.mp=mp;
	}
	
	public String getName() { return this.name ;}
	public void setName(String name) { 
		if (name==null || name.lengt() < 3 {
			throw new IllegalArgumentException
				("魔女に設定されようとしている名前が以上です");
		}
		this.name=name;
	}
	
	public Wabd getWand() { return this.wand ;}
	public void setWand(Wand wand) { 
		if (wand==null){
			throw new IllegalArgumentException
				("杖を設定してください");
		}	
		this.wand=wand;
	}

	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
}