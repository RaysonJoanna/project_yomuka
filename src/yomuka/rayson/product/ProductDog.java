package yomuka.rayson.product;

import yomuka.rayson.template.Define;

// 강아지 물건 추가
public class ProductDog extends Product{
	
	public static int i = 0;
	
	public ProductDog() {}
	
	public ProductDog(String productName, String sortNum, int amount, int price) {
		this.productName = productName;
		this.sortNum = sortNum;
		this.amount = amount;
		this.price = price;	
		this.productNum = createProductNum(sortNum);
	}
	
	public String createProductNum(String sortNum) {
		if (sortNum.equals(Define.SUPPLEMENT)) {
			i++;
			productNum = Define.DOG + Define.SUPPLEMENT + String.valueOf(i);	
			return productNum;
		} else if (sortNum.equals(Define.FEED)) {
			i++;
			productNum = Define.DOG + Define.FEED + String.valueOf(i);				
			return productNum;
		} else if (sortNum.equals(Define.SNACK)) {
			i++;
			productNum = Define.DOG + Define.SNACK + String.valueOf(i);	
			return productNum;
		} else {
			return "제품의 분류번호를 확인해주세요.";
		}
	}
	
	public String ProductNumber(ProductDog pd) {
		return pd.productNum;
	}
}