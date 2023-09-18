package yomuka.garden.customer_part;

public class Customer {
	protected String name;
	protected String id;
	protected String pw;
	public String grade;
	public int customerNum;
	public int point;
	public double ratio;
	public static int serialNum = 0;

	public Customer() {
	}

	public Customer(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		grade = "일반고객";
		ratio = 0.01;
		this.customerNum = setCustomerNum();
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public int setCustomerNum() {
		serialNum++;
		customerNum += serialNum;
		return customerNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public String showCustomerInfo() {
		return name + "님의 아이디는 " + id + ", 고객등급은 " + grade + "입니다."
				+ "\n현재 소지하고 계신 포인트는 "+ point+ "입니다. 고객님의 등급인"
				+ grade + "의 적립비율은" + ratio + "입니다.";
	}

	@Override
	public int hashCode() {
		return customerNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
			if (this.customerNum == customer.customerNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
