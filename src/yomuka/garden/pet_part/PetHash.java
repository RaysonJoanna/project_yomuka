package yomuka.garden.pet_part;

import java.util.ArrayList;
import java.util.HashMap;

import yomuka.garden.customer_part.Customer;

public class PetHash {
	HashMap<Integer, ArrayList<Pet>> petHash = new HashMap<>();
	ArrayList<Pet> petArrayList;
	public static int addNum = 0;

	public void addPet(Customer customer, Pet pet) {
		if (petHash.containsKey(customer.customerNum)) {
			petHash.get(customer.customerNum).add(pet);
		} else {
			ArrayList<Pet> petArraylist = new ArrayList<>();
			petArraylist.add(pet);
			petHash.put(customer.customerNum, petArraylist);
		}
//		petArrayList.add(pet);
//		petHash.put(customer.customerNum, petArrayList);
	}

	public boolean existence(Customer customer) {
		if (petHash.get(customer.customerNum) != null) {
			return true;
		} else
			return false;
	}

	public void removeAllPet(Customer customer, Pet pet) {
		petHash.remove(customer.customerNum);
	}

	public void getPet(Customer customer, int num) {
		petHash.get(customer.customerNum).get(num - 1).petInfo();
	}

	public Pet returnPet(Customer customer, int num) {
		return petHash.get(customer.customerNum).get(num - 1);
	}

	public void displayAllPets(Customer customer) {
		for (int i = 0; i < petHash.get(customer.customerNum).size(); i++) {
			petHash.get(customer.customerNum).get(i).petInfo();
		}
	}

	public void allPetName(Customer customer) {
		for (int i = 0; i < petHash.get(customer.customerNum).size(); i++) {
			System.out.print(petHash.get(customer.customerNum).get(i).name + " ");
		}
	}

	public boolean onlyCat(Customer customer) {
		boolean result = true;
		for (int i = 0; i < petHash.get(customer.customerNum).size(); i++) {
			for (Pet p : petHash.get(customer.customerNum)) {
				if (p instanceof Cat) {
					result = true;
				} else
					result = false;
			}
		}
		return result;
	}

	public String catName(Customer customer) {
		String name = "";
		for (int i = 0; i < petHash.get(customer.customerNum).size(); i++) {
			for (Pet p : petHash.get(customer.customerNum)) {
				if (p instanceof Cat) {
					name = p.name;
				} else
					name = "오류";
			}
		}
		return name;
	}

}
