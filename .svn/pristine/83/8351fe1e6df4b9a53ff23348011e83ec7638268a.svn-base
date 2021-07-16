package bizzomatetokenreplacer;

import java.math.BigDecimal;
import java.util.Date;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class IMendixObjectComparable {

	// Local variables
	private IMendixObject iMendixObject;
	private String attributeStringValue;
	private Integer attributeIntValue;
	private Date attributeDateValue;
	private BigDecimal attributeBigDecimalValue;
	
	// Constructor
	public IMendixObjectComparable(IMendixObject iMendixObject, Object attributeValue) throws CoreException {
        this.iMendixObject = iMendixObject;
        
        if (!(attributeValue instanceof String || attributeValue instanceof Integer || attributeValue instanceof Date || attributeValue instanceof BigDecimal))
        	throw new CoreException("No correct sort attribute provided. Sort attribute value is " + attributeValue + ".");
        
        
        if (attributeValue instanceof String)
        	this.attributeStringValue = String.valueOf(attributeValue);
        if (attributeValue instanceof Integer)
        	this.attributeIntValue = (Integer) attributeValue;
        if (attributeValue instanceof Date)
        	this.attributeDateValue = (Date) attributeValue;
        if (attributeValue instanceof BigDecimal)
        	this.attributeBigDecimalValue = (BigDecimal) attributeValue;
                
    }
	
	// GETTERS
	public String getAttributeStringValue() {
		return this.attributeStringValue;
	}
	
	public Integer getAttributeIntValue() {
		return this.attributeIntValue;
	}
	
	public Date getAttributeDateValue() {
		return this.attributeDateValue;
	}
	
	public BigDecimal getAttributeBigDecimalValue() {
		return this.attributeBigDecimalValue;
	}
	
	public IMendixObject getIMendixObject() {
		return iMendixObject;
	}
	
}
