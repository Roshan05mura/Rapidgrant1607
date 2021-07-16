// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datahubio_countrycodes.proxies;

public class CountryFlag extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DataHubIo_CountryCodes.CountryFlag";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		CountryFlag_CountryCode("DataHubIo_CountryCodes.CountryFlag_CountryCode");

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

	public CountryFlag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DataHubIo_CountryCodes.CountryFlag"));
	}

	protected CountryFlag(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject countryFlagMendixObject)
	{
		super(context, countryFlagMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DataHubIo_CountryCodes.CountryFlag", countryFlagMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DataHubIo_CountryCodes.CountryFlag");
	}

	/**
	 * @deprecated Use 'CountryFlag.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static datahubio_countrycodes.proxies.CountryFlag initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return datahubio_countrycodes.proxies.CountryFlag.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static datahubio_countrycodes.proxies.CountryFlag initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new datahubio_countrycodes.proxies.CountryFlag(context, mendixObject);
	}

	public static datahubio_countrycodes.proxies.CountryFlag load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return datahubio_countrycodes.proxies.CountryFlag.initialize(context, mendixObject);
	}

	public static java.util.List<datahubio_countrycodes.proxies.CountryFlag> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<datahubio_countrycodes.proxies.CountryFlag> result = new java.util.ArrayList<datahubio_countrycodes.proxies.CountryFlag>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DataHubIo_CountryCodes.CountryFlag" + xpathConstraint))
			result.add(datahubio_countrycodes.proxies.CountryFlag.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CountryFlag_CountryCode
	 */
	public final datahubio_countrycodes.proxies.CountryCode getCountryFlag_CountryCode() throws com.mendix.core.CoreException
	{
		return getCountryFlag_CountryCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryFlag_CountryCode
	 */
	public final datahubio_countrycodes.proxies.CountryCode getCountryFlag_CountryCode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		datahubio_countrycodes.proxies.CountryCode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CountryFlag_CountryCode.toString());
		if (identifier != null)
			result = datahubio_countrycodes.proxies.CountryCode.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CountryFlag_CountryCode
	 * @param countryflag_countrycode
	 */
	public final void setCountryFlag_CountryCode(datahubio_countrycodes.proxies.CountryCode countryflag_countrycode)
	{
		setCountryFlag_CountryCode(getContext(), countryflag_countrycode);
	}

	/**
	 * Set value of CountryFlag_CountryCode
	 * @param context
	 * @param countryflag_countrycode
	 */
	public final void setCountryFlag_CountryCode(com.mendix.systemwideinterfaces.core.IContext context, datahubio_countrycodes.proxies.CountryCode countryflag_countrycode)
	{
		if (countryflag_countrycode == null)
			getMendixObject().setValue(context, MemberNames.CountryFlag_CountryCode.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CountryFlag_CountryCode.toString(), countryflag_countrycode.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final datahubio_countrycodes.proxies.CountryFlag that = (datahubio_countrycodes.proxies.CountryFlag) obj;
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
		return "DataHubIo_CountryCodes.CountryFlag";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
