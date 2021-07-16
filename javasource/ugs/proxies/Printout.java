// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Printout extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Printout";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		GrantSystem_Printout("UGS.GrantSystem_Printout");

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

	public Printout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Printout"));
	}

	protected Printout(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject printoutMendixObject)
	{
		super(context, printoutMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("UGS.Printout", printoutMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Printout");
	}

	/**
	 * @deprecated Use 'Printout.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Printout initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Printout.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Printout initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Printout(context, mendixObject);
	}

	public static ugs.proxies.Printout load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Printout.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Printout> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Printout> result = new java.util.ArrayList<ugs.proxies.Printout>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Printout" + xpathConstraint))
			result.add(ugs.proxies.Printout.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of GrantSystem_Printout
	 */
	public final ugs.proxies.GrantSystem getGrantSystem_Printout() throws com.mendix.core.CoreException
	{
		return getGrantSystem_Printout(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantSystem_Printout
	 */
	public final ugs.proxies.GrantSystem getGrantSystem_Printout(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GrantSystem_Printout.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GrantSystem_Printout
	 * @param grantsystem_printout
	 */
	public final void setGrantSystem_Printout(ugs.proxies.GrantSystem grantsystem_printout)
	{
		setGrantSystem_Printout(getContext(), grantsystem_printout);
	}

	/**
	 * Set value of GrantSystem_Printout
	 * @param context
	 * @param grantsystem_printout
	 */
	public final void setGrantSystem_Printout(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem grantsystem_printout)
	{
		if (grantsystem_printout == null)
			getMendixObject().setValue(context, MemberNames.GrantSystem_Printout.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GrantSystem_Printout.toString(), grantsystem_printout.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final ugs.proxies.Printout that = (ugs.proxies.Printout) obj;
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
		return "UGS.Printout";
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
