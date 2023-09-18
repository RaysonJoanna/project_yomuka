package yomuka.purple.weekly;

import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.Pet;
import yomuka.garden.pet_part.PetHash;


public class Management {

	public static void management(Customer customer,PetHash petHash) {
		Scanner sc = new Scanner(System.in);
		Pet myPet = new Pet();
		
		System.out.println("기초관리를 선택하셨습니다.");
		System.out.println("기초관리에는 발톱관리,발털관리,지저분한 털정리,"
				+ "항문낭 관리,눈꼽정리 등이 있습니다. 해주셨나요? ");
		System.out.println("[1]예  [2]돌아가기");

		switch(sc.next()) {
		case "1" : 
			System.out.println("체크할 반려동물을 골라주세요!");
			petHash.allPetName(customer);
			int petNum1 = sc.nextInt();
			myPet = petHash.returnPet(customer, petNum1);
			System.out.println(myPet.name + "이/가 깔끔해지게 신경써주세요!");
			
			customer.point += 10;  	// 포인트적립
			System.out.println("포인트 적립 완료! +10 point");
		case "2" :
			System.out.println("다음 주에는 잊지말고 챙겨주세요!");
			break;
		default : 
			System.out.println("다시 입력해주세요.");
			break;
		}	

	}

}
