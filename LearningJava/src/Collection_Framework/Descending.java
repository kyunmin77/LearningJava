package Collection_Framework;

import java.util.*;   //11-19 ComparatorEx 

public class Descending implements Comparator {  //Comparator > 기본 외 정렬을 할 때 사용
	public int compare(Object o1,Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
		}
		
		return -1;
	}
}
