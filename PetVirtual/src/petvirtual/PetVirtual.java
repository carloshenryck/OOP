package petvirtual;

public class PetVirtual {
	private int energyMax, hungryMax, cleanMax;
	private int diamonds, energy, hungry, clean, age;
	private boolean alive;
	
	public PetVirtual(int energyMax, int hungryMax, int cleanMax) {
		this.cleanMax = cleanMax;
		this.hungryMax = hungryMax;
		this.energyMax = energyMax;
		
		this.energy = energyMax;
		this.clean = cleanMax;
		this.alive = true;
	}
	
	private void setEnergy(int value) {
		if(value > energyMax) {
			this.energy = energyMax;
		} else {
			this.energy = value;
		}
	}
	
	private void setHungry(int value) {
		if(value > hungryMax) {
			this.hungry = hungryMax;
		} else if(value < 0) {
			this.hungry = 0;
		} else {
			this.hungry = value;
		}
	}
	
	private void setAge(int value) {
		this.age = value;
	}
	
	private void setClean(int value) {
		if(value > cleanMax) {
			this.clean = cleanMax;
		} else {
			this.clean = value;
		}
	}
	
	public int getDiamonds() {
		return this.diamonds;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public int getHungry() {
		return this.hungry;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getClean() {
		return this.clean;
	}
	
	public boolean getAlive() {
		return this.alive;
	}
	
	public void play() {
		if(alive) {
			this.diamonds += 1;
			setHungry(getHungry() + 1);
			setEnergy(getEnergy() - 1);
			setClean(getClean() - 1);
			
			System.out.println("Seu pet está brincando!");
			
			if(getEnergy() == 0 && getClean() == 0) {
				System.out.println("Seu pet morreu sujo e sem energia");
				this.alive = false;
			} else if(getEnergy() == 0) {
				System.out.println("Seu pet morreu sem energia");
				this.alive = false;
			} else if(getClean() == 0){
				System.out.println("Seu pet morreu de sujeira");
				this.alive = false;
			}
			
			if(alive) {
				setAge(getAge() + 1);
			}
		} else {
			System.out.println("Ação inválida, seu Pet está morto!");
		}
		
	}
	
	public void shower() {
		if(alive) {
			setClean(getClean() + 1);
			setHungry(getHungry() + 1);
			setEnergy(getEnergy() - 1);
			
			System.out.println("Seu pet está tomando banho!");
			
			if(getEnergy() == 0) {
				System.out.println("Seu pet morreu sem energia");
				this.alive = false;
			}
			
			if(alive) {
				setAge(getAge() + 1);
			}
		} else {
			System.out.println("Ação inválida, seu Pet está morto!");
		}
	}
	
	public void eat() {
		if(alive) {
			setHungry(getHungry() - 1);
			setEnergy(getEnergy() + 1);
			setClean(getClean() - 1);
			
			System.out.println("Seu pet está comendo!");
			
			if(getClean() == 0) {
				System.out.println("Seu pet morreu de sujeira");
				this.alive = false;
			}
			
			if(alive) {
				setAge(getAge() + 1);
			}
		} else {
			System.out.println("Ação inválida, seu Pet está morto!");
		}
	
	}
	
	public void sleep() {
		if(alive) {
			setEnergy(getEnergy() + 1);
			
			System.out.println("Seu pet está dormindo!");
		}
			
		
		if(alive) {
			setAge(getAge() + 1);
		}
		
	}
	
	public void show() {
		System.out.println("Informações do Pet: ");
		System.out.println("Está vivo? " + (getAlive()? "Sim" : "Não"));
		System.out.println("Fome: " + getHungry());
		System.out.println("Limpeza: " + getClean());
		System.out.println("Idade: " + getAge());
		System.out.println("Energia: " + getEnergy());
		System.out.println("Diamantes: " + getDiamonds());
	}
    
}
