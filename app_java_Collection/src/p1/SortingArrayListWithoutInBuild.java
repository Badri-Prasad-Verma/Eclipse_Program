package p1;
import java.util.Arrays;
import java.util.List;

public class SortingArrayListWithoutInBuild {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(52,43,76,24,87,22);
		sortingSort(list);
		System.out.println(list);
	}
	private static void sortingSort(List<Integer> list) {
		int n=list.size();
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(list.get(j)>list.get(j+1)) {
					Integer temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
}
