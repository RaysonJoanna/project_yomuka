package yomuka.rayson.product;

import java.util.HashMap;
import java.util.Iterator;

import yomuka.rayson.template.Define;

public class ProductList extends Product {
	public HashMap<Integer, Product> productList;

	public ProductList() {
		productList = new HashMap<Integer, Product>();
	}

	// 제품 리스트에 제품 추가
	public void addProduct(String productNum, Product product) {
		productList.put(Integer.parseInt(productNum), product);
	}

	// 제품 리스트에 제품 제거
	public boolean removeProduct(String productNum) {
		if (productList.containsKey(Integer.parseInt(productNum))) {
			productList.remove(Integer.parseInt(productNum));
			return true;
		}
		System.out.println("해당 " + productNum + "가 존재하지 않습니다.");
		return false;
	}

	// 제품리스트 안내
	public void showList() {
		Iterator<Integer> ir = productList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Product product = productList.get(key);
			System.out.println(product);
		}
		System.out.println();
	}

	// 강아지나 고양이 제품 리스트 안내
	public void dogOrCatList(int i) {
		Iterator<Integer> ir = productList.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Product product = productList.get(key);
			if (i == Integer.parseInt(Define.DOG)) {
				if (product.productNum.substring(0,1).equals(Define.DOG)) {
					System.out.println(product);
				} 
			} else if (i == Integer.parseInt(Define.CAT)) {
				if (product.productNum.substring(0,1).equals(Define.CAT)) {
					System.out.println(product); 
				} 
			}
		}
	}
}
