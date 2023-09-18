package yomuka.garden.pet_part;

public  class Pet {
    public String name;
    private int age;
    private String type;
    public double weight;
    public int food;
    public int neu;
	public double b = 0.75 ;
	public double RER = Math.pow(weight, b);

    public Pet() { }
 
    public Pet(String name, int age, String type, int neu,double weight) {
    	this.name = name;
    	this.age = age;
    	this.type = type;
    	this.neu = neu;
    	this.weight = weight;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
//	public void setFood(double d) {
//		this.food = (int) d;
//	}
	
	public void petInfo() {
		if(neu == 1) {
		System.out.println(name + "의 나이는 "+ age + "살, 종은 " + type 
				+ ", 몸무게는" + weight +"kg, 중성화 되어있습니다.");
		} else
			System.out.println(name + "의 나이는 "+ age + "살, 종은 " + type 
					+", 몸무게는" + weight + "kg, 중성화 되어있지 않습니다.");
	}

	@Override
	public String toString() {
		return name + "의 나이는 "+ age + ", 종은 " + type + ", 중성화여부는 " + neu + "입니다.";
	}
	
	
}