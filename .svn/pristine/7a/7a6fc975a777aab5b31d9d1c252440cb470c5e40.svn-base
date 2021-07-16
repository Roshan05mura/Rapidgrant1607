package bizzomatetokenreplacer;

import java.util.Comparator;

public class IMendixObjectIntComparator implements Comparator<IMendixObjectComparable> {

	public static final IMendixObjectIntComparator ASC = new IMendixObjectIntComparator(1);

	public static final IMendixObjectIntComparator DESC = new IMendixObjectIntComparator(-1);
	
	private final int order;
	
	private IMendixObjectIntComparator(int order) {
			    this.order = order;
	}
		  
	@Override
	public int compare(IMendixObjectComparable o1, IMendixObjectComparable o2) {		
		return order * Integer.compare(o1.getAttributeIntValue(), o2.getAttributeIntValue());
	}
		
}
