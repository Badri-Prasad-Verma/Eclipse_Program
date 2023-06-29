package app_java_1;

public class B{
	
	private int id;
	private String name;
	private String age;
	private String city;
	private int salary;
	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
	public B(int id, String name, String age, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
}
