package JavaOOPS;

public class Dog extends Animal implements Omnivore {

	@Override
	public void eatAll() {
		System.out.println("Dog eats Roti and Meat.");		
	}

	@Override
	public void drink() {
		System.out.println("Dog Dring water");		
	}

//	@Override
//	public void makeSound() {
//		System.out.println("Dog is making vierd sounds");
//		
//	}
//	
	

}
