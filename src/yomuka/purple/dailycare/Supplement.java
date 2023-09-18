package yomuka.purple.dailycare;

import java.util.Scanner;
import yomuka.garden.customer_part.Customer;
import yomuka.garden.pet_part.PetHash;

public class Supplement {
	int food;
	int water;
	
	
	public static void supplement(Customer customer,PetHash petHash) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡");
		System.out.println();	
		System.out.println("              영양제를 선택하셨습니다.");
		System.out.println("                영양제를 주셨나요?");
		System.out.println();
		System.out.println("                [1]예  [2]돌아가기");
		System.out.println();
		System.out.println("｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡♥｡‧˚♡˚ ‧｡");
		
		switch(sc.next()) {
		case "1" : 
			petHash.allPetName(customer);
			System.out.print("에게 영양제를 주셨군요!");
			customer.point += 5;
			System.out.println("포인트 적립 완료! +5 point");
			// 포인트적립
			break;
		case "2" :
			System.out.println("챙겨주고 다시 들어오셔서 point 적립받으세요~");
			break;
		default : 
			System.out.println("다시 입력해주세요.");
			break;
		}	
		
	}

}
