package app_java_streamApi_logical;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Company {
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(12, "badri", "bangalore", "male", "HR", 2000.00));
		list.add(new Employee(29, "satish", "mumbai", "male", "TM", 4000.00));
		list.add(new Employee(17, "radha", "chennai", "female", "TL", 6000.00));
		list.add(new Employee(9, "ram", "hydrabaad", "male", "TEST", 9000.00));
		list.add(new Employee(22, "banana", "Gujraat", "male", "GM", 8000.00));
		list.add(new Employee(14, "kajal", "Surat", "female", "EMP", 3000.00));
		
		Map<String, Employee> collect = list.stream().collect(Collectors.toMap(Employee::getName,Function.identity()));;
		System.out.println(collect);
		
//		list.forEach(emp -> {
//            double newSalary = emp.getSalary() * 1.10; // 10% hike
//            System.out.println(emp.getName() + ": " + newSalary);
//        });
//		
//		list.stream().sorted((a,b)->a.getName().compareTo(b.getName()))
//		.filter(e->e.getSalary()>=15000).collect(Collectors.toList())
//		.forEach(e->System.out.println(e.getName().toUpperCase()));
//		
//		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee ::getGender ,Collectors.counting()));
//		System.out.println(collect);
//		
//		Map<String, Double> collect1 = list.stream()
//	.collect(Collectors.groupingBy(Employee ::getGender ,Collectors
//			.averagingDouble(Employee :: getSalary)));
//		System.out.println(collect1);
//		
//		List<Employee> collect2 = list.stream().parallel().collect(Collectors.toList());
//		System.out.println(collect2);
	}
}
