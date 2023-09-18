package yomuka.rayson.product;

import yomuka.rayson.template.Define;

//고양이 물건 추가
public class ProductCat extends Product {

	public static int i = 0;

	public ProductCat() {}
	
	public ProductCat(String productName, String sortNum, int amount, int price) {
		this.productName = productName;
		this.sortNum = sortNum;
		this.amount = amount;
		this.price = price;
		this.productNum = createProductNum(sortNum);
	}

	public String createProductNum(String sortNum) {
		if (sortNum.equals(Define.SUPPLEMENT)) {
			i++;
			productNum = Define.CAT + Define.SUPPLEMENT + String.valueOf(i);
			return productNum;
		} else if (sortNum.equals(Define.FEED)) {
			i++;
			productNum = Define.CAT + Define.FEED + String.valueOf(i);
			return productNum;
		} else if (sortNum.equals(Define.SNACK)) {
			i++;
			productNum = Define.CAT + Define.SNACK + String.valueOf(i);
			return productNum;
		} else {
			return "제품의 분류번호를 확인해주세요.";
		}
	}
	public String ProductNumber(ProductCat pc) {
		return pc.productNum;
	}
}
