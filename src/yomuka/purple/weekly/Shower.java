package yomuka.purple.weekly;

import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.Pet;
import yomuka.garden.pet_part.PetHash;

public class Shower {

	public static void shower(Customer customer,PetHash petHash) {
		Pet myPet = new Pet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("목욕하기를 선택하셨습니다.");
		System.out.println("목욕을 시키시겠습니까?");
		System.out.println("[1]예  [2]돌아가기");

		switch(sc.next()) {
		case "1" : 
			System.out.println("체크할 반려동물을 골라주세요!");
			petHash.allPetName(customer);
			int petNum1 = sc.nextInt();
			myPet = petHash.returnPet(customer, petNum1);
			System.out.println("다음 주에도 뽀송한 " + myPet.name + "의 모습이 유지됩니다!");
			customer.point += 10;  	// 포인트적립
			System.out.println("포인트 적립 완료! +10 point");
		case "2" :
			break;
		default : 
			System.out.println("다시 입력해주세요.");
			break;
		}	
	}

}
