package yomuka.purple.dailycare;


import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.Pet;
import yomuka.garden.pet_part.PetHash;

public class Brush {

	public static void brush(Customer customer,PetHash petHash) {
		Scanner sc = new Scanner(System.in);
		Pet myPet = new Pet();
		
		System.out.println("빗질을 선택하셨습니다.");
		System.out.println("빗질을 시키시겠습니까?");
		System.out.println("[1]예  [2]돌아가기");

		switch(sc.next()) {
		case "1" : 
			System.out.println("체크할 반려동물을 골라주세요!");
			petHash.allPetName(customer);
			int petNum1 = sc.nextInt();
			myPet = petHash.returnPet(customer, petNum1);
			System.out.println(myPet.getName() + "의 엉킨 털을 풀어주세요!");
			customer.point += 5;  	// 포인트적립
			System.out.println("포인트 적립 완료! +5 point");
		case "2" :
			break;
		default : 
			System.out.println("다시 입력해주세요.");
			break;
		}	
	}

}
