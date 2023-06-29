package app_java_Comparator;

import java.util.Comparator;

public class SortByName implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
