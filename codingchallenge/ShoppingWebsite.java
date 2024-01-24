package codingchallenge;
class Customer{
	int id;
	String name,address;
	double walletBalance;
	public Customer(int id, String name, String address, double walletBalance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.walletBalance = walletBalance;
	}
}
class Item{
	int id;
	String name,comName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String comName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.comName = comName;
		this.price = price;
		this.isInStock = isInStock;
	}
}
public class ShoppingWebsite {
	public String purchaseItem(Item i,Customer c) throws ItemOutOfStockException,InsufficientBalanceException{
		if(!i.isInStock) {
			throw new ItemOutOfStockException("Item is out of Stock");
		}
		if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException("Customer wallet balance is not sufficient");
		}
		return "Order Successfull";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cusDet = new Customer(1004,"Varshini","India",6500.0);
		Item itemDet = new Item(345,"Saree","Saravanas",1500,true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out="";
		try {
			out = obj.purchaseItem(itemDet, cusDet);
		}
		catch(ItemOutOfStockException|InsufficientBalanceException e){
			out=e.getMessage();
		}
		System.out.println(out);
	}
}

