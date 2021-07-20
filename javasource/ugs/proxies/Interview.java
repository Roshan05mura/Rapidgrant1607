// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Interview
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject interviewMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Interview";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Score("Score"),
		Remarks("Remarks"),
		StartDateAndTime("StartDateAndTime"),
		Block("Block"),
		EmptyC("EmptyC"),
		ChairpersonApproved("ChairpersonApproved"),
		InterviewerAprroved("InterviewerAprroved"),
		Agenda("Agenda"),
		TypeOfMeeting("TypeOfMeeting"),
		JsonString("JsonString"),
		Interviewers("Interviewers"),
		GrantSystem_Allinterviews("UGS.GrantSystem_Allinterviews"),
		Activity_Interview("UGS.Activity_Interview"),
		Interview_GrantSystem("UGS.Interview_GrantSystem"),
		Interview_applicant("UGS.Interview_applicant"),
		Interview_ChiarPerson("UGS.Interview_ChiarPerson"),
		interview_PanelInterviewer("UGS.interview_PanelInterviewer"),
		Account_SelectInterviewers("Administration.Account_SelectInterviewers");

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

	public Interview(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Interview"));
	}

	protected Interview(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject interviewMendixObject)
	{
		if (interviewMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Interview", interviewMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Interview");

		this.interviewMendixObject = interviewMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Interview.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Interview initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Interview.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Interview initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Interview(context, mendixObject);
	}

	public static ugs.proxies.Interview load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Interview.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Interview> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Interview> result = new java.util.ArrayList<ugs.proxies.Interview>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Interview" + xpathConstraint))
			result.add(ugs.proxies.Interview.initialize(context, obj));
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
	 * @return value of Score
	 */
	public final java.lang.Integer getScore()
	{
		return getScore(getContext());
	}

	/**
	 * @param context
	 * @return value of Score
	 */
	public final java.lang.Integer getScore(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Score.toString());
	}

	/**
	 * Set value of Score
	 * @param score
	 */
	public final void setScore(java.lang.Integer score)
	{
		setScore(getContext(), score);
	}

	/**
	 * Set value of Score
	 * @param context
	 * @param score
	 */
	public final void setScore(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer score)
	{
		getMendixObject().setValue(context, MemberNames.Score.toString(), score);
	}

	/**
	 * @return value of Remarks
	 */
	public final java.lang.String getRemarks()
	{
		return getRemarks(getContext());
	}

	/**
	 * @param context
	 * @return value of Remarks
	 */
	public final java.lang.String getRemarks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Remarks.toString());
	}

	/**
	 * Set value of Remarks
	 * @param remarks
	 */
	public final void setRemarks(java.lang.String remarks)
	{
		setRemarks(getContext(), remarks);
	}

	/**
	 * Set value of Remarks
	 * @param context
	 * @param remarks
	 */
	public final void setRemarks(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String remarks)
	{
		getMendixObject().setValue(context, MemberNames.Remarks.toString(), remarks);
	}

	/**
	 * @return value of StartDateAndTime
	 */
	public final java.util.Date getStartDateAndTime()
	{
		return getStartDateAndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDateAndTime
	 */
	public final java.util.Date getStartDateAndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDateAndTime.toString());
	}

	/**
	 * Set value of StartDateAndTime
	 * @param startdateandtime
	 */
	public final void setStartDateAndTime(java.util.Date startdateandtime)
	{
		setStartDateAndTime(getContext(), startdateandtime);
	}

	/**
	 * Set value of StartDateAndTime
	 * @param context
	 * @param startdateandtime
	 */
	public final void setStartDateAndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdateandtime)
	{
		getMendixObject().setValue(context, MemberNames.StartDateAndTime.toString(), startdateandtime);
	}

	/**
	 * @return value of Block
	 */
	public final java.lang.Boolean getBlock()
	{
		return getBlock(getContext());
	}

	/**
	 * @param context
	 * @return value of Block
	 */
	public final java.lang.Boolean getBlock(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Block.toString());
	}

	/**
	 * Set value of Block
	 * @param block
	 */
	public final void setBlock(java.lang.Boolean block)
	{
		setBlock(getContext(), block);
	}

	/**
	 * Set value of Block
	 * @param context
	 * @param block
	 */
	public final void setBlock(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean block)
	{
		getMendixObject().setValue(context, MemberNames.Block.toString(), block);
	}

	/**
	 * @return value of EmptyC
	 */
	public final java.lang.String getEmptyC()
	{
		return getEmptyC(getContext());
	}

	/**
	 * @param context
	 * @return value of EmptyC
	 */
	public final java.lang.String getEmptyC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmptyC.toString());
	}

	/**
	 * Set value of EmptyC
	 * @param emptyc
	 */
	public final void setEmptyC(java.lang.String emptyc)
	{
		setEmptyC(getContext(), emptyc);
	}

	/**
	 * Set value of EmptyC
	 * @param context
	 * @param emptyc
	 */
	public final void setEmptyC(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emptyc)
	{
		getMendixObject().setValue(context, MemberNames.EmptyC.toString(), emptyc);
	}

	/**
	 * @return value of ChairpersonApproved
	 */
	public final java.lang.Boolean getChairpersonApproved()
	{
		return getChairpersonApproved(getContext());
	}

	/**
	 * @param context
	 * @return value of ChairpersonApproved
	 */
	public final java.lang.Boolean getChairpersonApproved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ChairpersonApproved.toString());
	}

	/**
	 * Set value of ChairpersonApproved
	 * @param chairpersonapproved
	 */
	public final void setChairpersonApproved(java.lang.Boolean chairpersonapproved)
	{
		setChairpersonApproved(getContext(), chairpersonapproved);
	}

	/**
	 * Set value of ChairpersonApproved
	 * @param context
	 * @param chairpersonapproved
	 */
	public final void setChairpersonApproved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean chairpersonapproved)
	{
		getMendixObject().setValue(context, MemberNames.ChairpersonApproved.toString(), chairpersonapproved);
	}

	/**
	 * @return value of InterviewerAprroved
	 */
	public final java.lang.Boolean getInterviewerAprroved()
	{
		return getInterviewerAprroved(getContext());
	}

	/**
	 * @param context
	 * @return value of InterviewerAprroved
	 */
	public final java.lang.Boolean getInterviewerAprroved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InterviewerAprroved.toString());
	}

	/**
	 * Set value of InterviewerAprroved
	 * @param intervieweraprroved
	 */
	public final void setInterviewerAprroved(java.lang.Boolean intervieweraprroved)
	{
		setInterviewerAprroved(getContext(), intervieweraprroved);
	}

	/**
	 * Set value of InterviewerAprroved
	 * @param context
	 * @param intervieweraprroved
	 */
	public final void setInterviewerAprroved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean intervieweraprroved)
	{
		getMendixObject().setValue(context, MemberNames.InterviewerAprroved.toString(), intervieweraprroved);
	}

	/**
	 * @return value of Agenda
	 */
	public final java.lang.String getAgenda()
	{
		return getAgenda(getContext());
	}

	/**
	 * @param context
	 * @return value of Agenda
	 */
	public final java.lang.String getAgenda(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Agenda.toString());
	}

	/**
	 * Set value of Agenda
	 * @param agenda
	 */
	public final void setAgenda(java.lang.String agenda)
	{
		setAgenda(getContext(), agenda);
	}

	/**
	 * Set value of Agenda
	 * @param context
	 * @param agenda
	 */
	public final void setAgenda(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String agenda)
	{
		getMendixObject().setValue(context, MemberNames.Agenda.toString(), agenda);
	}

	/**
	 * Set value of TypeOfMeeting
	 * @param typeofmeeting
	 */
	public final ugs.proxies.Enum_TypeOfMeeting getTypeOfMeeting()
	{
		return getTypeOfMeeting(getContext());
	}

	/**
	 * @param context
	 * @return value of TypeOfMeeting
	 */
	public final ugs.proxies.Enum_TypeOfMeeting getTypeOfMeeting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TypeOfMeeting.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_TypeOfMeeting.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TypeOfMeeting
	 * @param typeofmeeting
	 */
	public final void setTypeOfMeeting(ugs.proxies.Enum_TypeOfMeeting typeofmeeting)
	{
		setTypeOfMeeting(getContext(), typeofmeeting);
	}

	/**
	 * Set value of TypeOfMeeting
	 * @param context
	 * @param typeofmeeting
	 */
	public final void setTypeOfMeeting(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_TypeOfMeeting typeofmeeting)
	{
		if (typeofmeeting != null)
			getMendixObject().setValue(context, MemberNames.TypeOfMeeting.toString(), typeofmeeting.toString());
		else
			getMendixObject().setValue(context, MemberNames.TypeOfMeeting.toString(), null);
	}

	/**
	 * @return value of JsonString
	 */
	public final java.lang.String getJsonString()
	{
		return getJsonString(getContext());
	}

	/**
	 * @param context
	 * @return value of JsonString
	 */
	public final java.lang.String getJsonString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JsonString.toString());
	}

	/**
	 * Set value of JsonString
	 * @param jsonstring
	 */
	public final void setJsonString(java.lang.String jsonstring)
	{
		setJsonString(getContext(), jsonstring);
	}

	/**
	 * Set value of JsonString
	 * @param context
	 * @param jsonstring
	 */
	public final void setJsonString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jsonstring)
	{
		getMendixObject().setValue(context, MemberNames.JsonString.toString(), jsonstring);
	}

	/**
	 * @return value of Interviewers
	 */
	public final java.lang.String getInterviewers()
	{
		return getInterviewers(getContext());
	}

	/**
	 * @param context
	 * @return value of Interviewers
	 */
	public final java.lang.String getInterviewers(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Interviewers.toString());
	}

	/**
	 * Set value of Interviewers
	 * @param interviewers
	 */
	public final void setInterviewers(java.lang.String interviewers)
	{
		setInterviewers(getContext(), interviewers);
	}

	/**
	 * Set value of Interviewers
	 * @param context
	 * @param interviewers
	 */
	public final void setInterviewers(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interviewers)
	{
		getMendixObject().setValue(context, MemberNames.Interviewers.toString(), interviewers);
	}

	/**
	 * @return value of GrantSystem_Allinterviews
	 */
	public final ugs.proxies.GrantSystem getGrantSystem_Allinterviews() throws com.mendix.core.CoreException
	{
		return getGrantSystem_Allinterviews(getContext());
	}

	/**
	 * @param context
	 * @return value of GrantSystem_Allinterviews
	 */
	public final ugs.proxies.GrantSystem getGrantSystem_Allinterviews(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GrantSystem_Allinterviews.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GrantSystem_Allinterviews
	 * @param grantsystem_allinterviews
	 */
	public final void setGrantSystem_Allinterviews(ugs.proxies.GrantSystem grantsystem_allinterviews)
	{
		setGrantSystem_Allinterviews(getContext(), grantsystem_allinterviews);
	}

	/**
	 * Set value of GrantSystem_Allinterviews
	 * @param context
	 * @param grantsystem_allinterviews
	 */
	public final void setGrantSystem_Allinterviews(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem grantsystem_allinterviews)
	{
		if (grantsystem_allinterviews == null)
			getMendixObject().setValue(context, MemberNames.GrantSystem_Allinterviews.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GrantSystem_Allinterviews.toString(), grantsystem_allinterviews.getMendixObject().getId());
	}

	/**
	 * @return value of Activity_Interview
	 */
	public final ugs.proxies.Activity getActivity_Interview() throws com.mendix.core.CoreException
	{
		return getActivity_Interview(getContext());
	}

	/**
	 * @param context
	 * @return value of Activity_Interview
	 */
	public final ugs.proxies.Activity getActivity_Interview(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Activity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Activity_Interview.toString());
		if (identifier != null)
			result = ugs.proxies.Activity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Activity_Interview
	 * @param activity_interview
	 */
	public final void setActivity_Interview(ugs.proxies.Activity activity_interview)
	{
		setActivity_Interview(getContext(), activity_interview);
	}

	/**
	 * Set value of Activity_Interview
	 * @param context
	 * @param activity_interview
	 */
	public final void setActivity_Interview(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Activity activity_interview)
	{
		if (activity_interview == null)
			getMendixObject().setValue(context, MemberNames.Activity_Interview.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Activity_Interview.toString(), activity_interview.getMendixObject().getId());
	}

	/**
	 * @return value of Interview_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getInterview_GrantSystem() throws com.mendix.core.CoreException
	{
		return getInterview_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of Interview_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getInterview_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Interview_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Interview_GrantSystem
	 * @param interview_grantsystem
	 */
	public final void setInterview_GrantSystem(ugs.proxies.GrantSystem interview_grantsystem)
	{
		setInterview_GrantSystem(getContext(), interview_grantsystem);
	}

	/**
	 * Set value of Interview_GrantSystem
	 * @param context
	 * @param interview_grantsystem
	 */
	public final void setInterview_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem interview_grantsystem)
	{
		if (interview_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.Interview_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Interview_GrantSystem.toString(), interview_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return value of Interview_applicant
	 */
	public final administration.proxies.Account getInterview_applicant() throws com.mendix.core.CoreException
	{
		return getInterview_applicant(getContext());
	}

	/**
	 * @param context
	 * @return value of Interview_applicant
	 */
	public final administration.proxies.Account getInterview_applicant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Interview_applicant.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Interview_applicant
	 * @param interview_applicant
	 */
	public final void setInterview_applicant(administration.proxies.Account interview_applicant)
	{
		setInterview_applicant(getContext(), interview_applicant);
	}

	/**
	 * Set value of Interview_applicant
	 * @param context
	 * @param interview_applicant
	 */
	public final void setInterview_applicant(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account interview_applicant)
	{
		if (interview_applicant == null)
			getMendixObject().setValue(context, MemberNames.Interview_applicant.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Interview_applicant.toString(), interview_applicant.getMendixObject().getId());
	}

	/**
	 * @return value of Interview_ChiarPerson
	 */
	public final administration.proxies.Account getInterview_ChiarPerson() throws com.mendix.core.CoreException
	{
		return getInterview_ChiarPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of Interview_ChiarPerson
	 */
	public final administration.proxies.Account getInterview_ChiarPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Interview_ChiarPerson.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Interview_ChiarPerson
	 * @param interview_chiarperson
	 */
	public final void setInterview_ChiarPerson(administration.proxies.Account interview_chiarperson)
	{
		setInterview_ChiarPerson(getContext(), interview_chiarperson);
	}

	/**
	 * Set value of Interview_ChiarPerson
	 * @param context
	 * @param interview_chiarperson
	 */
	public final void setInterview_ChiarPerson(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account interview_chiarperson)
	{
		if (interview_chiarperson == null)
			getMendixObject().setValue(context, MemberNames.Interview_ChiarPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Interview_ChiarPerson.toString(), interview_chiarperson.getMendixObject().getId());
	}

	/**
	 * @return value of interview_PanelInterviewer
	 */
	public final administration.proxies.Account getinterview_PanelInterviewer() throws com.mendix.core.CoreException
	{
		return getinterview_PanelInterviewer(getContext());
	}

	/**
	 * @param context
	 * @return value of interview_PanelInterviewer
	 */
	public final administration.proxies.Account getinterview_PanelInterviewer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.interview_PanelInterviewer.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of interview_PanelInterviewer
	 * @param interview_panelinterviewer
	 */
	public final void setinterview_PanelInterviewer(administration.proxies.Account interview_panelinterviewer)
	{
		setinterview_PanelInterviewer(getContext(), interview_panelinterviewer);
	}

	/**
	 * Set value of interview_PanelInterviewer
	 * @param context
	 * @param interview_panelinterviewer
	 */
	public final void setinterview_PanelInterviewer(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account interview_panelinterviewer)
	{
		if (interview_panelinterviewer == null)
			getMendixObject().setValue(context, MemberNames.interview_PanelInterviewer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.interview_PanelInterviewer.toString(), interview_panelinterviewer.getMendixObject().getId());
	}

	/**
	 * @return value of Account_SelectInterviewers
	 */
	public final java.util.List<administration.proxies.Account> getAccount_SelectInterviewers() throws com.mendix.core.CoreException
	{
		return getAccount_SelectInterviewers(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_SelectInterviewers
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<administration.proxies.Account> getAccount_SelectInterviewers(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Account> result = new java.util.ArrayList<administration.proxies.Account>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Account_SelectInterviewers.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(administration.proxies.Account.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Account_SelectInterviewers
	 * @param account_selectinterviewers
	 */
	public final void setAccount_SelectInterviewers(java.util.List<administration.proxies.Account> account_selectinterviewers)
	{
		setAccount_SelectInterviewers(getContext(), account_selectinterviewers);
	}

	/**
	 * Set value of Account_SelectInterviewers
	 * @param context
	 * @param account_selectinterviewers
	 */
	public final void setAccount_SelectInterviewers(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<administration.proxies.Account> account_selectinterviewers)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (administration.proxies.Account proxyObject : account_selectinterviewers)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Account_SelectInterviewers.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return interviewMendixObject;
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
			final ugs.proxies.Interview that = (ugs.proxies.Interview) obj;
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
		return "UGS.Interview";
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
