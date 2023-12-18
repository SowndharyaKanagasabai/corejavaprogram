package oops;

class Method{
	private int length, width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if(length>0)
			this.length = length;
		else
			this.length = 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width>0)
			this.width = width;
		else
			this.width = 0;
	}
	void area(){
		int a=length*width;
		System.out.println("Area of Rectangle: "+a);
	}
}

public class DataHiding_Get_Set_Method {

	public static void main(String[] args) {
		Method o=new Method();
		o.setLength(-103007
				);
		o.setWidth(20);
		o.area();
		System.out.println("Length: "+o.getLength());
		System.out.println("Width: "+o.getWidth());
	}

}
