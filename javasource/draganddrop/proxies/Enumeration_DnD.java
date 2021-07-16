// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package draganddrop.proxies;

public class Enumeration_DnD
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject enumeration_DnDMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DragAndDrop.Enumeration_DnD";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Enumeration_DnD_Enumeration_Drag("DragAndDrop.Enumeration_DnD_Enumeration_Drag"),
		Enumeration_DnD_Enumeration_Drop("DragAndDrop.Enumeration_DnD_Enumeration_Drop"),
		Enumeration_DnD_String_Dragged("DragAndDrop.Enumeration_DnD_String_Dragged"),
		Enumeration_DnD_DateAndTime_Dragged("DragAndDrop.Enumeration_DnD_DateAndTime_Dragged"),
		Enumeration_DnD_Number_Dragged("DragAndDrop.Enumeration_DnD_Number_Dragged"),
		Enumeration_DnD_Decimal_Dragged("DragAndDrop.Enumeration_DnD_Decimal_Dragged"),
		Enumeration_DnD_Boolean_Dragged("DragAndDrop.Enumeration_DnD_Boolean_Dragged"),
		Enumeration_DnD_Doc_Dragged("DragAndDrop.Enumeration_DnD_Doc_Dragged");

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

	public Enumeration_DnD(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DragAndDrop.Enumeration_DnD"));
	}

	protected Enumeration_DnD(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject enumeration_DnDMendixObject)
	{
		if (enumeration_DnDMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DragAndDrop.Enumeration_DnD", enumeration_DnDMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DragAndDrop.Enumeration_DnD");

		this.enumeration_DnDMendixObject = enumeration_DnDMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Enumeration_DnD.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static draganddrop.proxies.Enumeration_DnD initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return draganddrop.proxies.Enumeration_DnD.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static draganddrop.proxies.Enumeration_DnD initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new draganddrop.proxies.Enumeration_DnD(context, mendixObject);
	}

	public static draganddrop.proxies.Enumeration_DnD load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return draganddrop.proxies.Enumeration_DnD.initialize(context, mendixObject);
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
	 * @return value of Enumeration_DnD_Enumeration_Drag
	 */
	public final dynamicform.proxies.Enumeration getEnumeration_DnD_Enumeration_Drag() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Enumeration_Drag(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Enumeration_Drag
	 */
	public final dynamicform.proxies.Enumeration getEnumeration_DnD_Enumeration_Drag(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Enumeration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Enumeration_Drag.toString());
		if (identifier != null)
			result = dynamicform.proxies.Enumeration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Enumeration_Drag
	 * @param enumeration_dnd_enumeration_drag
	 */
	public final void setEnumeration_DnD_Enumeration_Drag(dynamicform.proxies.Enumeration enumeration_dnd_enumeration_drag)
	{
		setEnumeration_DnD_Enumeration_Drag(getContext(), enumeration_dnd_enumeration_drag);
	}

	/**
	 * Set value of Enumeration_DnD_Enumeration_Drag
	 * @param context
	 * @param enumeration_dnd_enumeration_drag
	 */
	public final void setEnumeration_DnD_Enumeration_Drag(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Enumeration enumeration_dnd_enumeration_drag)
	{
		if (enumeration_dnd_enumeration_drag == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Enumeration_Drag.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Enumeration_Drag.toString(), enumeration_dnd_enumeration_drag.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_Enumeration_Drop
	 */
	public final dynamicform.proxies.Enumeration getEnumeration_DnD_Enumeration_Drop() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Enumeration_Drop(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Enumeration_Drop
	 */
	public final dynamicform.proxies.Enumeration getEnumeration_DnD_Enumeration_Drop(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Enumeration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Enumeration_Drop.toString());
		if (identifier != null)
			result = dynamicform.proxies.Enumeration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Enumeration_Drop
	 * @param enumeration_dnd_enumeration_drop
	 */
	public final void setEnumeration_DnD_Enumeration_Drop(dynamicform.proxies.Enumeration enumeration_dnd_enumeration_drop)
	{
		setEnumeration_DnD_Enumeration_Drop(getContext(), enumeration_dnd_enumeration_drop);
	}

	/**
	 * Set value of Enumeration_DnD_Enumeration_Drop
	 * @param context
	 * @param enumeration_dnd_enumeration_drop
	 */
	public final void setEnumeration_DnD_Enumeration_Drop(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Enumeration enumeration_dnd_enumeration_drop)
	{
		if (enumeration_dnd_enumeration_drop == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Enumeration_Drop.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Enumeration_Drop.toString(), enumeration_dnd_enumeration_drop.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_String_Dragged
	 */
	public final dynamicform.proxies.String getEnumeration_DnD_String_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_String_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_String_Dragged
	 */
	public final dynamicform.proxies.String getEnumeration_DnD_String_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.String result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_String_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.String.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_String_Dragged
	 * @param enumeration_dnd_string_dragged
	 */
	public final void setEnumeration_DnD_String_Dragged(dynamicform.proxies.String enumeration_dnd_string_dragged)
	{
		setEnumeration_DnD_String_Dragged(getContext(), enumeration_dnd_string_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_String_Dragged
	 * @param context
	 * @param enumeration_dnd_string_dragged
	 */
	public final void setEnumeration_DnD_String_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.String enumeration_dnd_string_dragged)
	{
		if (enumeration_dnd_string_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_String_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_String_Dragged.toString(), enumeration_dnd_string_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_DateAndTime_Dragged
	 */
	public final dynamicform.proxies.DateAndTime getEnumeration_DnD_DateAndTime_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_DateAndTime_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_DateAndTime_Dragged
	 */
	public final dynamicform.proxies.DateAndTime getEnumeration_DnD_DateAndTime_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.DateAndTime result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_DateAndTime_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.DateAndTime.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_DateAndTime_Dragged
	 * @param enumeration_dnd_dateandtime_dragged
	 */
	public final void setEnumeration_DnD_DateAndTime_Dragged(dynamicform.proxies.DateAndTime enumeration_dnd_dateandtime_dragged)
	{
		setEnumeration_DnD_DateAndTime_Dragged(getContext(), enumeration_dnd_dateandtime_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_DateAndTime_Dragged
	 * @param context
	 * @param enumeration_dnd_dateandtime_dragged
	 */
	public final void setEnumeration_DnD_DateAndTime_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.DateAndTime enumeration_dnd_dateandtime_dragged)
	{
		if (enumeration_dnd_dateandtime_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_DateAndTime_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_DateAndTime_Dragged.toString(), enumeration_dnd_dateandtime_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_Number_Dragged
	 */
	public final dynamicform.proxies.Number getEnumeration_DnD_Number_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Number_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Number_Dragged
	 */
	public final dynamicform.proxies.Number getEnumeration_DnD_Number_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Number result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Number_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Number.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Number_Dragged
	 * @param enumeration_dnd_number_dragged
	 */
	public final void setEnumeration_DnD_Number_Dragged(dynamicform.proxies.Number enumeration_dnd_number_dragged)
	{
		setEnumeration_DnD_Number_Dragged(getContext(), enumeration_dnd_number_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_Number_Dragged
	 * @param context
	 * @param enumeration_dnd_number_dragged
	 */
	public final void setEnumeration_DnD_Number_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Number enumeration_dnd_number_dragged)
	{
		if (enumeration_dnd_number_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Number_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Number_Dragged.toString(), enumeration_dnd_number_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_Decimal_Dragged
	 */
	public final dynamicform.proxies.Decimal getEnumeration_DnD_Decimal_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Decimal_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Decimal_Dragged
	 */
	public final dynamicform.proxies.Decimal getEnumeration_DnD_Decimal_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Decimal result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Decimal_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Decimal.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Decimal_Dragged
	 * @param enumeration_dnd_decimal_dragged
	 */
	public final void setEnumeration_DnD_Decimal_Dragged(dynamicform.proxies.Decimal enumeration_dnd_decimal_dragged)
	{
		setEnumeration_DnD_Decimal_Dragged(getContext(), enumeration_dnd_decimal_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_Decimal_Dragged
	 * @param context
	 * @param enumeration_dnd_decimal_dragged
	 */
	public final void setEnumeration_DnD_Decimal_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Decimal enumeration_dnd_decimal_dragged)
	{
		if (enumeration_dnd_decimal_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Decimal_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Decimal_Dragged.toString(), enumeration_dnd_decimal_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_Boolean_Dragged
	 */
	public final dynamicform.proxies.Boolean_ getEnumeration_DnD_Boolean_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Boolean_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Boolean_Dragged
	 */
	public final dynamicform.proxies.Boolean_ getEnumeration_DnD_Boolean_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Boolean_ result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Boolean_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Boolean_.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Boolean_Dragged
	 * @param enumeration_dnd_boolean_dragged
	 */
	public final void setEnumeration_DnD_Boolean_Dragged(dynamicform.proxies.Boolean_ enumeration_dnd_boolean_dragged)
	{
		setEnumeration_DnD_Boolean_Dragged(getContext(), enumeration_dnd_boolean_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_Boolean_Dragged
	 * @param context
	 * @param enumeration_dnd_boolean_dragged
	 */
	public final void setEnumeration_DnD_Boolean_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Boolean_ enumeration_dnd_boolean_dragged)
	{
		if (enumeration_dnd_boolean_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Boolean_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Boolean_Dragged.toString(), enumeration_dnd_boolean_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of Enumeration_DnD_Doc_Dragged
	 */
	public final dynamicform.proxies.Doc getEnumeration_DnD_Doc_Dragged() throws com.mendix.core.CoreException
	{
		return getEnumeration_DnD_Doc_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of Enumeration_DnD_Doc_Dragged
	 */
	public final dynamicform.proxies.Doc getEnumeration_DnD_Doc_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Doc result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Enumeration_DnD_Doc_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Doc.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Enumeration_DnD_Doc_Dragged
	 * @param enumeration_dnd_doc_dragged
	 */
	public final void setEnumeration_DnD_Doc_Dragged(dynamicform.proxies.Doc enumeration_dnd_doc_dragged)
	{
		setEnumeration_DnD_Doc_Dragged(getContext(), enumeration_dnd_doc_dragged);
	}

	/**
	 * Set value of Enumeration_DnD_Doc_Dragged
	 * @param context
	 * @param enumeration_dnd_doc_dragged
	 */
	public final void setEnumeration_DnD_Doc_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Doc enumeration_dnd_doc_dragged)
	{
		if (enumeration_dnd_doc_dragged == null)
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Doc_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Enumeration_DnD_Doc_Dragged.toString(), enumeration_dnd_doc_dragged.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return enumeration_DnDMendixObject;
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
			final draganddrop.proxies.Enumeration_DnD that = (draganddrop.proxies.Enumeration_DnD) obj;
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
		return "DragAndDrop.Enumeration_DnD";
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