package abstraction;

public class Product {
	private static String getProductId;
	private int productId;
	private String productName;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args)
	{
		Product pro = new Product();
		pro.setProductId(101);
		pro.setProductName("Mobile");
		pro.setPrice(25000);
		System.out.println("Product Id: "+pro.getProductId());
		System.out.println("Product Name: "+pro.getProductName());
		System.out.println("Product Price: "+pro.getPrice());
	}
}
