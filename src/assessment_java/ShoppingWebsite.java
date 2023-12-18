package assessment_java;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String message) {
		super(message);
	}
}
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}	
}

class Item{
	int id;
	String name;
	String CompanyName;
	double price;
	boolean  isInstock;
	public Item(int id,String name,String CompanyName,double price,boolean isInstock) {
		this.id=id;
		this.name=name;
		this.CompanyName=CompanyName;
		this.price=price;
		this.isInstock=isInstock;
	}
}
class Shopping{
	public String purchaseItem(Item i,Customer c) throws InsufficientBalanceException,ItemOutOfStockException 
	{
		if(!i.isInstock) {
			throw new ItemOutOfStockException("item is out of stock");
		}
		else if(i.price > c.walletBalance) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
			
		}
		else {
			return "Order Successful";
		}
	}
}
public class ShoppingWebsite {
	public static void main(String[] args) {
		Customer cusDet =new Customer(927392,"Steve",5000.0,"USA");
		Item itemDet=new Item(27392,"T-Shirt","Us polo", 800,true);
		Shopping obj =new Shopping();
		try {
			String out=obj.purchaseItem(itemDet, cusDet);
			System.out.println(out);
			
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			
		} catch (ItemOutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}

}
