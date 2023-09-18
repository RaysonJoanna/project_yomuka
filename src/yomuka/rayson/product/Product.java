package yomuka.rayson.product;

public class Product {
	public String productName;
	public String productNum;
	public String sortNum;
	public int amount;
	public int price;

	public Product() {}
	
	public Product(String productName, String sortNum, int amount, int price) {
		this.productName = productName;
		this.sortNum = sortNum;
		this.amount = amount;
		this.price = price;	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return productNum + " / " + productName + " / " + price + "원";
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(productNum);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product product = (Product) obj;
			if(this.productNum.equals(product.productNum)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
