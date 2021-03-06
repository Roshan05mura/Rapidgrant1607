// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dynamicform.proxies;

public class Intermediate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject intermediateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DynamicForm.Intermediate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Field_Name("Field_Name"),
		Value("Value"),
		Intermediate_Template("DynamicForm.Intermediate_Template"),
		Intermediate_GrantSystem("DynamicForm.Intermediate_GrantSystem"),
		Token_Intermediate("BizzomateTokenReplacer.Token_Intermediate");

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

	public Intermediate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DynamicForm.Intermediate"));
	}

	protected Intermediate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject intermediateMendixObject)
	{
		if (intermediateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DynamicForm.Intermediate", intermediateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DynamicForm.Intermediate");

		this.intermediateMendixObject = intermediateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Intermediate.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dynamicform.proxies.Intermediate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dynamicform.proxies.Intermediate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static dynamicform.proxies.Intermediate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dynamicform.proxies.Intermediate(context, mendixObject);
	}

	public static dynamicform.proxies.Intermediate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dynamicform.proxies.Intermediate.initialize(context, mendixObject);
	}

	public static java.util.List<dynamicform.proxies.Intermediate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<dynamicform.proxies.Intermediate> result = new java.util.ArrayList<dynamicform.proxies.Intermediate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DynamicForm.Intermediate" + xpathConstraint))
			result.add(dynamicform.proxies.Intermediate.initialize(context, obj));
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
	 * @return value of Field_Name
	 */
	public final java.lang.String getField_Name()
	{
		return getField_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_Name
	 */
	public final java.lang.String getField_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Field_Name.toString());
	}

	/**
	 * Set value of Field_Name
	 * @param field_name
	 */
	public final void setField_Name(java.lang.String field_name)
	{
		setField_Name(getContext(), field_name);
	}

	/**
	 * Set value of Field_Name
	 * @param context
	 * @param field_name
	 */
	public final void setField_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String field_name)
	{
		getMendixObject().setValue(context, MemberNames.Field_Name.toString(), field_name);
	}

	/**
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of Intermediate_Template
	 */
	public final dynamicform.proxies.Template getIntermediate_Template() throws com.mendix.core.CoreException
	{
		return getIntermediate_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Intermediate_Template
	 */
	public final dynamicform.proxies.Template getIntermediate_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Intermediate_Template.toString());
		if (identifier != null)
			result = dynamicform.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Intermediate_Template
	 * @param intermediate_template
	 */
	public final void setIntermediate_Template(dynamicform.proxies.Template intermediate_template)
	{
		setIntermediate_Template(getContext(), intermediate_template);
	}

	/**
	 * Set value of Intermediate_Template
	 * @param context
	 * @param intermediate_template
	 */
	public final void setIntermediate_Template(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Template intermediate_template)
	{
		if (intermediate_template == null)
			getMendixObject().setValue(context, MemberNames.Intermediate_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Intermediate_Template.toString(), intermediate_template.getMendixObject().getId());
	}

	/**
	 * @return value of Intermediate_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getIntermediate_GrantSystem() throws com.mendix.core.CoreException
	{
		return getIntermediate_GrantSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of Intermediate_GrantSystem
	 */
	public final ugs.proxies.GrantSystem getIntermediate_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ugs.proxies.GrantSystem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Intermediate_GrantSystem.toString());
		if (identifier != null)
			result = ugs.proxies.GrantSystem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Intermediate_GrantSystem
	 * @param intermediate_grantsystem
	 */
	public final void setIntermediate_GrantSystem(ugs.proxies.GrantSystem intermediate_grantsystem)
	{
		setIntermediate_GrantSystem(getContext(), intermediate_grantsystem);
	}

	/**
	 * Set value of Intermediate_GrantSystem
	 * @param context
	 * @param intermediate_grantsystem
	 */
	public final void setIntermediate_GrantSystem(com.mendix.systemwideinterfaces.core.IContext context, ugs.proxies.GrantSystem intermediate_grantsystem)
	{
		if (intermediate_grantsystem == null)
			getMendixObject().setValue(context, MemberNames.Intermediate_GrantSystem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Intermediate_GrantSystem.toString(), intermediate_grantsystem.getMendixObject().getId());
	}

	/**
	 * @return value of Token_Intermediate
	 */
	public final bizzomatetokenreplacer.proxies.Token getToken_Intermediate() throws com.mendix.core.CoreException
	{
		return getToken_Intermediate(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_Intermediate
	 */
	public final bizzomatetokenreplacer.proxies.Token getToken_Intermediate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		bizzomatetokenreplacer.proxies.Token result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_Intermediate.toString());
		if (identifier != null)
			result = bizzomatetokenreplacer.proxies.Token.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Token_Intermediate
	 * @param token_intermediate
	 */
	public final void setToken_Intermediate(bizzomatetokenreplacer.proxies.Token token_intermediate)
	{
		setToken_Intermediate(getContext(), token_intermediate);
	}

	/**
	 * Set value of Token_Intermediate
	 * @param context
	 * @param token_intermediate
	 */
	public final void setToken_Intermediate(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.Token token_intermediate)
	{
		if (token_intermediate == null)
			getMendixObject().setValue(context, MemberNames.Token_Intermediate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Token_Intermediate.toString(), token_intermediate.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return intermediateMendixObject;
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
			final dynamicform.proxies.Intermediate that = (dynamicform.proxies.Intermediate) obj;
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
		return "DynamicForm.Intermediate";
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
