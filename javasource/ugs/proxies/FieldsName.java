// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class FieldsName
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fieldsNameMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.FieldsName";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ReferenceNo("ReferenceNo"),
		GrantName("GrantName"),
		ApplicantName("ApplicantName"),
		Status("Status"),
		EndDate("EndDate"),
		Summary("Summary"),
		GrantID("GrantID"),
		Filter("Filter"),
		FilterName("FilterName"),
		FilterName_FieldsName("UGS.FilterName_FieldsName"),
		Field_Dummy("UGS.Field_Dummy"),
		FieldsName_Account("UGS.FieldsName_Account");

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

	public FieldsName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.FieldsName"));
	}

	protected FieldsName(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fieldsNameMendixObject)
	{
		if (fieldsNameMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.FieldsName", fieldsNameMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.FieldsName");

		this.fieldsNameMendixObject = fieldsNameMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FieldsName.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.FieldsName initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.FieldsName.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.FieldsName initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.FieldsName(context, mendixObject);
	}

	public static ugs.proxies.FieldsName load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.FieldsName.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.FieldsName> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.FieldsName> result = new java.util.ArrayList<ugs.proxies.FieldsName>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.FieldsName" + xpathConstraint))
			result.add(ugs.proxies.FieldsName.initialize(context, obj));
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
	 * @return value of ReferenceNo
	 */
	public final java.lang.Boolean getReferenceNo()
	{
		return getReferenceNo(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceNo
	 */
	public final java.lang.Boolean getReferenceNo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReferenceNo.toString());
	}

	/**
	 * Set value of ReferenceNo
	 * @param referenceno
	 */
	public final void setReferenceNo(java.lang.Boolean referenceno)
	{
		setReferenceNo(getContext(), referenceno);
	}

	/**
	 * Set value of ReferenceNo
	 * @param context
	 * @param referenceno
	 */
	public final void setReferenceNo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean referenceno)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceNo.toString(), referenceno);
	}

	/**
	 * @return value of GrantName
	 */
	public final java.lang.Boolean getGrantName()
	{
		return getGrantName(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantName
	 */
	public final java.lang.Boolean getGrantName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.GrantName.toString());
	}

	/**
	 * Set value of GrantName
	 * @param grantname
	 */
	public final void setGrantName(java.lang.Boolean grantname)
	{
		setGrantName(getContext(), grantname);
	}

	/**
	 * Set value of GrantName
	 * @param context
	 * @param grantname
	 */
	public final void setGrantName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean grantname)
	{
		getMendixObject().setValue(context, MemberNames.GrantName.toString(), grantname);
	}

	/**
	 * @return value of ApplicantName
	 */
	public final java.lang.Boolean getApplicantName()
	{
		return getApplicantName(getContext());
	}

	/**
	 * @param context
	 * @return value of ApplicantName
	 */
	public final java.lang.Boolean getApplicantName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ApplicantName.toString());
	}

	/**
	 * Set value of ApplicantName
	 * @param applicantname
	 */
	public final void setApplicantName(java.lang.Boolean applicantname)
	{
		setApplicantName(getContext(), applicantname);
	}

	/**
	 * Set value of ApplicantName
	 * @param context
	 * @param applicantname
	 */
	public final void setApplicantName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean applicantname)
	{
		getMendixObject().setValue(context, MemberNames.ApplicantName.toString(), applicantname);
	}

	/**
	 * @return value of Status
	 */
	public final java.lang.Boolean getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final java.lang.Boolean getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Status.toString());
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(java.lang.Boolean status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean status)
	{
		getMendixObject().setValue(context, MemberNames.Status.toString(), status);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.lang.Boolean getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.lang.Boolean getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.lang.Boolean enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of Summary
	 */
	public final java.lang.Boolean getSummary()
	{
		return getSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of Summary
	 */
	public final java.lang.Boolean getSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Summary.toString());
	}

	/**
	 * Set value of Summary
	 * @param summary
	 */
	public final void setSummary(java.lang.Boolean summary)
	{
		setSummary(getContext(), summary);
	}

	/**
	 * Set value of Summary
	 * @param context
	 * @param summary
	 */
	public final void setSummary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean summary)
	{
		getMendixObject().setValue(context, MemberNames.Summary.toString(), summary);
	}

	/**
	 * @return value of GrantID
	 */
	public final java.lang.Boolean getGrantID()
	{
		return getGrantID(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantID
	 */
	public final java.lang.Boolean getGrantID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.GrantID.toString());
	}

	/**
	 * Set value of GrantID
	 * @param grantid
	 */
	public final void setGrantID(java.lang.Boolean grantid)
	{
		setGrantID(getContext(), grantid);
	}

	/**
	 * Set value of GrantID
	 * @param context
	 * @param grantid
	 */
	public final void setGrantID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean grantid)
	{
		getMendixObject().setValue(context, MemberNames.GrantID.toString(), grantid);
	}

	/**
	 * @return value of Filter
	 */
	public final java.lang.Boolean getFilter()
	{
		return getFilter(getContext());
	}

	/**
	 * @param context
	 * @return value of Filter
	 */
	public final java.lang.Boolean getFilter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Filter.toString());
	}

	/**
	 * Set value of Filter
	 * @param filter
	 */
	public final void setFilter(java.lang.Boolean filter)
	{
		setFilter(getContext(), filter);
	}

	/**
	 * Set value of Filter
	 * @param context
	 * @param filter
	 */
	public final void setFilter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean filter)
	{
		getMendixObject().setValue(context, MemberNames.Filter.toString(), filter);
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
	public final ugs.proxies.FilterName getFilterName_FieldsName() throws com.mendix.core.CoreException
	{
		return getFilterName_FieldsName(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterName_FieldsName
	 */
	public final ugs.proxies.FilterName getFilterName_FieldsName(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.FilterName result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FilterName_FieldsName.toString());
		if (identifier != null)
			result = ugs.proxies.FilterName.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FilterName_FieldsName
	 * @param filtername_fieldsname
	 */
	public final void setFilterName_FieldsName(ugs.proxies.FilterName filtername_fieldsname)
	{
		setFilterName_FieldsName(getContext(), filtername_fieldsname);
	}

	/**
	 * Set value of FilterName_FieldsName
	 * @param context
	 * @param filtername_fieldsname
	 */
	public final void setFilterName_FieldsName(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.FilterName filtername_fieldsname)
	{
		if (filtername_fieldsname == null)
			getMendixObject().setValue(context, MemberNames.FilterName_FieldsName.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FilterName_FieldsName.toString(), filtername_fieldsname.getMendixObject().getId());
	}

	/**
	 * @return value of Field_Dummy
	 */
	public final ugs.proxies.FilterName getField_Dummy() throws com.mendix.core.CoreException
	{
		return getField_Dummy(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_Dummy
	 */
	public final ugs.proxies.FilterName getField_Dummy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.FilterName result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_Dummy.toString());
		if (identifier != null)
			result = ugs.proxies.FilterName.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_Dummy
	 * @param field_dummy
	 */
	public final void setField_Dummy(ugs.proxies.FilterName field_dummy)
	{
		setField_Dummy(getContext(), field_dummy);
	}

	/**
	 * Set value of Field_Dummy
	 * @param context
	 * @param field_dummy
	 */
	public final void setField_Dummy(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.FilterName field_dummy)
	{
		if (field_dummy == null)
			getMendixObject().setValue(context, MemberNames.Field_Dummy.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_Dummy.toString(), field_dummy.getMendixObject().getId());
	}

	/**
	 * @return value of FieldsName_Account
	 */
	public final administration.proxies.Account getFieldsName_Account() throws com.mendix.core.CoreException
	{
		return getFieldsName_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of FieldsName_Account
	 */
	public final administration.proxies.Account getFieldsName_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FieldsName_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FieldsName_Account
	 * @param fieldsname_account
	 */
	public final void setFieldsName_Account(administration.proxies.Account fieldsname_account)
	{
		setFieldsName_Account(getContext(), fieldsname_account);
	}

	/**
	 * Set value of FieldsName_Account
	 * @param context
	 * @param fieldsname_account
	 */
	public final void setFieldsName_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account fieldsname_account)
	{
		if (fieldsname_account == null)
			getMendixObject().setValue(context, MemberNames.FieldsName_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FieldsName_Account.toString(), fieldsname_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fieldsNameMendixObject;
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
			final ugs.proxies.FieldsName that = (ugs.proxies.FieldsName) obj;
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
		return "UGS.FieldsName";
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