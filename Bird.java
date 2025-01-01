import Java.util.*
public class Bird extends Animal {
	
	private String featherColour;
	private Random r;
	public Bird(){}
	
	public getFeatherColour(){
		
		return featherColour;
	}
		
	public String[] rollColours() {
    int pick = new Random().nextInt(Feathercolours.values().length);
    return FeatherColours.values()[pick].;
	}
	
		
	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}
	
	
	public String getData() {
		String data = "Bird" + " " +  super.getData() + " " + featherColour;
		return data;
	}	
	
}