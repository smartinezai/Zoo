public class Animal {
	private String gender;
	private String name;
	private String noise;
	
	public Animal(){}
	
	private String rollGender() {
			String[] genderList = {"Male","Female","Hermaphrodite"};
			Random rand = new Random();
	String gender = genderList[(int(rand*3))];
			return gender;
		}
	
	public getName(){
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getNoise() {
		return noise;
	}
	
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public String getData() {
			String data;
			data = (gender + " " + name + " " + noise + " ");
			return data;
	}	
}	