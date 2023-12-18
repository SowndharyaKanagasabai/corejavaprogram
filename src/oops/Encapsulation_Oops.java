package oops;

class Dog{
	String name;
	String color;
	String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Encapsulation_Oops {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.setName("libi");
		obj.setColor("Sandal");
		obj.setBreed("Labrador");
		System.out.println("Name: "+obj.getName());
		System.out.println("Color: "+obj.getColor());
		System.out.println("Breed: "+obj.getBreed());
		
		

	}

}
