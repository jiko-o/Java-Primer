public class Wand{
	private String name;
	private double power;
	
	public String getName() { return this.name; }
	public void setName(String name) { 
		if (name==null || name.length()<3){
			throw new IllegalArgumentException
				("杖に設定しようとしている名前が異常です");
		}	
		this.name = name; 
	}
	
	public double getPower() { return this.power; }
	public void setPower(int power) { 
		if (power < 0.5 || 100 < power){
			throw new IllegalArgumentException
				("杖の魔力に設定しようとしている値が異常です");
		}
		this.power = power; 
	}
}