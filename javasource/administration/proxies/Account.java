// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies;

public class Account extends system.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administration.Account";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		OrganisationName("OrganisationName"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		Account_Profile("Administration.Account_Profile"),
		GrantSystem_AllAccounts("UGS.GrantSystem_AllAccounts"),
		GrantSystem_CurrentHoldingAccount("UGS.GrantSystem_CurrentHoldingAccount"),
		Interview_applicant("UGS.Interview_applicant"),
		Interview_ChiarPerson("UGS.Interview_ChiarPerson"),
		interview_PanelInterviewer("UGS.interview_PanelInterviewer"),
		CaseMangement_CurrentHoldingAccount("UGS.CaseMangement_CurrentHoldingAccount"),
		Workflow_Account("UGS.Workflow_Account"),
		Account_Organization("Administration.Account_Organization"),
		EmailAccount_Account("IMAP_POP3_email.EmailAccount_Account"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Administration.Account"));
	}

	protected Account(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject)
	{
		super(context, accountMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Administration.Account", accountMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Administration.Account");
	}

	/**
	 * @deprecated Use 'Account.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administration.proxies.Account.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administration.proxies.Account(context, mendixObject);
	}

	public static administration.proxies.Account load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administration.proxies.Account.initialize(context, mendixObject);
	}

	public static java.util.List<administration.proxies.Account> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Account> result = new java.util.ArrayList<administration.proxies.Account>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Administration.Account" + xpathConstraint))
			result.add(administration.proxies.Account.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser()
	{
		return getIsLocalUser(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLocalUser.toString());
	}

	/**
	 * Set value of IsLocalUser
	 * @param islocaluser
	 */
	public final void setIsLocalUser(java.lang.Boolean islocaluser)
	{
		setIsLocalUser(getContext(), islocaluser);
	}

	/**
	 * Set value of IsLocalUser
	 * @param context
	 * @param islocaluser
	 */
	public final void setIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islocaluser)
	{
		getMendixObject().setValue(context, MemberNames.IsLocalUser.toString(), islocaluser);
	}

	/**
	 * @return value of OrganisationName
	 */
	public final java.lang.String getOrganisationName()
	{
		return getOrganisationName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationName
	 */
	public final java.lang.String getOrganisationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganisationName.toString());
	}

	/**
	 * Set value of OrganisationName
	 * @param organisationname
	 */
	public final void setOrganisationName(java.lang.String organisationname)
	{
		setOrganisationName(getContext(), organisationname);
	}

	/**
	 * Set value of OrganisationName
	 * @param context
	 * @param organisationname
	 */
	public final void setOrganisationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisationname)
	{
		getMendixObject().setValue(context, MemberNames.OrganisationName.toString(), organisationname);
	}

	/**
	 * @return value of Account_Profile
	 */
	public final administration.proxies.Profile getAccount_Profile() throws com.mendix.core.CoreException
	{
		return getAccount_Profile(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_Profile
	 */
	public final administration.proxies.Profile getAccount_Profile(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Profile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_Profile.toString());
		if (identifier != null)
			result = administration.proxies.Profile.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_Profile
	 * @param account_profile
	 */
	public final void setAccount_Profile(administration.proxies.Profile account_profile)
	{
		setAccount_Profile(getContext(), account_profile);
	}

	/**
	 * Set value of Account_Profile
	 * @param context
	 * @param account_profile
	 */
	public final void setAccount_Profile(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Profile account_profile)
	{
		if (account_profile == null)
			getMendixObject().setValue(context, MemberNames.Account_Profile.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_Profile.toString(), account_profile.getMendixObject().getId());
	}

	/**
	 * @return value of GrantSystem_AllAccounts
	 */
	public final java.util.List<ugs.proxies.GrantSystem> getGrantSystem_AllAccounts() throws com.mendix.core.CoreException
	{
		return getGrantSystem_AllAccounts(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantSystem_AllAccounts
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<ugs.proxies.GrantSystem> getGrantSystem_AllAccounts(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.GrantSystem> result = new java.util.ArrayList<ugs.proxies.GrantSystem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.GrantSystem_AllAccounts.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(ugs.proxies.GrantSystem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of GrantSystem_AllAccounts
	 * @param grantsystem_allaccounts
	 */
	public final void setGrantSystem_AllAccounts(java.util.List<ugs.proxies.GrantSystem> grantsystem_allaccounts)
	{
		setGrantSystem_AllAccounts(getContext(), grantsystem_allaccounts);
	}

	/**
	 * Set value of GrantSystem_AllAccounts
	 * @param context
	 * @param grantsystem_allaccounts
	 */
	public final void setGrantSystem_AllAccounts(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<ugs.proxies.GrantSystem> grantsystem_allaccounts)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (ugs.proxies.GrantSystem proxyObject : grantsystem_allaccounts)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.GrantSystem_AllAccounts.toString(), identifiers);
	}

	/**
	 * @return value of GrantSystem_CurrentHoldingAccount
	 */
	public final java.util.List<ugs.proxies.GrantSystem> getGrantSystem_CurrentHoldingAccount() throws com.mendix.core.CoreException
	{
		return getGrantSystem_CurrentHoldingAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantSystem_CurrentHoldingAccount
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<ugs.proxies.GrantSystem> getGrantSystem_CurrentHoldingAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.GrantSystem> result = new java.util.ArrayList<ugs.proxies.GrantSystem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.GrantSystem_CurrentHoldingAccount.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(ugs.proxies.GrantSystem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of GrantSystem_CurrentHoldingAccount
	 * @param grantsystem_currentholdingaccount
	 */
	public final void setGrantSystem_CurrentHoldingAccount(java.util.List<ugs.proxies.GrantSystem> grantsystem_currentholdingaccount)
	{
		setGrantSystem_CurrentHoldingAccount(getContext(), grantsystem_currentholdingaccount);
	}

	/**
	 * Set value of GrantSystem_CurrentHoldingAccount
	 * @param context
	 * @param grantsystem_currentholdingaccount
	 */
	public final void setGrantSystem_CurrentHoldingAccount(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<ugs.proxies.GrantSystem> grantsystem_currentholdingaccount)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (ugs.proxies.GrantSystem proxyObject : grantsystem_currentholdingaccount)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.GrantSystem_CurrentHoldingAccount.toString(), identifiers);
	}

	/**
	 * @return value of Interview_applicant
	 */
	public final ugs.proxies.Interview getInterview_applicant() throws com.mendix.core.CoreException
	{
		return getInterview_applicant(getContext());
	}

	/**
	 * @param context
	 * @return value of Interview_applicant
	 */
	public final ugs.proxies.Interview getInterview_applicant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Interview result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Interview_applicant.toString());
		if (identifier != null)
			result = ugs.proxies.Interview.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Interview_applicant
	 * @param interview_applicant
	 */
	public final void setInterview_applicant(ugs.proxies.Interview interview_applicant)
	{
		setInterview_applicant(getContext(), interview_applicant);
	}

	/**
	 * Set value of Interview_applicant
	 * @param context
	 * @param interview_applicant
	 */
	public final void setInterview_applicant(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Interview interview_applicant)
	{
		if (interview_applicant == null)
			getMendixObject().setValue(context, MemberNames.Interview_applicant.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Interview_applicant.toString(), interview_applicant.getMendixObject().getId());
	}

	/**
	 * @return value of Interview_ChiarPerson
	 */
	public final ugs.proxies.Interview getInterview_ChiarPerson() throws com.mendix.core.CoreException
	{
		return getInterview_ChiarPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of Interview_ChiarPerson
	 */
	public final ugs.proxies.Interview getInterview_ChiarPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Interview result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Interview_ChiarPerson.toString());
		if (identifier != null)
			result = ugs.proxies.Interview.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Interview_ChiarPerson
	 * @param interview_chiarperson
	 */
	public final void setInterview_ChiarPerson(ugs.proxies.Interview interview_chiarperson)
	{
		setInterview_ChiarPerson(getContext(), interview_chiarperson);
	}

	/**
	 * Set value of Interview_ChiarPerson
	 * @param context
	 * @param interview_chiarperson
	 */
	public final void setInterview_ChiarPerson(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Interview interview_chiarperson)
	{
		if (interview_chiarperson == null)
			getMendixObject().setValue(context, MemberNames.Interview_ChiarPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Interview_ChiarPerson.toString(), interview_chiarperson.getMendixObject().getId());
	}

	/**
	 * @return value of interview_PanelInterviewer
	 */
	public final ugs.proxies.Interview getinterview_PanelInterviewer() throws com.mendix.core.CoreException
	{
		return getinterview_PanelInterviewer(getContext());
	}

	/**
	 * @param context
	 * @return value of interview_PanelInterviewer
	 */
	public final ugs.proxies.Interview getinterview_PanelInterviewer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Interview result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.interview_PanelInterviewer.toString());
		if (identifier != null)
			result = ugs.proxies.Interview.load(context, identifier);
		return result;
	}

	/**
	 * Set value of interview_PanelInterviewer
	 * @param interview_panelinterviewer
	 */
	public final void setinterview_PanelInterviewer(ugs.proxies.Interview interview_panelinterviewer)
	{
		setinterview_PanelInterviewer(getContext(), interview_panelinterviewer);
	}

	/**
	 * Set value of interview_PanelInterviewer
	 * @param context
	 * @param interview_panelinterviewer
	 */
	public final void setinterview_PanelInterviewer(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Interview interview_panelinterviewer)
	{
		if (interview_panelinterviewer == null)
			getMendixObject().setValue(context, MemberNames.interview_PanelInterviewer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.interview_PanelInterviewer.toString(), interview_panelinterviewer.getMendixObject().getId());
	}

	/**
	 * @return value of CaseMangement_CurrentHoldingAccount
	 */
	public final ugs.proxies.CaseMangement getCaseMangement_CurrentHoldingAccount() throws com.mendix.core.CoreException
	{
		return getCaseMangement_CurrentHoldingAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of CaseMangement_CurrentHoldingAccount
	 */
	public final ugs.proxies.CaseMangement getCaseMangement_CurrentHoldingAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.CaseMangement result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CaseMangement_CurrentHoldingAccount.toString());
		if (identifier != null)
			result = ugs.proxies.CaseMangement.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CaseMangement_CurrentHoldingAccount
	 * @param casemangement_currentholdingaccount
	 */
	public final void setCaseMangement_CurrentHoldingAccount(ugs.proxies.CaseMangement casemangement_currentholdingaccount)
	{
		setCaseMangement_CurrentHoldingAccount(getContext(), casemangement_currentholdingaccount);
	}

	/**
	 * Set value of CaseMangement_CurrentHoldingAccount
	 * @param context
	 * @param casemangement_currentholdingaccount
	 */
	public final void setCaseMangement_CurrentHoldingAccount(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.CaseMangement casemangement_currentholdingaccount)
	{
		if (casemangement_currentholdingaccount == null)
			getMendixObject().setValue(context, MemberNames.CaseMangement_CurrentHoldingAccount.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CaseMangement_CurrentHoldingAccount.toString(), casemangement_currentholdingaccount.getMendixObject().getId());
	}

	/**
	 * @return value of Workflow_Account
	 */
	public final ugs.proxies.Workflow getWorkflow_Account() throws com.mendix.core.CoreException
	{
		return getWorkflow_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Workflow_Account
	 */
	public final ugs.proxies.Workflow getWorkflow_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Workflow_Account.toString());
		if (identifier != null)
			result = ugs.proxies.Workflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Workflow_Account
	 * @param workflow_account
	 */
	public final void setWorkflow_Account(ugs.proxies.Workflow workflow_account)
	{
		setWorkflow_Account(getContext(), workflow_account);
	}

	/**
	 * Set value of Workflow_Account
	 * @param context
	 * @param workflow_account
	 */
	public final void setWorkflow_Account(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Workflow workflow_account)
	{
		if (workflow_account == null)
			getMendixObject().setValue(context, MemberNames.Workflow_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Workflow_Account.toString(), workflow_account.getMendixObject().getId());
	}

	/**
	 * @return value of Account_Organization
	 */
	public final ugs.proxies.Organization getAccount_Organization() throws com.mendix.core.CoreException
	{
		return getAccount_Organization(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_Organization
	 */
	public final ugs.proxies.Organization getAccount_Organization(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Organization result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_Organization.toString());
		if (identifier != null)
			result = ugs.proxies.Organization.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_Organization
	 * @param account_organization
	 */
	public final void setAccount_Organization(ugs.proxies.Organization account_organization)
	{
		setAccount_Organization(getContext(), account_organization);
	}

	/**
	 * Set value of Account_Organization
	 * @param context
	 * @param account_organization
	 */
	public final void setAccount_Organization(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Organization account_organization)
	{
		if (account_organization == null)
			getMendixObject().setValue(context, MemberNames.Account_Organization.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_Organization.toString(), account_organization.getMendixObject().getId());
	}

	/**
	 * @return value of EmailAccount_Account
	 */
	public final imap_pop3_email.proxies.EmailAccount getEmailAccount_Account() throws com.mendix.core.CoreException
	{
		return getEmailAccount_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAccount_Account
	 */
	public final imap_pop3_email.proxies.EmailAccount getEmailAccount_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		imap_pop3_email.proxies.EmailAccount result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.EmailAccount_Account.toString());
		if (identifier != null)
			result = imap_pop3_email.proxies.EmailAccount.load(context, identifier);
		return result;
	}

	/**
	 * Set value of EmailAccount_Account
	 * @param emailaccount_account
	 */
	public final void setEmailAccount_Account(imap_pop3_email.proxies.EmailAccount emailaccount_account)
	{
		setEmailAccount_Account(getContext(), emailaccount_account);
	}

	/**
	 * Set value of EmailAccount_Account
	 * @param context
	 * @param emailaccount_account
	 */
	public final void setEmailAccount_Account(com.mendix.systemwideinterfaces.core.IContext context, imap_pop3_email.proxies.EmailAccount emailaccount_account)
	{
		if (emailaccount_account == null)
			getMendixObject().setValue(context, MemberNames.EmailAccount_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.EmailAccount_Account.toString(), emailaccount_account.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final administration.proxies.Account that = (administration.proxies.Account) obj;
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
		return "Administration.Account";
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
