package yomuka.garden.pet_part;

public class Cat extends Pet {
	private String name;	//이름
	private String type;	//종류
	private	int age;		//나이
	private int neu; 		//중성화여부
	private double weight;	//몸무게;
	public double b = 0.75 ;
	public double RER = Math.pow(weight, b);
	private int food;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String type, int neu, double weight) {
		super(name, age, type, neu, weight);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNeu() {
		return neu;
	}
	public void setNeu(int neu) {
		this.neu = neu;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getFood() {
		return food;
	}
	public void setFood(double d) {
		this.food = (int) d;
	}
	public String showCustomerInfo() {
		return name + " "+ type + " "+ age+ " " + neu + " "+
	weight + " " + RER +" "+ food;
	}
}
