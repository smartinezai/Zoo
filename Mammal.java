public class Mammal extends Animal {
	private String furColour;
	private String food;
	private boolean hasFur;
	
	public Mammal(){}
	
		
	public getfurColour(){
		if (hasFur == true) {
			return furColour;
		} else return "No fur"; 
	}
		
	public void setFurColour(String furColour) {
		if {FurColours.valueOf
		this.furColour = furColour;
	}
	
	public FurColours rollColours() {
    int pick = new Random().nextInt(Furcolours.values().length);
    return FurColours.values()[pick];
	}
	
	
	public String getFood(){
		return food;
	}
	
	public void setFood (String food) {
		this.food = food;
	}
	
	public String getData() {
		String data = "Mammal" + " " + super.getData() + " " + furColour + " " +food;
		return data;
	}	
		
	
}	