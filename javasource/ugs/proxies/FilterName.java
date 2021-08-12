// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class FilterName
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject filterNameMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.FilterName";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FilterName("FilterName"),
		FilterName_FieldsName("UGS.FilterName_FieldsName");

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

	public FilterName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.FilterName"));
	}

	protected FilterName(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject filterNameMendixObject)
	{
		if (filterNameMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.FilterName", filterNameMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.FilterName");

		this.filterNameMendixObject = filterNameMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FilterName.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.FilterName initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.FilterName.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.FilterName initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.FilterName(context, mendixObject);
	}

	public static ugs.proxies.FilterName load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.FilterName.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.FilterName> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.FilterName> result = new java.util.ArrayList<ugs.proxies.FilterName>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.FilterName" + xpathConstraint))
			result.add(ugs.proxies.FilterName.initialize(context, obj));
		return result;
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
	 * @return value of FilterName
	 */
	public final java.lang.String getFilterName()
	{
		return getFilterName(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterName
	 */
	public final java.lang.String getFilterName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FilterName.toString());
	}

	/**
	 * Set value of FilterName
	 * @param filtername
	 */
	public final void setFilterName(java.lang.String filtername)
	{
		setFilterName(getContext(), filtername);
	}

	/**
	 * Set value of FilterName
	 * @param context
	 * @param filtername
	 */
	public final void setFilterName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filtername)
	{
		getMendixObject().setValue(context, MemberNames.FilterName.toString(), filtername);
	}

	/**
	 * @return value of FilterName_FieldsName
	 */
	public final ugs.proxies.FieldsName getFilterName_FieldsName() throws com.mendix.core.CoreException
	{
		return getFilterName_FieldsName(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterName_FieldsName
	 */
	public final ugs.proxies.FieldsName getFilterName_FieldsName(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.FieldsName result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FilterName_FieldsName.toString());
		if (identifier != null)
			result = ugs.proxies.FieldsName.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FilterName_FieldsName
	 * @param filtername_fieldsname
	 */
	public final void setFilterName_FieldsName(ugs.proxies.FieldsName filtername_fieldsname)
	{
		setFilterName_FieldsName(getContext(), filtername_fieldsname);
	}

	/**
	 * Set value of FilterName_FieldsName
	 * @param context
	 * @param filtername_fieldsname
	 */
	public final void setFilterName_FieldsName(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.FieldsName filtername_fieldsname)
	{
		if (filtername_fieldsname == null)
			getMendixObject().setValue(context, MemberNames.FilterName_FieldsName.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FilterName_FieldsName.toString(), filtername_fieldsname.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return filterNameMendixObject;
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
			final ugs.proxies.FilterName that = (ugs.proxies.FilterName) obj;
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
		return "UGS.FilterName";
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