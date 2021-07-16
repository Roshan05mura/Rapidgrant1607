package bizzomatetokenreplacer;

import java.util.Comparator;

public class IMendixObjectBigDecimalComparator implements Comparator<IMendixObjectComparable> {

	public static final IMendixObjectBigDecimalComparator ASC = new IMendixObjectBigDecimalComparator(1);

	public static final IMendixObjectBigDecimalComparator DESC = new IMendixObjectBigDecimalComparator(-1);
	
	private final int order;
	
	private IMendixObjectBigDecimalComparator(int order) {
			    this.order = order;
	}
		  
	@Override
	public int compare(IMendixObjectComparable o1, IMendixObjectComparable o2) {
		return order * o1.getAttributeBigDecimalValue().compareTo(o2.getAttributeBigDecimalValue());
	}

}