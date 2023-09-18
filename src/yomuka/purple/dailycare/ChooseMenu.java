package yomuka.purple.dailycare;

import java.util.Scanner;
import yomuka.garden.customer_part.*;
import yomuka.garden.pet_part.PetHash;

public class ChooseMenu {

	public void choosemenu(Customer customer,PetHash petHash){
		Scanner sc = new Scanner(System.in);
		
		boolean dailyCare = true;
			
		while(dailyCare) {
			System.out.println("Daily Care를 선택하셨습니다.");
			System.out.println("Daily Care의 메뉴를 선택하세요.");
			System.out.println("[1]영양제  [2]사료&음수량 체크  [3]사냥놀이 or 산책  "
					            + "[4]빗질  [5]양치  [6]돌아가기");
			int menu =sc.nextInt();
			switch(menu) {
			case 1 :  // 영양제 
				Supplement.supplement(customer,petHash);
				System.out.println();
				break;
				
			case 2 :  // 사료&음수량 체크
				FoodWater.foodwater(customer,petHash);
				System.out.println();
				break;
				
			case 3 :  //  사냥놀이 or 산책
				Play.playWalk(customer,petHash);
				System.out.println();
				break;
				
			case 4 :  // 빗질
				Brush.brush(customer,petHash);
				System.out.println();
				break;
				
			case 5 :  // 양치
				Teeth.brushTeeth(customer,petHash);;
				System.out.println();
				break;
				
			case 6 :  // 돌아가기
				dailyCare = false;
				break;
			default :
				System.out.println("다시 입력하세요.");
				break;
			}
		}
	}
}

