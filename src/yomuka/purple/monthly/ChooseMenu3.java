package yomuka.purple.monthly;

import java.util.Scanner;
import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.PetHash;

public class ChooseMenu3 {

	public void choosemenu3(Customer customer,PetHash petHash){
		Scanner sc = new Scanner(System.in);
		
		boolean monthlyCare = true;
		
		while(monthlyCare) {
			System.out.println("Monthl Care를 선택하셨습니다.");
			System.out.println("Monthl Care의 메뉴를 선택하세요.");
			System.out.println("[1]외부기생충 약  [2]심장사상충  [3]화장실 청소(고양이만)"
								+ "  [4]돌아가기");
			
			switch(sc.next()) {
			
			case "1" :  // 외부기생충 먹었나요?
				Ectoparasite.ectoparasite(customer,petHash);
				System.out.println();
				break;
				
			case "2" :  // 심장사상충 먹었나요?
				HeartWorm.heartworm(customer,petHash);
				System.out.println();
				break;
				
			case "3" :  // 화장실 청소
				ToiletCat.toilet(customer,petHash);
				System.out.println();
				break;
				
			case "4" :  // 돌아가기
				monthlyCare = false;
			default :
				System.out.println("다시 입력하세요.");
				break;
			}
		}
	}

}
