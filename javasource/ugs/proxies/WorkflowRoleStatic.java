// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class WorkflowRoleStatic
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowRoleStaticMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.WorkflowRoleStatic";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RoleName("RoleName"),
		Order("Order"),
		Status("Status"),
		WorkflowRoleStatic_GrantSystem("UGS.WorkflowRoleStatic_GrantSystem");

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

	public WorkflowRoleStatic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.WorkflowRoleStatic"));
	}

	protected WorkflowRoleStatic(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowRoleStaticMendixObject)
	{
		if (workflowRoleStaticMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.WorkflowRoleStatic", workflowRoleStaticMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.WorkflowRoleStatic");

		this.workflowRoleStaticMendixObject = workflowRoleStaticMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowRoleStatic.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.WorkflowRoleStatic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.WorkflowRoleStatic.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.WorkflowRoleStatic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.WorkflowRoleStatic(context, mendixObject);
	}

	public static ugs.proxies.WorkflowRoleStatic load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.WorkflowRoleStatic.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.WorkflowRoleStatic> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.WorkflowRoleStatic> result = new java.util.ArrayList<ugs.proxies.WorkflowRoleStatic>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.WorkflowRoleStatic" + xpathConstraint))
			result.add(ugs.proxies.WorkflowRoleStatic.initialize(context, obj));
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
	 * @return value of RoleName
	 */
	public final java.lang.String getRoleName()
	{
		return getRoleName(getContext());
	}

	/**
	 * @param context
	 * @return value of RoleName
	 */
	public final java.lang.String getRoleName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RoleName.toString());
	}

	/**
	 * Set value of RoleName
	 * @param rolename
	 */
	public final void setRoleName(java.lang.String rolename)
	{
		setRoleName(getContext(), rolename);
	}

	/**
	 * Set value of RoleName
	 * @param context
	 * @param rolename
	 */
	public final void setRoleName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String rolename)
	{
		getMendixObject().setValue(context, MemberNames.RoleName.toString(), rolename);
	}

	/**
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
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
	 * @return value of WorkflowRoleStatic_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getWorkflowRoleStatic_GrantSystem() throws com.mendix.core.CoreException
	{
		return getWorkflowRoleStatic_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowRoleStatic_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getWorkflowRoleStatic_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowRoleStatic_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowRoleStatic_GrantSystem
	 * @param workflowrolestatic_grantsystem
	 */
	public final void setWorkflowRoleStatic_GrantSystem(ugs.proxies.GrantSystem workflowrolestatic_grantsystem)
	{
		setWorkflowRoleStatic_GrantSystem(getContext(), workflowrolestatic_grantsystem);
	}

	/**
	 * Set value of WorkflowRoleStatic_GrantSystem
	 * @param context
	 * @param workflowrolestatic_grantsystem
	 */
	public final void setWorkflowRoleStatic_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem workflowrolestatic_grantsystem)
	{
		if (workflowrolestatic_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.WorkflowRoleStatic_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowRoleStatic_GrantSystem.toString(), workflowrolestatic_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowRoleStaticMendixObject;
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
			final ugs.proxies.WorkflowRoleStatic that = (ugs.proxies.WorkflowRoleStatic) obj;
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
		return "UGS.WorkflowRoleStatic";
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