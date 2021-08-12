// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Eligibility
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject eligibilityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Eligibility";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Question("Question"),
		Answer("Answer"),
		Eligibility("Eligibility"),
		Editable("Editable"),
		Officers_Eligibility_GrantSystem("UGS.Officers_Eligibility_GrantSystem"),
		Anonymous_Eligibility_GrantSystem("UGS.Anonymous_Eligibility_GrantSystem"),
		Eligibility_Account("UGS.Eligibility_Account");

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

	public Eligibility(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Eligibility"));
	}

	protected Eligibility(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject eligibilityMendixObject)
	{
		if (eligibilityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Eligibility", eligibilityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Eligibility");

		this.eligibilityMendixObject = eligibilityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Eligibility.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Eligibility initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Eligibility.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Eligibility initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Eligibility(context, mendixObject);
	}

	public static ugs.proxies.Eligibility load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Eligibility.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Eligibility> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Eligibility> result = new java.util.ArrayList<ugs.proxies.Eligibility>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Eligibility" + xpathConstraint))
			result.add(ugs.proxies.Eligibility.initialize(context, obj));
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
	 * @return value of Question
	 */
	public final java.lang.String getQuestion()
	{
		return getQuestion(getContext());
	}

	/**
	 * @param context
	 * @return value of Question
	 */
	public final java.lang.String getQuestion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Question.toString());
	}

	/**
	 * Set value of Question
	 * @param question
	 */
	public final void setQuestion(java.lang.String question)
	{
		setQuestion(getContext(), question);
	}

	/**
	 * Set value of Question
	 * @param context
	 * @param question
	 */
	public final void setQuestion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String question)
	{
		getMendixObject().setValue(context, MemberNames.Question.toString(), question);
	}

	/**
	 * @return value of Answer
	 */
	public final java.lang.Boolean getAnswer()
	{
		return getAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of Answer
	 */
	public final java.lang.Boolean getAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Answer.toString());
	}

	/**
	 * Set value of Answer
	 * @param answer
	 */
	public final void setAnswer(java.lang.Boolean answer)
	{
		setAnswer(getContext(), answer);
	}

	/**
	 * Set value of Answer
	 * @param context
	 * @param answer
	 */
	public final void setAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean answer)
	{
		getMendixObject().setValue(context, MemberNames.Answer.toString(), answer);
	}

	/**
	 * @return value of Eligibility
	 */
	public final java.lang.Boolean getEligibility()
	{
		return getEligibility(getContext());
	}

	/**
	 * @param context
	 * @return value of Eligibility
	 */
	public final java.lang.Boolean getEligibility(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Eligibility.toString());
	}

	/**
	 * Set value of Eligibility
	 * @param eligibility
	 */
	public final void setEligibility(java.lang.Boolean eligibility)
	{
		setEligibility(getContext(), eligibility);
	}

	/**
	 * Set value of Eligibility
	 * @param context
	 * @param eligibility
	 */
	public final void setEligibility(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean eligibility)
	{
		getMendixObject().setValue(context, MemberNames.Eligibility.toString(), eligibility);
	}

	/**
	 * @return value of Editable
	 */
	public final java.lang.Boolean getEditable()
	{
		return getEditable(getContext());
	}

	/**
	 * @param context
	 * @return value of Editable
	 */
	public final java.lang.Boolean getEditable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Editable.toString());
	}

	/**
	 * Set value of Editable
	 * @param editable
	 */
	public final void setEditable(java.lang.Boolean editable)
	{
		setEditable(getContext(), editable);
	}

	/**
	 * Set value of Editable
	 * @param context
	 * @param editable
	 */
	public final void setEditable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean editable)
	{
		getMendixObject().setValue(context, MemberNames.Editable.toString(), editable);
	}

	/**
	 * @return value of Officers_Eligibility_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getOfficers_Eligibility_GrantSystem() throws com.mendix.core.CoreException
	{
		return getOfficers_Eligibility_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of Officers_Eligibility_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getOfficers_Eligibility_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Officers_Eligibility_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Officers_Eligibility_GrantSystem
	 * @param officers_eligibility_grantsystem
	 */
	public final void setOfficers_Eligibility_GrantSystem(ugs.proxies.GrantSystem officers_eligibility_grantsystem)
	{
		setOfficers_Eligibility_GrantSystem(getContext(), officers_eligibility_grantsystem);
	}

	/**
	 * Set value of Officers_Eligibility_GrantSystem
	 * @param context
	 * @param officers_eligibility_grantsystem
	 */
	public final void setOfficers_Eligibility_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem officers_eligibility_grantsystem)
	{
		if (officers_eligibility_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.Officers_Eligibility_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Officers_Eligibility_GrantSystem.toString(), officers_eligibility_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return value of Anonymous_Eligibility_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getAnonymous_Eligibility_GrantSystem() throws com.mendix.core.CoreException
	{
		return getAnonymous_Eligibility_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of Anonymous_Eligibility_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getAnonymous_Eligibility_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Anonymous_Eligibility_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Anonymous_Eligibility_GrantSystem
	 * @param anonymous_eligibility_grantsystem
	 */
	public final void setAnonymous_Eligibility_GrantSystem(ugs.proxies.GrantSystem anonymous_eligibility_grantsystem)
	{
		setAnonymous_Eligibility_GrantSystem(getContext(), anonymous_eligibility_grantsystem);
	}

	/**
	 * Set value of Anonymous_Eligibility_GrantSystem
	 * @param context
	 * @param anonymous_eligibility_grantsystem
	 */
	public final void setAnonymous_Eligibility_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem anonymous_eligibility_grantsystem)
	{
		if (anonymous_eligibility_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.Anonymous_Eligibility_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Anonymous_Eligibility_GrantSystem.toString(), anonymous_eligibility_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return value of Eligibility_Account
	 */
	public final administration.proxies.Account getEligibility_Account() throws com.mendix.core.CoreException
	{
		return getEligibility_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Eligibility_Account
	 */
	public final administration.proxies.Account getEligibility_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Eligibility_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Eligibility_Account
	 * @param eligibility_account
	 */
	public final void setEligibility_Account(administration.proxies.Account eligibility_account)
	{
		setEligibility_Account(getContext(), eligibility_account);
	}

	/**
	 * Set value of Eligibility_Account
	 * @param context
	 * @param eligibility_account
	 */
	public final void setEligibility_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account eligibility_account)
	{
		if (eligibility_account == null)
			getMendixObject().setValue(context, MemberNames.Eligibility_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Eligibility_Account.toString(), eligibility_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return eligibilityMendixObject;
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
			final ugs.proxies.Eligibility that = (ugs.proxies.Eligibility) obj;
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
		return "UGS.Eligibility";
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
