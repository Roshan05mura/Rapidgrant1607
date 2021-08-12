// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class ReviewForm
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject reviewFormMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.ReviewForm";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ReviewFormName("ReviewFormName"),
		Main("Main"),
		RatingType("RatingType"),
		Comments("Comments"),
		Average_Score("Average_Score"),
		ReviewType("ReviewType"),
		NumericalScoreAsEnum("NumericalScoreAsEnum"),
		EmptyC("EmptyC"),
		ReviewedBy("ReviewedBy"),
		ReviewForm_GrantSystem_CurrentReviewForm("UGS.ReviewForm_GrantSystem_CurrentReviewForm"),
		ReviewForm_GrantSystem_PastReviewForms("UGS.ReviewForm_GrantSystem_PastReviewForms"),
		ReviewForm_WorkflowRoles("UGS.ReviewForm_WorkflowRoles"),
		ReviewForm_WorkflowRoles_Dummy("UGS.ReviewForm_WorkflowRoles_Dummy");

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

	public ReviewForm(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.ReviewForm"));
	}

	protected ReviewForm(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject reviewFormMendixObject)
	{
		if (reviewFormMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.ReviewForm", reviewFormMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.ReviewForm");

		this.reviewFormMendixObject = reviewFormMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReviewForm.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.ReviewForm initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.ReviewForm.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.ReviewForm initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.ReviewForm(context, mendixObject);
	}

	public static ugs.proxies.ReviewForm load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.ReviewForm.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.ReviewForm> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.ReviewForm> result = new java.util.ArrayList<ugs.proxies.ReviewForm>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.ReviewForm" + xpathConstraint))
			result.add(ugs.proxies.ReviewForm.initialize(context, obj));
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
	 * @return value of ReviewFormName
	 */
	public final java.lang.String getReviewFormName()
	{
		return getReviewFormName(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewFormName
	 */
	public final java.lang.String getReviewFormName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReviewFormName.toString());
	}

	/**
	 * Set value of ReviewFormName
	 * @param reviewformname
	 */
	public final void setReviewFormName(java.lang.String reviewformname)
	{
		setReviewFormName(getContext(), reviewformname);
	}

	/**
	 * Set value of ReviewFormName
	 * @param context
	 * @param reviewformname
	 */
	public final void setReviewFormName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reviewformname)
	{
		getMendixObject().setValue(context, MemberNames.ReviewFormName.toString(), reviewformname);
	}

	/**
	 * @return value of Main
	 */
	public final java.lang.Boolean getMain()
	{
		return getMain(getContext());
	}

	/**
	 * @param context
	 * @return value of Main
	 */
	public final java.lang.Boolean getMain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Main.toString());
	}

	/**
	 * Set value of Main
	 * @param main
	 */
	public final void setMain(java.lang.Boolean main)
	{
		setMain(getContext(), main);
	}

	/**
	 * Set value of Main
	 * @param context
	 * @param main
	 */
	public final void setMain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean main)
	{
		getMendixObject().setValue(context, MemberNames.Main.toString(), main);
	}

	/**
	 * Set value of RatingType
	 * @param ratingtype
	 */
	public final ugs.proxies.Enum_ReviewTypes getRatingType()
	{
		return getRatingType(getContext());
	}

	/**
	 * @param context
	 * @return value of RatingType
	 */
	public final ugs.proxies.Enum_ReviewTypes getRatingType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RatingType.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_ReviewTypes.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RatingType
	 * @param ratingtype
	 */
	public final void setRatingType(ugs.proxies.Enum_ReviewTypes ratingtype)
	{
		setRatingType(getContext(), ratingtype);
	}

	/**
	 * Set value of RatingType
	 * @param context
	 * @param ratingtype
	 */
	public final void setRatingType(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_ReviewTypes ratingtype)
	{
		if (ratingtype != null)
			getMendixObject().setValue(context, MemberNames.RatingType.toString(), ratingtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.RatingType.toString(), null);
	}

	/**
	 * @return value of Comments
	 */
	public final java.lang.String getComments()
	{
		return getComments(getContext());
	}

	/**
	 * @param context
	 * @return value of Comments
	 */
	public final java.lang.String getComments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Comments.toString());
	}

	/**
	 * Set value of Comments
	 * @param comments
	 */
	public final void setComments(java.lang.String comments)
	{
		setComments(getContext(), comments);
	}

	/**
	 * Set value of Comments
	 * @param context
	 * @param comments
	 */
	public final void setComments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String comments)
	{
		getMendixObject().setValue(context, MemberNames.Comments.toString(), comments);
	}

	/**
	 * @return value of Average_Score
	 */
	public final java.lang.Integer getAverage_Score()
	{
		return getAverage_Score(getContext());
	}

	/**
	 * @param context
	 * @return value of Average_Score
	 */
	public final java.lang.Integer getAverage_Score(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Average_Score.toString());
	}

	/**
	 * Set value of Average_Score
	 * @param average_score
	 */
	public final void setAverage_Score(java.lang.Integer average_score)
	{
		setAverage_Score(getContext(), average_score);
	}

	/**
	 * Set value of Average_Score
	 * @param context
	 * @param average_score
	 */
	public final void setAverage_Score(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer average_score)
	{
		getMendixObject().setValue(context, MemberNames.Average_Score.toString(), average_score);
	}

	/**
	 * Set value of ReviewType
	 * @param reviewtype
	 */
	public final dynamicform.proxies.Enum_ReviewType getReviewType()
	{
		return getReviewType(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewType
	 */
	public final dynamicform.proxies.Enum_ReviewType getReviewType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReviewType.toString());
		if (obj == null)
			return null;

		return dynamicform.proxies.Enum_ReviewType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReviewType
	 * @param reviewtype
	 */
	public final void setReviewType(dynamicform.proxies.Enum_ReviewType reviewtype)
	{
		setReviewType(getContext(), reviewtype);
	}

	/**
	 * Set value of ReviewType
	 * @param context
	 * @param reviewtype
	 */
	public final void setReviewType(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Enum_ReviewType reviewtype)
	{
		if (reviewtype != null)
			getMendixObject().setValue(context, MemberNames.ReviewType.toString(), reviewtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ReviewType.toString(), null);
	}

	/**
	 * Set value of NumericalScoreAsEnum
	 * @param numericalscoreasenum
	 */
	public final ugs.proxies.Enum_score getNumericalScoreAsEnum()
	{
		return getNumericalScoreAsEnum(getContext());
	}

	/**
	 * @param context
	 * @return value of NumericalScoreAsEnum
	 */
	public final ugs.proxies.Enum_score getNumericalScoreAsEnum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NumericalScoreAsEnum.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_score.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NumericalScoreAsEnum
	 * @param numericalscoreasenum
	 */
	public final void setNumericalScoreAsEnum(ugs.proxies.Enum_score numericalscoreasenum)
	{
		setNumericalScoreAsEnum(getContext(), numericalscoreasenum);
	}

	/**
	 * Set value of NumericalScoreAsEnum
	 * @param context
	 * @param numericalscoreasenum
	 */
	public final void setNumericalScoreAsEnum(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_score numericalscoreasenum)
	{
		if (numericalscoreasenum != null)
			getMendixObject().setValue(context, MemberNames.NumericalScoreAsEnum.toString(), numericalscoreasenum.toString());
		else
			getMendixObject().setValue(context, MemberNames.NumericalScoreAsEnum.toString(), null);
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
	 * @return value of ReviewedBy
	 */
	public final java.lang.String getReviewedBy()
	{
		return getReviewedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewedBy
	 */
	public final java.lang.String getReviewedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReviewedBy.toString());
	}

	/**
	 * Set value of ReviewedBy
	 * @param reviewedby
	 */
	public final void setReviewedBy(java.lang.String reviewedby)
	{
		setReviewedBy(getContext(), reviewedby);
	}

	/**
	 * Set value of ReviewedBy
	 * @param context
	 * @param reviewedby
	 */
	public final void setReviewedBy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reviewedby)
	{
		getMendixObject().setValue(context, MemberNames.ReviewedBy.toString(), reviewedby);
	}

	/**
	 * @return value of ReviewForm_GrantSystem_CurrentReviewForm
	 */
	public final ugs.proxies.GrantSystem getReviewForm_GrantSystem_CurrentReviewForm() throws com.mendix.core.CoreException
	{
		return getReviewForm_GrantSystem_CurrentReviewForm(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewForm_GrantSystem_CurrentReviewForm
	 */
	public final ugs.proxies.GrantSystem getReviewForm_GrantSystem_CurrentReviewForm(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReviewForm_GrantSystem_CurrentReviewForm.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReviewForm_GrantSystem_CurrentReviewForm
	 * @param reviewform_grantsystem_currentreviewform
	 */
	public final void setReviewForm_GrantSystem_CurrentReviewForm(ugs.proxies.GrantSystem reviewform_grantsystem_currentreviewform)
	{
		setReviewForm_GrantSystem_CurrentReviewForm(getContext(), reviewform_grantsystem_currentreviewform);
	}

	/**
	 * Set value of ReviewForm_GrantSystem_CurrentReviewForm
	 * @param context
	 * @param reviewform_grantsystem_currentreviewform
	 */
	public final void setReviewForm_GrantSystem_CurrentReviewForm(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem reviewform_grantsystem_currentreviewform)
	{
		if (reviewform_grantsystem_currentreviewform == null)
			getMendixObject().setValue(context, MemberNames.ReviewForm_GrantSystem_CurrentReviewForm.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReviewForm_GrantSystem_CurrentReviewForm.toString(), reviewform_grantsystem_currentreviewform.getMendixObject().getId());
	}

	/**
	 * @return value of ReviewForm_GrantSystem_PastReviewForms
	 */
	public final ugs.proxies.GrantSystem getReviewForm_GrantSystem_PastReviewForms() throws com.mendix.core.CoreException
	{
		return getReviewForm_GrantSystem_PastReviewForms(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewForm_GrantSystem_PastReviewForms
	 */
	public final ugs.proxies.GrantSystem getReviewForm_GrantSystem_PastReviewForms(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReviewForm_GrantSystem_PastReviewForms.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReviewForm_GrantSystem_PastReviewForms
	 * @param reviewform_grantsystem_pastreviewforms
	 */
	public final void setReviewForm_GrantSystem_PastReviewForms(ugs.proxies.GrantSystem reviewform_grantsystem_pastreviewforms)
	{
		setReviewForm_GrantSystem_PastReviewForms(getContext(), reviewform_grantsystem_pastreviewforms);
	}

	/**
	 * Set value of ReviewForm_GrantSystem_PastReviewForms
	 * @param context
	 * @param reviewform_grantsystem_pastreviewforms
	 */
	public final void setReviewForm_GrantSystem_PastReviewForms(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem reviewform_grantsystem_pastreviewforms)
	{
		if (reviewform_grantsystem_pastreviewforms == null)
			getMendixObject().setValue(context, MemberNames.ReviewForm_GrantSystem_PastReviewForms.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReviewForm_GrantSystem_PastReviewForms.toString(), reviewform_grantsystem_pastreviewforms.getMendixObject().getId());
	}

	/**
	 * @return value of ReviewForm_WorkflowRoles
	 */
	public final java.util.List<dynamicform.proxies.WorkflowRoles> getReviewForm_WorkflowRoles() throws com.mendix.core.CoreException
	{
		return getReviewForm_WorkflowRoles(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewForm_WorkflowRoles
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<dynamicform.proxies.WorkflowRoles> getReviewForm_WorkflowRoles(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<dynamicform.proxies.WorkflowRoles> result = new java.util.ArrayList<dynamicform.proxies.WorkflowRoles>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ReviewForm_WorkflowRoles.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(dynamicform.proxies.WorkflowRoles.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ReviewForm_WorkflowRoles
	 * @param reviewform_workflowroles
	 */
	public final void setReviewForm_WorkflowRoles(java.util.List<dynamicform.proxies.WorkflowRoles> reviewform_workflowroles)
	{
		setReviewForm_WorkflowRoles(getContext(), reviewform_workflowroles);
	}

	/**
	 * Set value of ReviewForm_WorkflowRoles
	 * @param context
	 * @param reviewform_workflowroles
	 */
	public final void setReviewForm_WorkflowRoles(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<dynamicform.proxies.WorkflowRoles> reviewform_workflowroles)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (dynamicform.proxies.WorkflowRoles proxyObject : reviewform_workflowroles)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ReviewForm_WorkflowRoles.toString(), identifiers);
	}

	/**
	 * @return value of ReviewForm_WorkflowRoles_Dummy
	 */
	public final dynamicform.proxies.WorkflowRoles getReviewForm_WorkflowRoles_Dummy() throws com.mendix.core.CoreException
	{
		return getReviewForm_WorkflowRoles_Dummy(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewForm_WorkflowRoles_Dummy
	 */
	public final dynamicform.proxies.WorkflowRoles getReviewForm_WorkflowRoles_Dummy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.WorkflowRoles result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReviewForm_WorkflowRoles_Dummy.toString());
		if (identifier != null)
			result = dynamicform.proxies.WorkflowRoles.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReviewForm_WorkflowRoles_Dummy
	 * @param reviewform_workflowroles_dummy
	 */
	public final void setReviewForm_WorkflowRoles_Dummy(dynamicform.proxies.WorkflowRoles reviewform_workflowroles_dummy)
	{
		setReviewForm_WorkflowRoles_Dummy(getContext(), reviewform_workflowroles_dummy);
	}

	/**
	 * Set value of ReviewForm_WorkflowRoles_Dummy
	 * @param context
	 * @param reviewform_workflowroles_dummy
	 */
	public final void setReviewForm_WorkflowRoles_Dummy(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.WorkflowRoles reviewform_workflowroles_dummy)
	{
		if (reviewform_workflowroles_dummy == null)
			getMendixObject().setValue(context, MemberNames.ReviewForm_WorkflowRoles_Dummy.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReviewForm_WorkflowRoles_Dummy.toString(), reviewform_workflowroles_dummy.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return reviewFormMendixObject;
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
			final ugs.proxies.ReviewForm that = (ugs.proxies.ReviewForm) obj;
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
		return "UGS.ReviewForm";
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
