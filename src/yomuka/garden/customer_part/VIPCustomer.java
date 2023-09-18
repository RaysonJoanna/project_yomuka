package yomuka.garden.customer_part;

public class VIPCustomer extends Customer {

	
	public VIPCustomer(String name, String id, String pw) {
		this.name = name; 
		this.id = id;
		this.pw = pw;
		grade = "구독고객";
		ratio = 0.03;
		this.customerNum = setCustomerNum();
	}

	public VIPCustomer(Customer customer_) {
	}
	
	public String showCustomerInfo() {
		return name + "님의 아이디는 " + id + ", 고객등급은 " + grade + "입니다."
				+ "\n현재 소지하고 계신 포인트는 "+ point + "입니다. 고객님의 등급인"
				+ grade + "의 적립비율은" + ratio + "입니다.";
	}
	
}
