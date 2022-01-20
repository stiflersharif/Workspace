package JavaOOPS;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pamaleon pam = new Pamaleon();
		
		pam.setHeight(0.85);
		pam.setName("louis");
		pam.setWeight((float) 2.56273);
		
		pam.makeSound(pam);
		pam.eatAll();
		pam.drink();
		pam.makeSound();

	}

}
