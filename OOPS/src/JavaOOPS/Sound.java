package JavaOOPS;

public interface Sound {
	//void makeSound();
	
	default void makeSound() {
		System.out.println("hello");
	}
}
