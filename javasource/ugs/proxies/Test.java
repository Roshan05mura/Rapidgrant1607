// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Test
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Test";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Cutoff("Cutoff"),
		Score("Score"),
		Main("Main"),
		Remarks("Remarks"),
		Test_GrantSystem_assigned("UGS.Test_GrantSystem_assigned"),
		Test_Activity("UGS.Test_Activity"),
		Test_GrantSystem_Dummy("UGS.Test_GrantSystem_Dummy");

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

	public Test(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Test"));
	}

	protected Test(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testMendixObject)
	{
		if (testMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UGS.Test", testMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Test");

		this.testMendixObject = testMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Test.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Test initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Test.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Test initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Test(context, mendixObject);
	}

	public static ugs.proxies.Test load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Test.initialize(context, mendixObject);
	}

	public static java.util.List<ugs.proxies.Test> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ugs.proxies.Test> result = new java.util.ArrayList<ugs.proxies.Test>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UGS.Test" + xpathConstraint))
			result.add(ugs.proxies.Test.initialize(context, obj));
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Cutoff
	 */
	public final java.lang.Integer getCutoff()
	{
		return getCutoff(getContext());
	}

	/**
	 * @param context
	 * @return value of Cutoff
	 */
	public final java.lang.Integer getCutoff(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Cutoff.toString());
	}

	/**
	 * Set value of Cutoff
	 * @param cutoff
	 */
	public final void setCutoff(java.lang.Integer cutoff)
	{
		setCutoff(getContext(), cutoff);
	}

	/**
	 * Set value of Cutoff
	 * @param context
	 * @param cutoff
	 */
	public final void setCutoff(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer cutoff)
	{
		getMendixObject().setValue(context, MemberNames.Cutoff.toString(), cutoff);
	}

	/**
	 * @return value of Score
	 */
	public final java.lang.String getScore()
	{
		return getScore(getContext());
	}

	/**
	 * @param context
	 * @return value of Score
	 */
	public final java.lang.String getScore(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Score.toString());
	}

	/**
	 * Set value of Score
	 * @param score
	 */
	public final void setScore(java.lang.String score)
	{
		setScore(getContext(), score);
	}

	/**
	 * Set value of Score
	 * @param context
	 * @param score
	 */
	public final void setScore(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String score)
	{
		getMendixObject().setValue(context, MemberNames.Score.toString(), score);
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
	 * @return value of Test_GrantSystem_assigned
	 */
	public final ugs.proxies.GrantSystem getTest_GrantSystem_assigned() throws com.mendix.core.CoreException
	{
		return getTest_GrantSystem_assigned(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_GrantSystem_assigned
	 */
	public final ugs.proxies.GrantSystem getTest_GrantSystem_assigned(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_GrantSystem_assigned.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_GrantSystem_assigned
	 * @param test_grantsystem_assigned
	 */
	public final void setTest_GrantSystem_assigned(ugs.proxies.GrantSystem test_grantsystem_assigned)
	{
		setTest_GrantSystem_assigned(getContext(), test_grantsystem_assigned);
	}

	/**
	 * Set value of Test_GrantSystem_assigned
	 * @param context
	 * @param test_grantsystem_assigned
	 */
	public final void setTest_GrantSystem_assigned(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem test_grantsystem_assigned)
	{
		if (test_grantsystem_assigned == null)
			getMendixObject().setValue(context, MemberNames.Test_GrantSystem_assigned.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_GrantSystem_assigned.toString(), test_grantsystem_assigned.getMendixObject().getId());
	}

	/**
	 * @return value of Test_Activity
	 */
	public final ugs.proxies.Activity getTest_Activity() throws com.mendix.core.CoreException
	{
		return getTest_Activity(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_Activity
	 */
	public final ugs.proxies.Activity getTest_Activity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.Activity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_Activity.toString());
		if (identifier != null)
			result = ugs.proxies.Activity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_Activity
	 * @param test_activity
	 */
	public final void setTest_Activity(ugs.proxies.Activity test_activity)
	{
		setTest_Activity(getContext(), test_activity);
	}

	/**
	 * Set value of Test_Activity
	 * @param context
	 * @param test_activity
	 */
	public final void setTest_Activity(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.Activity test_activity)
	{
		if (test_activity == null)
			getMendixObject().setValue(context, MemberNames.Test_Activity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_Activity.toString(), test_activity.getMendixObject().getId());
	}

	/**
	 * @return value of Test_GrantSystem_Dummy
	 */
	public final ugs.proxies.GrantSystem getTest_GrantSystem_Dummy() throws com.mendix.core.CoreException
	{
		return getTest_GrantSystem_Dummy(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_GrantSystem_Dummy
	 */
	public final ugs.proxies.GrantSystem getTest_GrantSystem_Dummy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_GrantSystem_Dummy.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_GrantSystem_Dummy
	 * @param test_grantsystem_dummy
	 */
	public final void setTest_GrantSystem_Dummy(ugs.proxies.GrantSystem test_grantsystem_dummy)
	{
		setTest_GrantSystem_Dummy(getContext(), test_grantsystem_dummy);
	}

	/**
	 * Set value of Test_GrantSystem_Dummy
	 * @param context
	 * @param test_grantsystem_dummy
	 */
	public final void setTest_GrantSystem_Dummy(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem test_grantsystem_dummy)
	{
		if (test_grantsystem_dummy == null)
			getMendixObject().setValue(context, MemberNames.Test_GrantSystem_Dummy.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_GrantSystem_Dummy.toString(), test_grantsystem_dummy.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testMendixObject;
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
			final ugs.proxies.Test that = (ugs.proxies.Test) obj;
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
		return "UGS.Test";
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
