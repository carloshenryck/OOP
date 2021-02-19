package petvirtual;

public class TestePet {
	
	public static void main(String[] args) {
		PetVirtual tamagoshi = new PetVirtual(3, 3, 3);
		tamagoshi.show();
		/* Sa�da esperada: 
		diamonds = 0
		energy = 3
		hungry = 0
		clean = 3
		age = 0 
		*/
					
		tamagoshi.play();
		// Sa�da esperada: 
		// Seu pet est� brincando!
		
		tamagoshi.show();		
		/* Sa�da esperada: 
		diamonds = 1
		energy = 2
		hungry = 1
		clean = 2
		age = 1 
		*/
		
		tamagoshi.shower();
		// Sa�da esperada: 
		// Seu pet est� tomando banho!
		
		tamagoshi.show();		
		/* Sa�da esperada: 
		diamonds = 1
		energy = 1
		hungry = 2
		clean = 3
		age = 2 
		*/
		
		tamagoshi.eat();
		// Sa�da esperada: 
		// Seu pet est� comendo!
		
		tamagoshi.show();
		/* Sa�da esperada: 
		diamonds = 1
		energy = 2
		hungry = 1
		clean = 2
		age = 3
		*/

		tamagoshi.eat();
		// Sa�da esperada: 
		// Seu pet est� comendo!	
		
		tamagoshi.shower();
		// Sa�da esperada: 
		// Seu pet est� tomando banho!
		
		tamagoshi.play();
		// Sa�da esperada: 
		// Seu pet est� brincando!
		
		tamagoshi.show();		
		/* Sa�da esperada: 
		diamonds = 2
		energy = 1
		hungry = 2
		clean = 1
		age = 6
		*/
			
		tamagoshi.play();
		// Seu pet est� brincando!
		// Seu pet morreu sem energia!
		// Seu pet morreu sujo!
		
		tamagoshi.show();		
		/* Sa�da esperada: 
		diamonds = 3
		energy = 0
		hungry = 3
		clean = 0
		age = 6
		*/
		
	}

}