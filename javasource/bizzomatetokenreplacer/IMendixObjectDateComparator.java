package bizzomatetokenreplacer;

import java.util.Comparator;

public class IMendixObjectDateComparator implements Comparator<IMendixObjectComparable> {

	public static final IMendixObjectDateComparator ASC = new IMendixObjectDateComparator(1);

	public static final IMendixObjectDateComparator DESC = new IMendixObjectDateComparator(-1);
	
	private final int order;
	
	private IMendixObjectDateComparator(int order) {
			    this.order = order;
	}
	
	@Override
	public int compare(IMendixObjectComparable o1, IMendixObjectComparable o2) {
		return order * o1.getAttributeDateValue().compareTo(o2.getAttributeDateValue());
	}

}