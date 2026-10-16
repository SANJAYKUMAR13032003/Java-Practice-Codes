package OOPS;

class Animal{
	int ID = 1;
	static String name = "Animal";
	
	public void printID() {
		System.out.println("ID = "+ID);
	}	
	
	public static void printName() {
		System.out.println("Name = "+name);
	}
	
	public void sound() {
		System.out.println("Animal put sound");
	}
	
}

class Dog extends Animal{
	
	public void sound() {
		System.out.println("Dog put sound");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		System.out.println(d1.ID);
		System.out.println(Dog.name);
		d1.printID();
		Dog.printName();
		d1.sound();
	}
}