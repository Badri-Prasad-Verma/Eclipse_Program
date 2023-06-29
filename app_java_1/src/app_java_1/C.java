package app_java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C{

	public static void main(String[] args) {
		List<B> list=new ArrayList<>();
		list.add(new B(1,"badri","20","bangalore",9000));
		list.add(new B(5,"satish","19","mumbai",24000));
		list.add(new B(3,"abhinav","34","hydrabaad",14000));
		list.add(new B(6,"ram","23","lucknow",3000));
		list.add(new B(4,"shyam","45","bangalore",22000));
		list.add(new B(9,"radha","32","mumbai",2000));
		list.add(new B(44,"kajal","65","noida",32000));
		
		Map<String, List<B>> collect = list.stream().collect(Collectors.groupingBy(s->s.getCity(),Collectors.toList()));
		System.out.println(collect);
		
		
	}
}
