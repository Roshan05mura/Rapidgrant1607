// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class ReviewQ
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject reviewQMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.ReviewQ";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Question("Question"),
		Answer("Answer"),
		Ans("Ans"),
		One("One"),
		two("two"),
		three("three"),
		four("four"),
		five("five"),
		Emoj("Emoj"),
		ReviewedBy("ReviewedBy"),
		ReviewQ_GrantSystem("UGS.ReviewQ_GrantSystem"),
		Review_Questions_ReviewQ("UGS.Review_Questions_ReviewQ"),
		ReviewQ_ReviewForm("UGS.ReviewQ_ReviewForm");

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

	public ReviewQ(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.ReviewQ"));
	}

	protected ReviewQ(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject reviewQMendixObject)
	{
		if (reviewQMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.ReviewQ", reviewQMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.ReviewQ");

		this.reviewQMendixObject = reviewQMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReviewQ.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.ReviewQ initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.ReviewQ.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.ReviewQ initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.ReviewQ(context, mendixObject);
	}

	public static ugs.proxies.ReviewQ load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.ReviewQ.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.ReviewQ> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.ReviewQ> result = new java.util.ArrayList<ugs.proxies.ReviewQ>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.ReviewQ" + xpathConstraint))
			result.add(ugs.proxies.ReviewQ.initialize(context, obj));
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
	 * Set value of Answer
	 * @param answer
	 */
	public final ugs.proxies.Enum_score getAnswer()
	{
		return getAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of Answer
	 */
	public final ugs.proxies.Enum_score getAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Answer.toString());
		if (obj == null)
			return null;

		return ugs.proxies.Enum_score.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Answer
	 * @param answer
	 */
	public final void setAnswer(ugs.proxies.Enum_score answer)
	{
		setAnswer(getContext(), answer);
	}

	/**
	 * Set value of Answer
	 * @param context
	 * @param answer
	 */
	public final void setAnswer(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Enum_score answer)
	{
		if (answer != null)
			getMendixObject().setValue(context, MemberNames.Answer.toString(), answer.toString());
		else
			getMendixObject().setValue(context, MemberNames.Answer.toString(), null);
	}

	/**
	 * @return value of Ans
	 */
	public final java.lang.Integer getAns()
	{
		return getAns(getContext());
	}

	/**
	 * @param context
	 * @return value of Ans
	 */
	public final java.lang.Integer getAns(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Ans.toString());
	}

	/**
	 * Set value of Ans
	 * @param ans
	 */
	public final void setAns(java.lang.Integer ans)
	{
		setAns(getContext(), ans);
	}

	/**
	 * Set value of Ans
	 * @param context
	 * @param ans
	 */
	public final void setAns(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ans)
	{
		getMendixObject().setValue(context, MemberNames.Ans.toString(), ans);
	}

	/**
	 * @return value of One
	 */
	public final java.lang.Boolean getOne()
	{
		return getOne(getContext());
	}

	/**
	 * @param context
	 * @return value of One
	 */
	public final java.lang.Boolean getOne(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.One.toString());
	}

	/**
	 * Set value of One
	 * @param one
	 */
	public final void setOne(java.lang.Boolean one)
	{
		setOne(getContext(), one);
	}

	/**
	 * Set value of One
	 * @param context
	 * @param one
	 */
	public final void setOne(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean one)
	{
		getMendixObject().setValue(context, MemberNames.One.toString(), one);
	}

	/**
	 * @return value of two
	 */
	public final java.lang.Boolean gettwo()
	{
		return gettwo(getContext());
	}

	/**
	 * @param context
	 * @return value of two
	 */
	public final java.lang.Boolean gettwo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.two.toString());
	}

	/**
	 * Set value of two
	 * @param two
	 */
	public final void settwo(java.lang.Boolean two)
	{
		settwo(getContext(), two);
	}

	/**
	 * Set value of two
	 * @param context
	 * @param two
	 */
	public final void settwo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean two)
	{
		getMendixObject().setValue(context, MemberNames.two.toString(), two);
	}

	/**
	 * @return value of three
	 */
	public final java.lang.Boolean getthree()
	{
		return getthree(getContext());
	}

	/**
	 * @param context
	 * @return value of three
	 */
	public final java.lang.Boolean getthree(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.three.toString());
	}

	/**
	 * Set value of three
	 * @param three
	 */
	public final void setthree(java.lang.Boolean three)
	{
		setthree(getContext(), three);
	}

	/**
	 * Set value of three
	 * @param context
	 * @param three
	 */
	public final void setthree(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean three)
	{
		getMendixObject().setValue(context, MemberNames.three.toString(), three);
	}

	/**
	 * @return value of four
	 */
	public final java.lang.Boolean getfour()
	{
		return getfour(getContext());
	}

	/**
	 * @param context
	 * @return value of four
	 */
	public final java.lang.Boolean getfour(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.four.toString());
	}

	/**
	 * Set value of four
	 * @param four
	 */
	public final void setfour(java.lang.Boolean four)
	{
		setfour(getContext(), four);
	}

	/**
	 * Set value of four
	 * @param context
	 * @param four
	 */
	public final void setfour(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean four)
	{
		getMendixObject().setValue(context, MemberNames.four.toString(), four);
	}

	/**
	 * @return value of five
	 */
	public final java.lang.Boolean getfive()
	{
		return getfive(getContext());
	}

	/**
	 * @param context
	 * @return value of five
	 */
	public final java.lang.Boolean getfive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.five.toString());
	}

	/**
	 * Set value of five
	 * @param five
	 */
	public final void setfive(java.lang.Boolean five)
	{
		setfive(getContext(), five);
	}

	/**
	 * Set value of five
	 * @param context
	 * @param five
	 */
	public final void setfive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean five)
	{
		getMendixObject().setValue(context, MemberNames.five.toString(), five);
	}

	/**
	 * @return value of Emoj
	 */
	public final java.lang.Integer getEmoj()
	{
		return getEmoj(getContext());
	}

	/**
	 * @param context
	 * @return value of Emoj
	 */
	public final java.lang.Integer getEmoj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Emoj.toString());
	}

	/**
	 * Set value of Emoj
	 * @param emoj
	 */
	public final void setEmoj(java.lang.Integer emoj)
	{
		setEmoj(getContext(), emoj);
	}

	/**
	 * Set value of Emoj
	 * @param context
	 * @param emoj
	 */
	public final void setEmoj(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer emoj)
	{
		getMendixObject().setValue(context, MemberNames.Emoj.toString(), emoj);
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
	 * @return value of ReviewQ_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getReviewQ_GrantSystem() throws com.mendix.core.CoreException
	{
		return getReviewQ_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewQ_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getReviewQ_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReviewQ_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReviewQ_GrantSystem
	 * @param reviewq_grantsystem
	 */
	public final void setReviewQ_GrantSystem(ugs.proxies.GrantSystem reviewq_grantsystem)
	{
		setReviewQ_GrantSystem(getContext(), reviewq_grantsystem);
	}

	/**
	 * Set value of ReviewQ_GrantSystem
	 * @param context
	 * @param reviewq_grantsystem
	 */
	public final void setReviewQ_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem reviewq_grantsystem)
	{
		if (reviewq_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.ReviewQ_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReviewQ_GrantSystem.toString(), reviewq_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return value of Review_Questions_ReviewQ
	 */
	public final ugs.proxies.Review_Questions getReview_Questions_ReviewQ() throws com.mendix.core.CoreException
	{
		return getReview_Questions_ReviewQ(getContext());
	}

	/**
	 * @param context
	 * @return value of Review_Questions_ReviewQ
	 */
	public final ugs.proxies.Review_Questions getReview_Questions_ReviewQ(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Review_Questions result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Review_Questions_ReviewQ.toString());
		if (identifier != null)
			result = ugs.proxies.Review_Questions.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Review_Questions_ReviewQ
	 * @param review_questions_reviewq
	 */
	public final void setReview_Questions_ReviewQ(ugs.proxies.Review_Questions review_questions_reviewq)
	{
		setReview_Questions_ReviewQ(getContext(), review_questions_reviewq);
	}

	/**
	 * Set value of Review_Questions_ReviewQ
	 * @param context
	 * @param review_questions_reviewq
	 */
	public final void setReview_Questions_ReviewQ(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Review_Questions review_questions_reviewq)
	{
		if (review_questions_reviewq == null)
			getMendixObject().setValue(context, MemberNames.Review_Questions_ReviewQ.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Review_Questions_ReviewQ.toString(), review_questions_reviewq.getMendixObject().getId());
	}

	/**
	 * @return value of ReviewQ_ReviewForm
	 */
	public final ugs.proxies.ReviewForm getReviewQ_ReviewForm() throws com.mendix.core.CoreException
	{
		return getReviewQ_ReviewForm(getContext());
	}

	/**
	 * @param context
	 * @return value of ReviewQ_ReviewForm
	 */
	public final ugs.proxies.ReviewForm getReviewQ_ReviewForm(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.ReviewForm result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReviewQ_ReviewForm.toString());
		if (identifier != null)
			result = ugs.proxies.ReviewForm.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReviewQ_ReviewForm
	 * @param reviewq_reviewform
	 */
	public final void setReviewQ_ReviewForm(ugs.proxies.ReviewForm reviewq_reviewform)
	{
		setReviewQ_ReviewForm(getContext(), reviewq_reviewform);
	}

	/**
	 * Set value of ReviewQ_ReviewForm
	 * @param context
	 * @param reviewq_reviewform
	 */
	public final void setReviewQ_ReviewForm(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.ReviewForm reviewq_reviewform)
	{
		if (reviewq_reviewform == null)
			getMendixObject().setValue(context, MemberNames.ReviewQ_ReviewForm.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReviewQ_ReviewForm.toString(), reviewq_reviewform.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return reviewQMendixObject;
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
			final ugs.proxies.ReviewQ that = (ugs.proxies.ReviewQ) obj;
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
		return "UGS.ReviewQ";
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