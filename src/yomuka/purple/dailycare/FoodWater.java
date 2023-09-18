package yomuka.purple.dailycare;

import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.Pet;
import yomuka.garden.pet_part.PetHash;

public class FoodWater {
		
	public static void foodwater(Customer customer,PetHash petHash){
			
		Pet myPet = new Pet();
		Scanner sc = new Scanner(System.in);
		
		double food;
		double water;
		boolean checkin = true;
		
		while(checkin) {
		System.out.println("사료&음수량 체크를 선택하셨습니다.");
		System.out.println("[1]사료량 체크  [2]음수량 체크  [3]돌아가기");
		
		String check = sc.nextLine();
		
		switch(check) {
			case "1" :   // 사료양 체크
				System.out.println("체크할 반려동물을 골라주세요!");
				petHash.allPetName(customer);
				int petNum1 = sc.nextInt();
				myPet = petHash.returnPet(customer, petNum1);
				double RER = Math.pow(myPet.weight, 0.75);
				System.out.println(myPet.name + "의 하루권장량을 체크합니다.");
				System.out.println(myPet.name + "의 하루권장량은 " + (int)(myPet.weight*RER*1.2) + "입니다.");
				customer.point += 5; 	// 포인트적립
				
				// 사료량 받아오기
				System.out.println("포인트 적립 완료! +5 point");
				break;
				
			case "2" :   // 음수량 체크
				System.out.println("체크할 반려동물을 골라주세요!");
				petHash.allPetName(customer);
				int petNum2 = sc.nextInt();
				myPet = petHash.returnPet(customer, petNum2);
				water = myPet.weight * 50;
				System.out.println(myPet.name + "의 하루 적정 음수량은 " + (int)water + "ml 입니다.");
				customer.point += 5;   	// 포인트적립
				System.out.println("포인트 적립 완료! +5 point");
				System.out.println();
				break;
				
			case "3" :  // 돌아가기
				checkin = false;
				break;
			default :
				System.out.println("다시 입력하세요.");
				break;
			}
		}
	}
}
