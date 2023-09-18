package yomuka.garden.method;

import java.util.Scanner;
import yomuka.garden.customer_part.Customer;
import yomuka.garden.customer_part.CustomerHash;
import yomuka.garden.customer_part.VIPCustomer;
import yomuka.garden.pet_part.Cat;
import yomuka.garden.pet_part.Dog;
import yomuka.garden.pet_part.PetHash;

public class Main {

	public void setCustomerPet(CustomerHash customerHash, PetHash petHash) {
		Scanner scanner;

		Customer customerKim = new Customer("김정원", "asdasdf2", "1234");
		customerKim.setPoint(4500);
		customerHash.addCustomer(customerKim.customerNum, customerKim);

		VIPCustomer customerLee = new VIPCustomer("이보라", "zxczxc", "4321");
		customerLee.setPoint(13500);
		customerHash.addCustomer(customerLee.customerNum, customerLee);

		Cat cat1 = new Cat("삼색이", 2, "길냥이", 1, 5.3);
		cat1.RER = Math.pow(cat1.getWeight(), cat1.b);
		cat1.setFood(70 * cat1.RER * 1.4); //
		petHash.addPet(customerLee, cat1);

		Dog dog1 = new Dog("덕보", 2, "말티즈", 1, 3.3);
		dog1.setFood(dog1.getWeight() * 40); //
		petHash.addPet(customerLee, dog1);

		Dog dog2 = new Dog("보풀", 0, "말티즈", 0, 2.7);
		dog2.setFood(dog2.getWeight() * 40); //
		petHash.addPet(customerLee, dog2);

		Dog dog3 = new Dog("꼬뭉", 9, "말티즈", 1, 3.5);
		dog3.setFood(dog3.getWeight() * 40); //
		petHash.addPet(customerKim, dog3);
	}

	public void newPetSign(PetHash petHash, Customer customer) {
		Scanner sc = new Scanner(System.in);
	
			System.out.print("반려동물 종을 입력해주세요: " + "강아지 , 고양이" + " 라고 정확하게 입력해주세요");
			String p_type = sc.nextLine();
			System.out.print("반려동물 이름을 입력해주세요: ");
			String name = sc.nextLine();
			System.out.print("반려동물 나이를 입력해주세요: ");
			String age = sc.nextLine();
			System.out.print("반려동물 종을 입력해주세요: ");
			String type = sc.nextLine();
			System.out.print("중성화 여부를 입력해주세요 (1: 중성화, 0: 중성화되지 않음): ");
			String neu = sc.nextLine();
			System.out.print("반려동물 체중을 입력해주세요: ");
			double weight = sc.nextDouble();

			if (p_type.equals("강아지")) {
				Dog newDog = new Dog(name, Integer.parseInt(age), type, Integer.parseInt(neu), weight);
				newDog.setFood(newDog.getWeight() * 40);
				petHash.addPet(customer, newDog);
				System.out.println("반려동물이 등록되었습니다.");

			} else if (p_type.equals("고양이")) {
				Cat newCat = new Cat(name, Integer.parseInt(age), type, Integer.parseInt(neu), weight);
				newCat.RER = Math.pow(weight, newCat.b);
				petHash.addPet(customer, newCat);
				System.out.println("반려동물이 등록되었습니다.");

			} else {
				System.out.println("강아지나, 고양이를 정확히 입력해주세요.");
			}
			
		
	}
}