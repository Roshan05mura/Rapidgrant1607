// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Applications
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject applicationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Applications";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		GrantName("GrantName"),
		GrantID("GrantID"),
		GrantID_Permanent("GrantID_Permanent"),
		Limit1("Limit1"),
		OpenDate("OpenDate"),
		CloseDate("CloseDate"),
		_CreatedDate("_CreatedDate"),
		Status("Status"),
		OverallRating("OverallRating"),
		Applications_Root_ProcessHelper("UGS.Applications_Root_ProcessHelper");

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

	public Applications(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Applications"));
	}

	protected Applications(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject applicationsMendixObject)
	{
		if (applicationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Applications", applicationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Applications");

		this.applicationsMendixObject = applicationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Applications.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Applications initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Applications.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Applications initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Applications(context, mendixObject);
	}

	public static ugs.proxies.Applications load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Applications.initialize(context, mendixObject);
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
	 * @return value of GrantName
	 */
	public final java.lang.String getGrantName()
	{
		return getGrantName(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantName
	 */
	public final java.lang.String getGrantName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GrantName.toString());
	}

	/**
	 * Set value of GrantName
	 * @param grantname
	 */
	public final void setGrantName(java.lang.String grantname)
	{
		setGrantName(getContext(), grantname);
	}

	/**
	 * Set value of GrantName
	 * @param context
	 * @param grantname
	 */
	public final void setGrantName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String grantname)
	{
		getMendixObject().setValue(context, MemberNames.GrantName.toString(), grantname);
	}

	/**
	 * @return value of GrantID
	 */
	public final java.lang.Long getGrantID()
	{
		return getGrantID(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantID
	 */
	public final java.lang.Long getGrantID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.GrantID.toString());
	}

	/**
	 * Set value of GrantID
	 * @param grantid
	 */
	public final void setGrantID(java.lang.Long grantid)
	{
		setGrantID(getContext(), grantid);
	}

	/**
	 * Set value of GrantID
	 * @param context
	 * @param grantid
	 */
	public final void setGrantID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long grantid)
	{
		getMendixObject().setValue(context, MemberNames.GrantID.toString(), grantid);
	}

	/**
	 * @return value of GrantID_Permanent
	 */
	public final java.lang.Long getGrantID_Permanent()
	{
		return getGrantID_Permanent(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantID_Permanent
	 */
	public final java.lang.Long getGrantID_Permanent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.GrantID_Permanent.toString());
	}

	/**
	 * Set value of GrantID_Permanent
	 * @param grantid_permanent
	 */
	public final void setGrantID_Permanent(java.lang.Long grantid_permanent)
	{
		setGrantID_Permanent(getContext(), grantid_permanent);
	}

	/**
	 * Set value of GrantID_Permanent
	 * @param context
	 * @param grantid_permanent
	 */
	public final void setGrantID_Permanent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long grantid_permanent)
	{
		getMendixObject().setValue(context, MemberNames.GrantID_Permanent.toString(), grantid_permanent);
	}

	/**
	 * @return value of Limit1
	 */
	public final java.math.BigDecimal getLimit1()
	{
		return getLimit1(getContext());
	}

	/**
	 * @param context
	 * @return value of Limit1
	 */
	public final java.math.BigDecimal getLimit1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Limit1.toString());
	}

	/**
	 * Set value of Limit1
	 * @param limit1
	 */
	public final void setLimit1(java.math.BigDecimal limit1)
	{
		setLimit1(getContext(), limit1);
	}

	/**
	 * Set value of Limit1
	 * @param context
	 * @param limit1
	 */
	public final void setLimit1(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal limit1)
	{
		getMendixObject().setValue(context, MemberNames.Limit1.toString(), limit1);
	}

	/**
	 * @return value of OpenDate
	 */
	public final java.util.Date getOpenDate()
	{
		return getOpenDate(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenDate
	 */
	public final java.util.Date getOpenDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.OpenDate.toString());
	}

	/**
	 * Set value of OpenDate
	 * @param opendate
	 */
	public final void setOpenDate(java.util.Date opendate)
	{
		setOpenDate(getContext(), opendate);
	}

	/**
	 * Set value of OpenDate
	 * @param context
	 * @param opendate
	 */
	public final void setOpenDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date opendate)
	{
		getMendixObject().setValue(context, MemberNames.OpenDate.toString(), opendate);
	}

	/**
	 * @return value of CloseDate
	 */
	public final java.util.Date getCloseDate()
	{
		return getCloseDate(getContext());
	}

	/**
	 * @param context
	 * @return value of CloseDate
	 */
	public final java.util.Date getCloseDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CloseDate.toString());
	}

	/**
	 * Set value of CloseDate
	 * @param closedate
	 */
	public final void setCloseDate(java.util.Date closedate)
	{
		setCloseDate(getContext(), closedate);
	}

	/**
	 * Set value of CloseDate
	 * @param context
	 * @param closedate
	 */
	public final void setCloseDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date closedate)
	{
		getMendixObject().setValue(context, MemberNames.CloseDate.toString(), closedate);
	}

	/**
	 * @return value of _CreatedDate
	 */
	public final java.util.Date get_CreatedDate()
	{
		return get_CreatedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of _CreatedDate
	 */
	public final java.util.Date get_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames._CreatedDate.toString());
	}

	/**
	 * Set value of _CreatedDate
	 * @param _createddate
	 */
	public final void set_CreatedDate(java.util.Date _createddate)
	{
		set_CreatedDate(getContext(), _createddate);
	}

	/**
	 * Set value of _CreatedDate
	 * @param context
	 * @param _createddate
	 */
	public final void set_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date _createddate)
	{
		getMendixObject().setValue(context, MemberNames._CreatedDate.toString(), _createddate);
	}

	/**
	 * @return value of Status
	 */
	public final java.lang.String getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final java.lang.String getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Status.toString());
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(java.lang.String status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String status)
	{
		getMendixObject().setValue(context, MemberNames.Status.toString(), status);
	}

	/**
	 * @return value of OverallRating
	 */
	public final java.lang.String getOverallRating()
	{
		return getOverallRating(getContext());
	}

	/**
	 * @param context
	 * @return value of OverallRating
	 */
	public final java.lang.String getOverallRating(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OverallRating.toString());
	}

	/**
	 * Set value of OverallRating
	 * @param overallrating
	 */
	public final void setOverallRating(java.lang.String overallrating)
	{
		setOverallRating(getContext(), overallrating);
	}

	/**
	 * Set value of OverallRating
	 * @param context
	 * @param overallrating
	 */
	public final void setOverallRating(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String overallrating)
	{
		getMendixObject().setValue(context, MemberNames.OverallRating.toString(), overallrating);
	}

	/**
	 * @return value of Applications_Root_ProcessHelper
	 */
	public final ugs.proxies.Root_ProcessHelper getApplications_Root_ProcessHelper() throws com.mendix.core.CoreException
	{
		return getApplications_Root_ProcessHelper(getContext());
	}

	/**
	 * @param context
	 * @return value of Applications_Root_ProcessHelper
	 */
	public final ugs.proxies.Root_ProcessHelper getApplications_Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Root_ProcessHelper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Applications_Root_ProcessHelper.toString());
		if (identifier != null)
			result = ugs.proxies.Root_ProcessHelper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Applications_Root_ProcessHelper
	 * @param applications_root_processhelper
	 */
	public final void setApplications_Root_ProcessHelper(ugs.proxies.Root_ProcessHelper applications_root_processhelper)
	{
		setApplications_Root_ProcessHelper(getContext(), applications_root_processhelper);
	}

	/**
	 * Set value of Applications_Root_ProcessHelper
	 * @param context
	 * @param applications_root_processhelper
	 */
	public final void setApplications_Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Root_ProcessHelper applications_root_processhelper)
	{
		if (applications_root_processhelper == null)
			getMendixObject().setValue(context, MemberNames.Applications_Root_ProcessHelper.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Applications_Root_ProcessHelper.toString(), applications_root_processhelper.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return applicationsMendixObject;
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
			final ugs.proxies.Applications that = (ugs.proxies.Applications) obj;
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
		return "UGS.Applications";
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