package app_java_Comparator;
public class ComparatorExample {
	private int id;
	private String name;
	private String city;
	private String gender;
	
	public ComparatorExample(int id, String name, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ComparableExamples [id=" + id + ", name=" + name + ", city=" + city + ", gender=" + gender + "]";
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}


	public String getGender() {
		return gender;
	}
}

