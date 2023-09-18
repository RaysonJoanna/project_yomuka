package yomuka.purple.weekly;

import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.PetHash;

public class ChooseMenu2 {

	public void choosemenu2(Customer customer,PetHash petHash){
		Scanner sc = new Scanner(System.in);
		
		boolean weeklyCare = true;
		
		while(weeklyCare) {
			System.out.println("Weekly Care를 선택하셨습니다.");
			System.out.println("Weekly Care의 메뉴를 선택하세요.");
			System.out.println("[1]목욕시키기  [2]기초관리 여부  [3]돌아가기");
			
			switch(sc.next()) {
			case "1" :
				Shower.shower(customer,petHash);
				System.out.println();
				break;
				
			case "2" :
				Management.management(customer,petHash);
				System.out.println();
				break;
				
			case "3" :
				weeklyCare = false;
				break;
			default :
				System.out.println("다시 입력하세요.");
				break;
			}
		}
	}

}
