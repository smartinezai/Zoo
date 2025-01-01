import Java.util.*
public  class ZooManager {
	ArrayList<String> animals = new ArrayList<String>();
	File file;

	public ZooManager(){
	}
	
	//the user creates a new animal through console prompts
	public void addAnimals(){
		int taxClass = 0;
		Scanner scanner = new Scanner();
		System.out.println("Press 1 for Bird or 2 for Mammal");
	
		while ( taxClass != 1|| taxClass != 2) {
			
			 int input = scanner.nextInt();
			if ( input == 1|| input == 2) {
				taxClass = input;
			} else {	
				System.out.println("ERROR: provided input is neither 1 nor 2, please try again.");
			}	
		 
		} 
		
		if (taxClass == 1) {
			System.out.println("Creating bird.");
			Bird newBird = new Bird();
			System.out.println("Please name created bird:");
			newBird.setName(scanner.next());
			System.out.println("Bird named " + newBird.getName() +".");
			System.out.println("Gender of " + newBird.getName() + " will now be randomised.";)
			newBird.setGender(rollGender());
			System.out.println("Gender of " + newBird.getName() + " is " + newBird.getGender() + ".");
			//RANDOMISE GENDER
			System.out.println("Please provide the sound to teach " + newBird.getName() +".");
			newBird.setNoise(scanner.next());
			System.out.println(newBird.getName() + " has learned the sound " + newBird.getNoise() + ".");
			System.out.println("Now determining the colour of " + newBird.getName() +"'s feathers.");
			//RANDOMISE FEATHER COLOUR	
			
			
			animals.add(newBird);
			System.out.println(newBird.getName() + " added to list of managed animals.");
		} else {
			System.out.println("Creating mammal.");
			Mammal newMammal = new Mammal();
			System.out.println("Please name created mammal:");
			newBird.setName(scanner.next());
			System.out.println("Mammal named " + newMammal.getName() +".");
			System.out.println("Gender of " + newMammal.getName() + "will now be randomised.";)
			//RANDOMISE GENDER
			System.out.println("Please provide the sound to teach " + newMammal.getName() +".");
			newMammal.setNoise(scanner.next());
			System.out.println(newMammal.getName() + " has learned the sound " + newMammal.getNoise() + ".");
			System.out.println("Now determining the colour of " + newMammal.getName() +"'s fur.");
			//RANDOMISE FUR COLOUR	
			
			
			animals.add(newMammal);
			System.out.println(newMammal.getName() + " added to list of managed animals.");
		}
	}
	//shows the animals that are managed by the zoo Keeper
	
	public String listAnimals()
		String animalList;
		for (Animal animal : animals ) {
			animalList += animal.getData();
		}	
		return animalList;
	}
	
	public void saveData() {
		file = new File("animalList.txt");
		if (!file.exists()) {
			try {
			PrintWriter out = new PrintWriter(new FileWriter(file));
			out.println(listAnimals());
			out.flush();
			out.close();
			}
			catch (IOException e) {
				System.out.println("File already exists.");
			}
		}	
		
	}
	
	public readData() {
		file = new File("animalList.txt");
		if (file.exists()) {
			
			try  {
				BufferedReader in = new BufferedReader(new FileReader(file))
					while (in.nextLine() != NULL) {
						String line = in.readLine();
						if (line.startsWith("Mammal")) {
							Mammal newMammal = newMammal();
						System.out.println(in.readLine());
					
					}
			}
		}
	}	
	
	public static void main(String[] args) {
		
	}
	
}	