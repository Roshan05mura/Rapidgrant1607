// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dynamicform.proxies;

public class Enumeration extends dynamicform.proxies.Element
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DynamicForm.Enumeration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NameoftheAttribute("NameoftheAttribute"),
		Required("Required"),
		LayoutNo("LayoutNo"),
		LayoutType("LayoutType"),
		Validation("Validation"),
		DontUse("DynamicForm.DontUse"),
		Element_Template("DynamicForm.Element_Template");

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

	public Enumeration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DynamicForm.Enumeration"));
	}

	protected Enumeration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject enumerationMendixObject)
	{
		super(context, enumerationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DynamicForm.Enumeration", enumerationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DynamicForm.Enumeration");
	}

	/**
	 * @deprecated Use 'Enumeration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dynamicform.proxies.Enumeration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dynamicform.proxies.Enumeration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static dynamicform.proxies.Enumeration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dynamicform.proxies.Enumeration(context, mendixObject);
	}

	public static dynamicform.proxies.Enumeration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dynamicform.proxies.Enumeration.initialize(context, mendixObject);
	}

	public static java.util.List<dynamicform.proxies.Enumeration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<dynamicform.proxies.Enumeration> result = new java.util.ArrayList<dynamicform.proxies.Enumeration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DynamicForm.Enumeration" + xpathConstraint))
			result.add(dynamicform.proxies.Enumeration.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of DontUse
	 */
	public final dynamicform.proxies.Enum_Values getDontUse() throws com.mendix.core.CoreException
	{
		return getDontUse(getContext());
	}

	/**
	 * @param context
	 * @return value of DontUse
	 */
	public final dynamicform.proxies.Enum_Values getDontUse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Enum_Values result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DontUse.toString());
		if (identifier != null)
			result = dynamicform.proxies.Enum_Values.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DontUse
	 * @param dontuse
	 */
	public final void setDontUse(dynamicform.proxies.Enum_Values dontuse)
	{
		setDontUse(getContext(), dontuse);
	}

	/**
	 * Set value of DontUse
	 * @param context
	 * @param dontuse
	 */
	public final void setDontUse(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Enum_Values dontuse)
	{
		if (dontuse == null)
			getMendixObject().setValue(context, MemberNames.DontUse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DontUse.toString(), dontuse.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final dynamicform.proxies.Enumeration that = (dynamicform.proxies.Enumeration) obj;
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
		return "DynamicForm.Enumeration";
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