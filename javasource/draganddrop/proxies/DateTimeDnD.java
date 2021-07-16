// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package draganddrop.proxies;

public class DateTimeDnD
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dateTimeDnDMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DragAndDrop.DateTimeDnD";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		dateTimeDnD_Drag("DragAndDrop.dateTimeDnD_Drag"),
		dateTimeDnD_Drop("DragAndDrop.dateTimeDnD_Drop"),
		DateTimeDnD_String_Dragged("DragAndDrop.DateTimeDnD_String_Dragged"),
		DateTimeDnD_Number_Dragged("DragAndDrop.DateTimeDnD_Number_Dragged"),
		DateTimeDnD_Decimal_Dragged("DragAndDrop.DateTimeDnD_Decimal_Dragged"),
		DateTimeDnD_Boolean_Dragged("DragAndDrop.DateTimeDnD_Boolean_Dragged"),
		DateTimeDnD_Doc_Dragged("DragAndDrop.DateTimeDnD_Doc_Dragged");

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

	public DateTimeDnD(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DragAndDrop.DateTimeDnD"));
	}

	protected DateTimeDnD(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dateTimeDnDMendixObject)
	{
		if (dateTimeDnDMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DragAndDrop.DateTimeDnD", dateTimeDnDMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DragAndDrop.DateTimeDnD");

		this.dateTimeDnDMendixObject = dateTimeDnDMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DateTimeDnD.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static draganddrop.proxies.DateTimeDnD initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return draganddrop.proxies.DateTimeDnD.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static draganddrop.proxies.DateTimeDnD initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new draganddrop.proxies.DateTimeDnD(context, mendixObject);
	}

	public static draganddrop.proxies.DateTimeDnD load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return draganddrop.proxies.DateTimeDnD.initialize(context, mendixObject);
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
	 * @return value of dateTimeDnD_Drag
	 */
	public final dynamicform.proxies.DateAndTime getdateTimeDnD_Drag() throws com.mendix.core.CoreException
	{
		return getdateTimeDnD_Drag(getContext());
	}

	/**
	 * @param context
	 * @return value of dateTimeDnD_Drag
	 */
	public final dynamicform.proxies.DateAndTime getdateTimeDnD_Drag(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.DateAndTime result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.dateTimeDnD_Drag.toString());
		if (identifier != null)
			result = dynamicform.proxies.DateAndTime.load(context, identifier);
		return result;
	}

	/**
	 * Set value of dateTimeDnD_Drag
	 * @param datetimednd_drag
	 */
	public final void setdateTimeDnD_Drag(dynamicform.proxies.DateAndTime datetimednd_drag)
	{
		setdateTimeDnD_Drag(getContext(), datetimednd_drag);
	}

	/**
	 * Set value of dateTimeDnD_Drag
	 * @param context
	 * @param datetimednd_drag
	 */
	public final void setdateTimeDnD_Drag(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.DateAndTime datetimednd_drag)
	{
		if (datetimednd_drag == null)
			getMendixObject().setValue(context, MemberNames.dateTimeDnD_Drag.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.dateTimeDnD_Drag.toString(), datetimednd_drag.getMendixObject().getId());
	}

	/**
	 * @return value of dateTimeDnD_Drop
	 */
	public final dynamicform.proxies.DateAndTime getdateTimeDnD_Drop() throws com.mendix.core.CoreException
	{
		return getdateTimeDnD_Drop(getContext());
	}

	/**
	 * @param context
	 * @return value of dateTimeDnD_Drop
	 */
	public final dynamicform.proxies.DateAndTime getdateTimeDnD_Drop(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.DateAndTime result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.dateTimeDnD_Drop.toString());
		if (identifier != null)
			result = dynamicform.proxies.DateAndTime.load(context, identifier);
		return result;
	}

	/**
	 * Set value of dateTimeDnD_Drop
	 * @param datetimednd_drop
	 */
	public final void setdateTimeDnD_Drop(dynamicform.proxies.DateAndTime datetimednd_drop)
	{
		setdateTimeDnD_Drop(getContext(), datetimednd_drop);
	}

	/**
	 * Set value of dateTimeDnD_Drop
	 * @param context
	 * @param datetimednd_drop
	 */
	public final void setdateTimeDnD_Drop(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.DateAndTime datetimednd_drop)
	{
		if (datetimednd_drop == null)
			getMendixObject().setValue(context, MemberNames.dateTimeDnD_Drop.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.dateTimeDnD_Drop.toString(), datetimednd_drop.getMendixObject().getId());
	}

	/**
	 * @return value of DateTimeDnD_String_Dragged
	 */
	public final dynamicform.proxies.String getDateTimeDnD_String_Dragged() throws com.mendix.core.CoreException
	{
		return getDateTimeDnD_String_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeDnD_String_Dragged
	 */
	public final dynamicform.proxies.String getDateTimeDnD_String_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.String result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DateTimeDnD_String_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.String.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DateTimeDnD_String_Dragged
	 * @param datetimednd_string_dragged
	 */
	public final void setDateTimeDnD_String_Dragged(dynamicform.proxies.String datetimednd_string_dragged)
	{
		setDateTimeDnD_String_Dragged(getContext(), datetimednd_string_dragged);
	}

	/**
	 * Set value of DateTimeDnD_String_Dragged
	 * @param context
	 * @param datetimednd_string_dragged
	 */
	public final void setDateTimeDnD_String_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.String datetimednd_string_dragged)
	{
		if (datetimednd_string_dragged == null)
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_String_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_String_Dragged.toString(), datetimednd_string_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DateTimeDnD_Number_Dragged
	 */
	public final dynamicform.proxies.Number getDateTimeDnD_Number_Dragged() throws com.mendix.core.CoreException
	{
		return getDateTimeDnD_Number_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeDnD_Number_Dragged
	 */
	public final dynamicform.proxies.Number getDateTimeDnD_Number_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Number result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DateTimeDnD_Number_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Number.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DateTimeDnD_Number_Dragged
	 * @param datetimednd_number_dragged
	 */
	public final void setDateTimeDnD_Number_Dragged(dynamicform.proxies.Number datetimednd_number_dragged)
	{
		setDateTimeDnD_Number_Dragged(getContext(), datetimednd_number_dragged);
	}

	/**
	 * Set value of DateTimeDnD_Number_Dragged
	 * @param context
	 * @param datetimednd_number_dragged
	 */
	public final void setDateTimeDnD_Number_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Number datetimednd_number_dragged)
	{
		if (datetimednd_number_dragged == null)
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Number_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Number_Dragged.toString(), datetimednd_number_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DateTimeDnD_Decimal_Dragged
	 */
	public final dynamicform.proxies.Decimal getDateTimeDnD_Decimal_Dragged() throws com.mendix.core.CoreException
	{
		return getDateTimeDnD_Decimal_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeDnD_Decimal_Dragged
	 */
	public final dynamicform.proxies.Decimal getDateTimeDnD_Decimal_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Decimal result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DateTimeDnD_Decimal_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Decimal.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DateTimeDnD_Decimal_Dragged
	 * @param datetimednd_decimal_dragged
	 */
	public final void setDateTimeDnD_Decimal_Dragged(dynamicform.proxies.Decimal datetimednd_decimal_dragged)
	{
		setDateTimeDnD_Decimal_Dragged(getContext(), datetimednd_decimal_dragged);
	}

	/**
	 * Set value of DateTimeDnD_Decimal_Dragged
	 * @param context
	 * @param datetimednd_decimal_dragged
	 */
	public final void setDateTimeDnD_Decimal_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Decimal datetimednd_decimal_dragged)
	{
		if (datetimednd_decimal_dragged == null)
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Decimal_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Decimal_Dragged.toString(), datetimednd_decimal_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DateTimeDnD_Boolean_Dragged
	 */
	public final dynamicform.proxies.Boolean_ getDateTimeDnD_Boolean_Dragged() throws com.mendix.core.CoreException
	{
		return getDateTimeDnD_Boolean_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeDnD_Boolean_Dragged
	 */
	public final dynamicform.proxies.Boolean_ getDateTimeDnD_Boolean_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Boolean_ result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DateTimeDnD_Boolean_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Boolean_.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DateTimeDnD_Boolean_Dragged
	 * @param datetimednd_boolean_dragged
	 */
	public final void setDateTimeDnD_Boolean_Dragged(dynamicform.proxies.Boolean_ datetimednd_boolean_dragged)
	{
		setDateTimeDnD_Boolean_Dragged(getContext(), datetimednd_boolean_dragged);
	}

	/**
	 * Set value of DateTimeDnD_Boolean_Dragged
	 * @param context
	 * @param datetimednd_boolean_dragged
	 */
	public final void setDateTimeDnD_Boolean_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Boolean_ datetimednd_boolean_dragged)
	{
		if (datetimednd_boolean_dragged == null)
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Boolean_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Boolean_Dragged.toString(), datetimednd_boolean_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DateTimeDnD_Doc_Dragged
	 */
	public final dynamicform.proxies.Doc getDateTimeDnD_Doc_Dragged() throws com.mendix.core.CoreException
	{
		return getDateTimeDnD_Doc_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeDnD_Doc_Dragged
	 */
	public final dynamicform.proxies.Doc getDateTimeDnD_Doc_Dragged(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dynamicform.proxies.Doc result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DateTimeDnD_Doc_Dragged.toString());
		if (identifier != null)
			result = dynamicform.proxies.Doc.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DateTimeDnD_Doc_Dragged
	 * @param datetimednd_doc_dragged
	 */
	public final void setDateTimeDnD_Doc_Dragged(dynamicform.proxies.Doc datetimednd_doc_dragged)
	{
		setDateTimeDnD_Doc_Dragged(getContext(), datetimednd_doc_dragged);
	}

	/**
	 * Set value of DateTimeDnD_Doc_Dragged
	 * @param context
	 * @param datetimednd_doc_dragged
	 */
	public final void setDateTimeDnD_Doc_Dragged(com.mendix.systemwideinterfaces.core.IContext context, dynamicform.proxies.Doc datetimednd_doc_dragged)
	{
		if (datetimednd_doc_dragged == null)
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Doc_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DateTimeDnD_Doc_Dragged.toString(), datetimednd_doc_dragged.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dateTimeDnDMendixObject;
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
			final draganddrop.proxies.DateTimeDnD that = (draganddrop.proxies.DateTimeDnD) obj;
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
		return "DragAndDrop.DateTimeDnD";
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
