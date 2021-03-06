// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class ApplicantDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject applicantDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.ApplicantDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ApplicantName("ApplicantName"),
		OrganizationName("OrganizationName"),
		Country("Country"),
		ApplicantDetails_Root_ProcessHelper("UGS.ApplicantDetails_Root_ProcessHelper");

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

	public ApplicantDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.ApplicantDetails"));
	}

	protected ApplicantDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject applicantDetailsMendixObject)
	{
		if (applicantDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.ApplicantDetails", applicantDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.ApplicantDetails");

		this.applicantDetailsMendixObject = applicantDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ApplicantDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.ApplicantDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.ApplicantDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.ApplicantDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.ApplicantDetails(context, mendixObject);
	}

	public static ugs.proxies.ApplicantDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.ApplicantDetails.initialize(context, mendixObject);
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
	 * @return value of ApplicantName
	 */
	public final java.lang.String getApplicantName()
	{
		return getApplicantName(getContext());
	}

	/**
	 * @param context
	 * @return value of ApplicantName
	 */
	public final java.lang.String getApplicantName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ApplicantName.toString());
	}

	/**
	 * Set value of ApplicantName
	 * @param applicantname
	 */
	public final void setApplicantName(java.lang.String applicantname)
	{
		setApplicantName(getContext(), applicantname);
	}

	/**
	 * Set value of ApplicantName
	 * @param context
	 * @param applicantname
	 */
	public final void setApplicantName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String applicantname)
	{
		getMendixObject().setValue(context, MemberNames.ApplicantName.toString(), applicantname);
	}

	/**
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName()
	{
		return getOrganizationName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganizationName.toString());
	}

	/**
	 * Set value of OrganizationName
	 * @param organizationname
	 */
	public final void setOrganizationName(java.lang.String organizationname)
	{
		setOrganizationName(getContext(), organizationname);
	}

	/**
	 * Set value of OrganizationName
	 * @param context
	 * @param organizationname
	 */
	public final void setOrganizationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organizationname)
	{
		getMendixObject().setValue(context, MemberNames.OrganizationName.toString(), organizationname);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
	}

	/**
	 * @return value of ApplicantDetails_Root_ProcessHelper
	 */
	public final ugs.proxies.Root_ProcessHelper getApplicantDetails_Root_ProcessHelper() throws com.mendix.core.CoreException
	{
		return getApplicantDetails_Root_ProcessHelper(getContext());
	}

	/**
	 * @param context
	 * @return value of ApplicantDetails_Root_ProcessHelper
	 */
	public final ugs.proxies.Root_ProcessHelper getApplicantDetails_Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Root_ProcessHelper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApplicantDetails_Root_ProcessHelper.toString());
		if (identifier != null)
			result = ugs.proxies.Root_ProcessHelper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApplicantDetails_Root_ProcessHelper
	 * @param applicantdetails_root_processhelper
	 */
	public final void setApplicantDetails_Root_ProcessHelper(ugs.proxies.Root_ProcessHelper applicantdetails_root_processhelper)
	{
		setApplicantDetails_Root_ProcessHelper(getContext(), applicantdetails_root_processhelper);
	}

	/**
	 * Set value of ApplicantDetails_Root_ProcessHelper
	 * @param context
	 * @param applicantdetails_root_processhelper
	 */
	public final void setApplicantDetails_Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Root_ProcessHelper applicantdetails_root_processhelper)
	{
		if (applicantdetails_root_processhelper == null)
			getMendixObject().setValue(context, MemberNames.ApplicantDetails_Root_ProcessHelper.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApplicantDetails_Root_ProcessHelper.toString(), applicantdetails_root_processhelper.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return applicantDetailsMendixObject;
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
			final ugs.proxies.ApplicantDetails that = (ugs.proxies.ApplicantDetails) obj;
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
		return "UGS.ApplicantDetails";
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
