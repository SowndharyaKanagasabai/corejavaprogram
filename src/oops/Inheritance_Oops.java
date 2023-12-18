package oops;
//MULTILEVEL INHERITANCE
class grandfather
{
    void land()
    {
        System.out.println("have own a 5arc land");
    }
}
class father extends  grandfather
{
    void house()
    {
        System.out.println("he own a 2BHK house");
    }
}
class son extends father
{
    void car()
    {
        System.out.println("have own a Audi car");
    }
}
public class Inheritance_Oops {

	public static void main(String[] args) {
	    son  obj=new son();
		obj.land();
		obj.house();
		obj.car();
	}
}
