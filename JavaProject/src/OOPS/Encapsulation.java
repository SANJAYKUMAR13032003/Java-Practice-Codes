package OOPS;

class Encapsule{
	
	private int ID = 10;
	private String name = "Sanjay";
	
	public void getID() {
		System.out.println("Your ID is "+ID);
	}
	
	public void getName() {
		System.out.println("Your ID is "+name);
	}
	
	public void setID(int ID) {
		this.ID = ID;
		System.out.println("ID is updated");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Name is updated");
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Encapsule E1 = new Encapsule();
		
		Encapsule E2 = new Encapsule();
		
		E1.getID();
		E1.getName();
		E1.setID(999);
		E1.setName("Sanjaykumar");
		E1.getID();
		E1.getName();
		
		E2.getID();
		E2.getName();
	}

}
