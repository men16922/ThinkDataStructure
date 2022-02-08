package C1;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private List list;
	
	public ListClientExample() {
//		list = new LinkedList();
		list = new ArrayList<Integer>();
	}
	
	private List getList() {
		return list;
	}
	
	public static void main(String[] args) {
		ListClientExample Ice = new ListClientExample();
		List list = Ice.getList();
		System.out.println(list);
	}
}
