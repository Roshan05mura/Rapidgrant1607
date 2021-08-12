// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Search
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Search";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RefNumber("RefNumber"),
		Grant_Name("Grant_Name"),
		Applicant_Name("Applicant_Name"),
		Status("Status"),
		EndDate("EndDate"),
		SearchTitle("SearchTitle"),
		Search("Search"),
		Nationality("Nationality"),
		Gender("Gender");

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

	public Search(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Search"));
	}

	protected Search(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject)
	{
		if (searchMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Search", searchMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Search");

		this.searchMendixObject = searchMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Search.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Search.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Search(context, mendixObject);
	}

	public static ugs.proxies.Search load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Search.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Search> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Search> result = new java.util.ArrayList<ugs.proxies.Search>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Search" + xpathConstraint))
			result.add(ugs.proxies.Search.initialize(context, obj));
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
	 * @return value of RefNumber
	 */
	public final java.lang.Integer getRefNumber()
	{
		return getRefNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of RefNumber
	 */
	public final java.lang.Integer getRefNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RefNumber.toString());
	}

	/**
	 * Set value of RefNumber
	 * @param refnumber
	 */
	public final void setRefNumber(java.lang.Integer refnumber)
	{
		setRefNumber(getContext(), refnumber);
	}

	/**
	 * Set value of RefNumber
	 * @param context
	 * @param refnumber
	 */
	public final void setRefNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer refnumber)
	{
		getMendixObject().setValue(context, MemberNames.RefNumber.toString(), refnumber);
	}

	/**
	 * @return value of Grant_Name
	 */
	public final java.lang.String getGrant_Name()
	{
		return getGrant_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Grant_Name
	 */
	public final java.lang.String getGrant_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Grant_Name.toString());
	}

	/**
	 * Set value of Grant_Name
	 * @param grant_name
	 */
	public final void setGrant_Name(java.lang.String grant_name)
	{
		setGrant_Name(getContext(), grant_name);
	}

	/**
	 * Set value of Grant_Name
	 * @param context
	 * @param grant_name
	 */
	public final void setGrant_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String grant_name)
	{
		getMendixObject().setValue(context, MemberNames.Grant_Name.toString(), grant_name);
	}

	/**
	 * @return value of Applicant_Name
	 */
	public final java.lang.String getApplicant_Name()
	{
		return getApplicant_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Applicant_Name
	 */
	public final java.lang.String getApplicant_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Applicant_Name.toString());
	}

	/**
	 * Set value of Applicant_Name
	 * @param applicant_name
	 */
	public final void setApplicant_Name(java.lang.String applicant_name)
	{
		setApplicant_Name(getContext(), applicant_name);
	}

	/**
	 * Set value of Applicant_Name
	 * @param context
	 * @param applicant_name
	 */
	public final void setApplicant_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String applicant_name)
	{
		getMendixObject().setValue(context, MemberNames.Applicant_Name.toString(), applicant_name);
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
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of SearchTitle
	 */
	public final java.lang.String getSearchTitle()
	{
		return getSearchTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchTitle
	 */
	public final java.lang.String getSearchTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SearchTitle.toString());
	}

	/**
	 * Set value of SearchTitle
	 * @param searchtitle
	 */
	public final void setSearchTitle(java.lang.String searchtitle)
	{
		setSearchTitle(getContext(), searchtitle);
	}

	/**
	 * Set value of SearchTitle
	 * @param context
	 * @param searchtitle
	 */
	public final void setSearchTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String searchtitle)
	{
		getMendixObject().setValue(context, MemberNames.SearchTitle.toString(), searchtitle);
	}

	/**
	 * @return value of Search
	 */
	public final java.lang.Boolean getSearch()
	{
		return getSearch(getContext());
	}

	/**
	 * @param context
	 * @return value of Search
	 */
	public final java.lang.Boolean getSearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Search.toString());
	}

	/**
	 * Set value of Search
	 * @param search
	 */
	public final void setSearch(java.lang.Boolean search)
	{
		setSearch(getContext(), search);
	}

	/**
	 * Set value of Search
	 * @param context
	 * @param search
	 */
	public final void setSearch(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean search)
	{
		getMendixObject().setValue(context, MemberNames.Search.toString(), search);
	}

	/**
	 * Set value of Nationality
	 * @param nationality
	 */
	public final countriesv5.proxies.Countries getNationality()
	{
		return getNationality(getContext());
	}

	/**
	 * @param context
	 * @return value of Nationality
	 */
	public final countriesv5.proxies.Countries getNationality(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Nationality.toString());
		if (obj == null)
			return null;

		return countriesv5.proxies.Countries.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Nationality
	 * @param nationality
	 */
	public final void setNationality(countriesv5.proxies.Countries nationality)
	{
		setNationality(getContext(), nationality);
	}

	/**
	 * Set value of Nationality
	 * @param context
	 * @param nationality
	 */
	public final void setNationality(com.mendix.systemwideinterfaces.core.IContext context, countriesv5.proxies.Countries nationality)
	{
		if (nationality != null)
			getMendixObject().setValue(context, MemberNames.Nationality.toString(), nationality.toString());
		else
			getMendixObject().setValue(context, MemberNames.Nationality.toString(), null);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final ugs.proxies.Enum_Gender getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final ugs.proxies.Enum_Gender getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_Gender.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(ugs.proxies.Enum_Gender gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_Gender gender)
	{
		if (gender != null)
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		else
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchMendixObject;
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
			final ugs.proxies.Search that = (ugs.proxies.Search) obj;
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
		return "UGS.Search";
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
