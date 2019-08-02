public class Computer extends TangibleAsset{
	private string makerName;
	public Computer(String name, int price, String color, String markerName){
		super(name, price, color);
		this.markerName = markerName;
	}
	public String getMarkerName() { return this.markerName;}
}