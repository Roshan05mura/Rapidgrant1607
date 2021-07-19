// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Root_ProcessHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject root_ProcessHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Root_ProcessHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		GrantSelected("GrantSelected"),
		SelectedGrant("UGS.SelectedGrant");

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

	public Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Root_ProcessHelper"));
	}

	protected Root_ProcessHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject root_ProcessHelperMendixObject)
	{
		if (root_ProcessHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Root_ProcessHelper", root_ProcessHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Root_ProcessHelper");

		this.root_ProcessHelperMendixObject = root_ProcessHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root_ProcessHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Root_ProcessHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Root_ProcessHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Root_ProcessHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Root_ProcessHelper(context, mendixObject);
	}

	public static ugs.proxies.Root_ProcessHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Root_ProcessHelper.initialize(context, mendixObject);
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
	 * @return value of GrantSelected
	 */
	public final java.lang.Boolean getGrantSelected()
	{
		return getGrantSelected(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantSelected
	 */
	public final java.lang.Boolean getGrantSelected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.GrantSelected.toString());
	}

	/**
	 * Set value of GrantSelected
	 * @param grantselected
	 */
	public final void setGrantSelected(java.lang.Boolean grantselected)
	{
		setGrantSelected(getContext(), grantselected);
	}

	/**
	 * Set value of GrantSelected
	 * @param context
	 * @param grantselected
	 */
	public final void setGrantSelected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean grantselected)
	{
		getMendixObject().setValue(context, MemberNames.GrantSelected.toString(), grantselected);
	}

	/**
	 * @return value of SelectedGrant
	 */
	public final ugs.proxies.Grant getSelectedGrant() throws com.mendix.core.CoreException
	{
		return getSelectedGrant(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedGrant
	 */
	public final ugs.proxies.Grant getSelectedGrant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Grant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectedGrant.toString());
		if (identifier != null)
			result = ugs.proxies.Grant.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectedGrant
	 * @param selectedgrant
	 */
	public final void setSelectedGrant(ugs.proxies.Grant selectedgrant)
	{
		setSelectedGrant(getContext(), selectedgrant);
	}

	/**
	 * Set value of SelectedGrant
	 * @param context
	 * @param selectedgrant
	 */
	public final void setSelectedGrant(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Grant selectedgrant)
	{
		if (selectedgrant == null)
			getMendixObject().setValue(context, MemberNames.SelectedGrant.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectedGrant.toString(), selectedgrant.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return root_ProcessHelperMendixObject;
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
			final ugs.proxies.Root_ProcessHelper that = (ugs.proxies.Root_ProcessHelper) obj;
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
		return "UGS.Root_ProcessHelper";
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
