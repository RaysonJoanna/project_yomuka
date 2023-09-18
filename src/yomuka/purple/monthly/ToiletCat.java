package yomuka.purple.monthly;

import java.util.Scanner;

import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.Pet;
import yomuka.garden.pet_part.PetHash;


public class ToiletCat {

	public static void toilet(Customer customer,PetHash petHash) {
		Scanner sc = new Scanner(System.in);
		Pet myPet = new Pet();
		boolean checkCat = true;
		
		System.out.println("화장실 청소를 선택하시겠습니까?");
		System.out.println("해당 메뉴는 고양이 전용입니다.");
		System.out.println("[1]예  [2]돌아가기");

		switch(sc.next()) {
			case "1" :   // 화장실 청소 할껀데 고양이만 할꼬임
				checkCat = petHash.onlyCat(customer);
				if(checkCat) {
					System.out.println("화장실을 청소해야만 " 
							+ petHash.catName(customer) + "의 배변생활이 만족스러워집니다.");
					customer.point += 15;
					System.out.println("포인트 적립 완료! +15 point");
				} else {
					System.out.println("고양이 전용 메뉴입니다.");
				}
//			System.out.println("화장실을 청소해야만 " + pet.getName() + "의 배변생활이 만족스러워집니다.");
//				if(pet.getType().equals("고양이")){
//					 
//				}else if(pet.getType().equals("강아지")){
//				System.out.println("강아지는 들어올 수 없습니다.");
//				}
//				
//				System.out.println("화장실 청소를 선택하셨습니다.");
//				System.out.println("깨끗한 화장실을 만들어주세요.");
//				// 고양이 회원만 들어오게 하기 
//				customerHash.customerHash.getid().point += 15;  	// 포인트적립
//				System.out.println("포인트 적립 완료! +15 point");
			case "2" :
				break;
			default :
				System.out.println("다시 입력하세요.");
				break;
		}
	}
}
