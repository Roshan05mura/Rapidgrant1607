package bizzomatetokenreplacer;

import java.util.Comparator;

public class IMendixObjectStringComparator implements Comparator<IMendixObjectComparable> {

	public static final IMendixObjectStringComparator ASC = new IMendixObjectStringComparator(1);

	public static final IMendixObjectStringComparator DESC = new IMendixObjectStringComparator(-1);
	
	private final int order;
	
	private IMendixObjectStringComparator(int order) {
			    this.order = order;
	}
		  
	@Override
	public int compare(IMendixObjectComparable o1, IMendixObjectComparable o2) {
		return order * o1.getAttributeStringValue().compareTo(o2.getAttributeStringValue());
	}

}