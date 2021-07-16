// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Organization
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject organizationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Organization";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OrgName("OrgName"),
		OrgID("OrgID");

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

	public Organization(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Organization"));
	}

	protected Organization(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject organizationMendixObject)
	{
		if (organizationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Organization", organizationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Organization");

		this.organizationMendixObject = organizationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Organization.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Organization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Organization.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Organization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Organization(context, mendixObject);
	}

	public static ugs.proxies.Organization load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Organization.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Organization> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Organization> result = new java.util.ArrayList<ugs.proxies.Organization>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Organization" + xpathConstraint))
			result.add(ugs.proxies.Organization.initialize(context, obj));
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
	 * @return value of OrgName
	 */
	public final java.lang.String getOrgName()
	{
		return getOrgName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrgName
	 */
	public final java.lang.String getOrgName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrgName.toString());
	}

	/**
	 * Set value of OrgName
	 * @param orgname
	 */
	public final void setOrgName(java.lang.String orgname)
	{
		setOrgName(getContext(), orgname);
	}

	/**
	 * Set value of OrgName
	 * @param context
	 * @param orgname
	 */
	public final void setOrgName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String orgname)
	{
		getMendixObject().setValue(context, MemberNames.OrgName.toString(), orgname);
	}

	/**
	 * @return value of OrgID
	 */
	public final java.lang.Long getOrgID()
	{
		return getOrgID(getContext());
	}

	/**
	 * @param context
	 * @return value of OrgID
	 */
	public final java.lang.Long getOrgID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.OrgID.toString());
	}

	/**
	 * Set value of OrgID
	 * @param orgid
	 */
	public final void setOrgID(java.lang.Long orgid)
	{
		setOrgID(getContext(), orgid);
	}

	/**
	 * Set value of OrgID
	 * @param context
	 * @param orgid
	 */
	public final void setOrgID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long orgid)
	{
		getMendixObject().setValue(context, MemberNames.OrgID.toString(), orgid);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return organizationMendixObject;
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
			final ugs.proxies.Organization that = (ugs.proxies.Organization) obj;
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
		return "UGS.Organization";
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
