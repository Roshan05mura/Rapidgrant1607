// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Value
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject valueMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Value";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Value_Header_2("UGS.Value_Header_2");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Value(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Value"));
	}

	protected Value(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject valueMendixObject)
	{
		if (valueMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Value", valueMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Value");

		this.valueMendixObject = valueMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Value.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Value initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Value.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Value initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Value(context, mendixObject);
	}

	public static ugs.proxies.Value load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Value.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of Value_Header_2
	 */
	public final ugs.proxies.Header getValue_Header_2() throws com.mendix.core.CoreException
	{
		return getValue_Header_2(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_Header_2
	 */
	public final ugs.proxies.Header getValue_Header_2(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Header result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Value_Header_2.toString());
		if (identifier != null)
			result = ugs.proxies.Header.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Value_Header_2
	 * @param value_header_2
	 */
	public final void setValue_Header_2(ugs.proxies.Header value_header_2)
	{
		setValue_Header_2(getContext(), value_header_2);
	}

	/**
	 * Set value of Value_Header_2
	 * @param context
	 * @param value_header_2
	 */
	public final void setValue_Header_2(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Header value_header_2)
	{
		if (value_header_2 == null)
			getMendixObject().setValue(context, MemberNames.Value_Header_2.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Value_Header_2.toString(), value_header_2.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return valueMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final ugs.proxies.Value that = (ugs.proxies.Value) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "UGS.Value";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
