package oops;


class Shape{ // one base class
    float length,breath,radius;   
}//HIERARCHICAL INHERITANCE
class Rect extends Shape{ // multiple derived class
    public Rect(float l,float b){
      length=l;
      breath=b;
    }
    float reactangle_area(){
        return length*breath;
    }
}
class Circle extends Shape{
    public Circle(int r){
        radius=r;
    }
    float circle_area(){
        return radius*radius;
    }
}
class Square extends Shape{
    public Square (float l){
        length=l;
    }
    float square_area(){
        return (length*length);
    }
}
public class Hierachical_Oop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect o1=new Rect(8,6);
	      System.out.println("Area of Rectangle:"+o1.reactangle_area());
	      
	      Circle o2=new Circle(5);
	      System.out.println("Area of circle:"+o2.circle_area());
	      
	      Square o3=new Square(6);
	      System.out.println("Area of square:"+o3.square_area());
	      

	}

}
