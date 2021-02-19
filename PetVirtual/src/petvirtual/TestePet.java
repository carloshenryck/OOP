package petvirtual;

public class TestePet {
	
	public static void main(String[] args) {
		PetVirtual tamagoshi = new PetVirtual(3, 3, 3);
		tamagoshi.show();
		/* Saída esperada: 
		diamonds = 0
		energy = 3
		hungry = 0
		clean = 3
		age = 0 
		*/
					
		tamagoshi.play();
		// Saída esperada: 
		// Seu pet está brincando!
		
		tamagoshi.show();		
		/* Saída esperada: 
		diamonds = 1
		energy = 2
		hungry = 1
		clean = 2
		age = 1 
		*/
		
		tamagoshi.shower();
		// Saída esperada: 
		// Seu pet está tomando banho!
		
		tamagoshi.show();		
		/* Saída esperada: 
		diamonds = 1
		energy = 1
		hungry = 2
		clean = 3
		age = 2 
		*/
		
		tamagoshi.eat();
		// Saída esperada: 
		// Seu pet está comendo!
		
		tamagoshi.show();
		/* Saída esperada: 
		diamonds = 1
		energy = 2
		hungry = 1
		clean = 2
		age = 3
		*/

		tamagoshi.eat();
		// Saída esperada: 
		// Seu pet está comendo!	
		
		tamagoshi.shower();
		// Saída esperada: 
		// Seu pet está tomando banho!
		
		tamagoshi.play();
		// Saída esperada: 
		// Seu pet está brincando!
		
		tamagoshi.show();		
		/* Saída esperada: 
		diamonds = 2
		energy = 1
		hungry = 2
		clean = 1
		age = 6
		*/
			
		tamagoshi.play();
		// Seu pet está brincando!
		// Seu pet morreu sem energia!
		// Seu pet morreu sujo!
		
		tamagoshi.show();		
		/* Saída esperada: 
		diamonds = 3
		energy = 0
		hungry = 3
		clean = 0
		age = 6
		*/
		
	}

}