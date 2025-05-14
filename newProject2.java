public class newProject2 {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in); 
		 

			System.out.println("Do you have a dog?");
			String stringInput = keyboard.nextLine();

			if(stringInput.equals("yes")){
				System.out.println("What is your dogs name?");
				java.util.Scanner keyboard2 = new java.util.Scanner(System.in); 
				String dogName = keyboard2.nextLine();
				System.out.println("...." + dogName + "?");
				System.out.println("What a strange name to give a dog...");
			}
			else if(stringInput.equals("maybe")){
				System.out.println("maybe?...IT'S A SIMPLE YES OR NO QUESTION YOU NIMROD!");
			}
			else if(stringInput.equals("no")){
				System.out.println("Lame. It would be a lot cooler if you did.");	
			} 			
			else{
				System.out.println("It's a simple yes or no, wiseguy.");
			}
			keyboard.close();

	}
}