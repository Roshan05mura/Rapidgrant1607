// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Workflow
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Workflow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UserRoleName("UserRoleName"),
		Stage("Stage"),
		Workflow_CaseMangement("UGS.Workflow_CaseMangement"),
		Workflow_Account("UGS.Workflow_Account");

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

	public Workflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Workflow"));
	}

	protected Workflow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowMendixObject)
	{
		if (workflowMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Workflow", workflowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Workflow");

		this.workflowMendixObject = workflowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Workflow.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Workflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Workflow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Workflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Workflow(context, mendixObject);
	}

	public static ugs.proxies.Workflow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Workflow.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Workflow> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Workflow> result = new java.util.ArrayList<ugs.proxies.Workflow>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Workflow" + xpathConstraint))
			result.add(ugs.proxies.Workflow.initialize(context, obj));
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
	 * Set value of UserRoleName
	 * @param userrolename
	 */
	public final ugs.proxies.Enum_CasestatusGM getUserRoleName()
	{
		return getUserRoleName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserRoleName
	 */
	public final ugs.proxies.Enum_CasestatusGM getUserRoleName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.UserRoleName.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_CasestatusGM.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of UserRoleName
	 * @param userrolename
	 */
	public final void setUserRoleName(ugs.proxies.Enum_CasestatusGM userrolename)
	{
		setUserRoleName(getContext(), userrolename);
	}

	/**
	 * Set value of UserRoleName
	 * @param context
	 * @param userrolename
	 */
	public final void setUserRoleName(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_CasestatusGM userrolename)
	{
		if (userrolename != null)
			getMendixObject().setValue(context, MemberNames.UserRoleName.toString(), userrolename.toString());
		else
			getMendixObject().setValue(context, MemberNames.UserRoleName.toString(), null);
	}

	/**
	 * @return value of Stage
	 */
	public final java.lang.Integer getStage()
	{
		return getStage(getContext());
	}

	/**
	 * @param context
	 * @return value of Stage
	 */
	public final java.lang.Integer getStage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stage.toString());
	}

	/**
	 * Set value of Stage
	 * @param stage
	 */
	public final void setStage(java.lang.Integer stage)
	{
		setStage(getContext(), stage);
	}

	/**
	 * Set value of Stage
	 * @param context
	 * @param stage
	 */
	public final void setStage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stage)
	{
		getMendixObject().setValue(context, MemberNames.Stage.toString(), stage);
	}

	/**
	 * @return value of Workflow_CaseMangement
	 */
	public final ugs.proxies.CaseMangement getWorkflow_CaseMangement() throws com.mendix.core.CoreException
	{
		return getWorkflow_CaseMangement(getContext());
	}

	/**
	 * @param context
	 * @return value of Workflow_CaseMangement
	 */
	public final ugs.proxies.CaseMangement getWorkflow_CaseMangement(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.CaseMangement result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Workflow_CaseMangement.toString());
		if (identifier != null)
			result = ugs.proxies.CaseMangement.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Workflow_CaseMangement
	 * @param workflow_casemangement
	 */
	public final void setWorkflow_CaseMangement(ugs.proxies.CaseMangement workflow_casemangement)
	{
		setWorkflow_CaseMangement(getContext(), workflow_casemangement);
	}

	/**
	 * Set value of Workflow_CaseMangement
	 * @param context
	 * @param workflow_casemangement
	 */
	public final void setWorkflow_CaseMangement(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.CaseMangement workflow_casemangement)
	{
		if (workflow_casemangement == null)
			getMendixObject().setValue(context, MemberNames.Workflow_CaseMangement.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Workflow_CaseMangement.toString(), workflow_casemangement.getMendixObject().getId());
	}

	/**
	 * @return value of Workflow_Account
	 */
	public final administration.proxies.Account getWorkflow_Account() throws com.mendix.core.CoreException
	{
		return getWorkflow_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Workflow_Account
	 */
	public final administration.proxies.Account getWorkflow_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Workflow_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Workflow_Account
	 * @param workflow_account
	 */
	public final void setWorkflow_Account(administration.proxies.Account workflow_account)
	{
		setWorkflow_Account(getContext(), workflow_account);
	}

	/**
	 * Set value of Workflow_Account
	 * @param context
	 * @param workflow_account
	 */
	public final void setWorkflow_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account workflow_account)
	{
		if (workflow_account == null)
			getMendixObject().setValue(context, MemberNames.Workflow_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Workflow_Account.toString(), workflow_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowMendixObject;
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
			final ugs.proxies.Workflow that = (ugs.proxies.Workflow) obj;
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
		return "UGS.Workflow";
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
