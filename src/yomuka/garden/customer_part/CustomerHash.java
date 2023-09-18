package yomuka.garden.customer_part;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import yomuka.rayson.product.Product;

public class CustomerHash {
	public HashMap<Integer, Customer> customerHash = new HashMap<Integer, Customer>();

	public CustomerHash() {
	}

	public void addCustomer(int key, Customer customer) {
		customerHash.put(key, customer);
	}

	public void removeCustomer(int key) {
		customerHash.remove(key);
	}

	public Customer getCustomer(int key) {
		return customerHash.get(key);
	}

	public void displayAllCustomers() {
		for (Map.Entry<Integer, Customer> entry : customerHash.entrySet()) {
			int key = entry.getKey();
			Customer customer = entry.getValue();
			System.out.println(key + ": " + customer.showCustomerInfo());
		}
	}

	public void updateCustomer(VIPCustomer upgradedCustomer) {
		// TODO Auto-generated method stub
	}	

}