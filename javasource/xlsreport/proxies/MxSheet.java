// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxSheet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxSheetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxSheet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Name("Name"),
		DataUsage("DataUsage"),
		Status("Status"),
		DistinctData("DistinctData"),
		StartRow("StartRow"),
		ColumnWidthDefault("ColumnWidthDefault"),
		ColumnWidthPixels("ColumnWidthPixels"),
		RowHeightDefault("RowHeightDefault"),
		RowHeightPoint("RowHeightPoint"),
		FormLayout_GroupBy("FormLayout_GroupBy"),
		MxSheet_Template("XLSReport.MxSheet_Template"),
		MxSheet_DefaultStyle("XLSReport.MxSheet_DefaultStyle"),
		MxSheet_HeaderStyle("XLSReport.MxSheet_HeaderStyle"),
		MxSheet_RowObject("XLSReport.MxSheet_RowObject"),
		MxSheet_MxObjectReference("XLSReport.MxSheet_MxObjectReference");

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

	public MxSheet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxSheet"));
	}

	protected MxSheet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxSheetMendixObject)
	{
		if (mxSheetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxSheet", mxSheetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxSheet");

		this.mxSheetMendixObject = mxSheetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxSheet.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static xlsreport.proxies.MxSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxSheet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxSheet(context, mendixObject);
	}

	public static xlsreport.proxies.MxSheet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxSheet.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxSheet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxSheet> result = new java.util.ArrayList<xlsreport.proxies.MxSheet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxSheet" + xpathConstraint))
			result.add(xlsreport.proxies.MxSheet.initialize(context, obj));
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
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Integer sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of DataUsage
	 */
	public final java.lang.Boolean getDataUsage()
	{
		return getDataUsage(getContext());
	}

	/**
	 * @param context
	 * @return value of DataUsage
	 */
	public final java.lang.Boolean getDataUsage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DataUsage.toString());
	}

	/**
	 * Set value of DataUsage
	 * @param datausage
	 */
	public final void setDataUsage(java.lang.Boolean datausage)
	{
		setDataUsage(getContext(), datausage);
	}

	/**
	 * Set value of DataUsage
	 * @param context
	 * @param datausage
	 */
	public final void setDataUsage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean datausage)
	{
		getMendixObject().setValue(context, MemberNames.DataUsage.toString(), datausage);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final xlsreport.proxies.Yes_no getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final xlsreport.proxies.Yes_no getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.Yes_no.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(xlsreport.proxies.Yes_no status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.Yes_no status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of DistinctData
	 */
	public final java.lang.Boolean getDistinctData()
	{
		return getDistinctData(getContext());
	}

	/**
	 * @param context
	 * @return value of DistinctData
	 */
	public final java.lang.Boolean getDistinctData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DistinctData.toString());
	}

	/**
	 * Set value of DistinctData
	 * @param distinctdata
	 */
	public final void setDistinctData(java.lang.Boolean distinctdata)
	{
		setDistinctData(getContext(), distinctdata);
	}

	/**
	 * Set value of DistinctData
	 * @param context
	 * @param distinctdata
	 */
	public final void setDistinctData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean distinctdata)
	{
		getMendixObject().setValue(context, MemberNames.DistinctData.toString(), distinctdata);
	}

	/**
	 * @return value of StartRow
	 */
	public final java.lang.Integer getStartRow()
	{
		return getStartRow(getContext());
	}

	/**
	 * @param context
	 * @return value of StartRow
	 */
	public final java.lang.Integer getStartRow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.StartRow.toString());
	}

	/**
	 * Set value of StartRow
	 * @param startrow
	 */
	public final void setStartRow(java.lang.Integer startrow)
	{
		setStartRow(getContext(), startrow);
	}

	/**
	 * Set value of StartRow
	 * @param context
	 * @param startrow
	 */
	public final void setStartRow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer startrow)
	{
		getMendixObject().setValue(context, MemberNames.StartRow.toString(), startrow);
	}

	/**
	 * @return value of ColumnWidthDefault
	 */
	public final java.lang.Boolean getColumnWidthDefault()
	{
		return getColumnWidthDefault(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnWidthDefault
	 */
	public final java.lang.Boolean getColumnWidthDefault(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ColumnWidthDefault.toString());
	}

	/**
	 * Set value of ColumnWidthDefault
	 * @param columnwidthdefault
	 */
	public final void setColumnWidthDefault(java.lang.Boolean columnwidthdefault)
	{
		setColumnWidthDefault(getContext(), columnwidthdefault);
	}

	/**
	 * Set value of ColumnWidthDefault
	 * @param context
	 * @param columnwidthdefault
	 */
	public final void setColumnWidthDefault(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean columnwidthdefault)
	{
		getMendixObject().setValue(context, MemberNames.ColumnWidthDefault.toString(), columnwidthdefault);
	}

	/**
	 * @return value of ColumnWidthPixels
	 */
	public final java.lang.Integer getColumnWidthPixels()
	{
		return getColumnWidthPixels(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnWidthPixels
	 */
	public final java.lang.Integer getColumnWidthPixels(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ColumnWidthPixels.toString());
	}

	/**
	 * Set value of ColumnWidthPixels
	 * @param columnwidthpixels
	 */
	public final void setColumnWidthPixels(java.lang.Integer columnwidthpixels)
	{
		setColumnWidthPixels(getContext(), columnwidthpixels);
	}

	/**
	 * Set value of ColumnWidthPixels
	 * @param context
	 * @param columnwidthpixels
	 */
	public final void setColumnWidthPixels(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer columnwidthpixels)
	{
		getMendixObject().setValue(context, MemberNames.ColumnWidthPixels.toString(), columnwidthpixels);
	}

	/**
	 * @return value of RowHeightDefault
	 */
	public final java.lang.Boolean getRowHeightDefault()
	{
		return getRowHeightDefault(getContext());
	}

	/**
	 * @param context
	 * @return value of RowHeightDefault
	 */
	public final java.lang.Boolean getRowHeightDefault(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RowHeightDefault.toString());
	}

	/**
	 * Set value of RowHeightDefault
	 * @param rowheightdefault
	 */
	public final void setRowHeightDefault(java.lang.Boolean rowheightdefault)
	{
		setRowHeightDefault(getContext(), rowheightdefault);
	}

	/**
	 * Set value of RowHeightDefault
	 * @param context
	 * @param rowheightdefault
	 */
	public final void setRowHeightDefault(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean rowheightdefault)
	{
		getMendixObject().setValue(context, MemberNames.RowHeightDefault.toString(), rowheightdefault);
	}

	/**
	 * @return value of RowHeightPoint
	 */
	public final java.lang.Integer getRowHeightPoint()
	{
		return getRowHeightPoint(getContext());
	}

	/**
	 * @param context
	 * @return value of RowHeightPoint
	 */
	public final java.lang.Integer getRowHeightPoint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RowHeightPoint.toString());
	}

	/**
	 * Set value of RowHeightPoint
	 * @param rowheightpoint
	 */
	public final void setRowHeightPoint(java.lang.Integer rowheightpoint)
	{
		setRowHeightPoint(getContext(), rowheightpoint);
	}

	/**
	 * Set value of RowHeightPoint
	 * @param context
	 * @param rowheightpoint
	 */
	public final void setRowHeightPoint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer rowheightpoint)
	{
		getMendixObject().setValue(context, MemberNames.RowHeightPoint.toString(), rowheightpoint);
	}

	/**
	 * @return value of FormLayout_GroupBy
	 */
	public final java.lang.Boolean getFormLayout_GroupBy()
	{
		return getFormLayout_GroupBy(getContext());
	}

	/**
	 * @param context
	 * @return value of FormLayout_GroupBy
	 */
	public final java.lang.Boolean getFormLayout_GroupBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FormLayout_GroupBy.toString());
	}

	/**
	 * Set value of FormLayout_GroupBy
	 * @param formlayout_groupby
	 */
	public final void setFormLayout_GroupBy(java.lang.Boolean formlayout_groupby)
	{
		setFormLayout_GroupBy(getContext(), formlayout_groupby);
	}

	/**
	 * Set value of FormLayout_GroupBy
	 * @param context
	 * @param formlayout_groupby
	 */
	public final void setFormLayout_GroupBy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean formlayout_groupby)
	{
		getMendixObject().setValue(context, MemberNames.FormLayout_GroupBy.toString(), formlayout_groupby);
	}

	/**
	 * @return value of MxSheet_Template
	 */
	public final xlsreport.proxies.MxTemplate getMxSheet_Template() throws com.mendix.core.CoreException
	{
		return getMxSheet_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSheet_Template
	 */
	public final xlsreport.proxies.MxTemplate getMxSheet_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSheet_Template.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSheet_Template
	 * @param mxsheet_template
	 */
	public final void setMxSheet_Template(xlsreport.proxies.MxTemplate mxsheet_template)
	{
		setMxSheet_Template(getContext(), mxsheet_template);
	}

	/**
	 * Set value of MxSheet_Template
	 * @param context
	 * @param mxsheet_template
	 */
	public final void setMxSheet_Template(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxTemplate mxsheet_template)
	{
		if (mxsheet_template == null)
			getMendixObject().setValue(context, MemberNames.MxSheet_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSheet_Template.toString(), mxsheet_template.getMendixObject().getId());
	}

	/**
	 * @return value of MxSheet_DefaultStyle
	 */
	public final xlsreport.proxies.MxCellStyle getMxSheet_DefaultStyle() throws com.mendix.core.CoreException
	{
		return getMxSheet_DefaultStyle(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSheet_DefaultStyle
	 */
	public final xlsreport.proxies.MxCellStyle getMxSheet_DefaultStyle(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxCellStyle result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSheet_DefaultStyle.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxCellStyle.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSheet_DefaultStyle
	 * @param mxsheet_defaultstyle
	 */
	public final void setMxSheet_DefaultStyle(xlsreport.proxies.MxCellStyle mxsheet_defaultstyle)
	{
		setMxSheet_DefaultStyle(getContext(), mxsheet_defaultstyle);
	}

	/**
	 * Set value of MxSheet_DefaultStyle
	 * @param context
	 * @param mxsheet_defaultstyle
	 */
	public final void setMxSheet_DefaultStyle(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxCellStyle mxsheet_defaultstyle)
	{
		if (mxsheet_defaultstyle == null)
			getMendixObject().setValue(context, MemberNames.MxSheet_DefaultStyle.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSheet_DefaultStyle.toString(), mxsheet_defaultstyle.getMendixObject().getId());
	}

	/**
	 * @return value of MxSheet_HeaderStyle
	 */
	public final xlsreport.proxies.MxCellStyle getMxSheet_HeaderStyle() throws com.mendix.core.CoreException
	{
		return getMxSheet_HeaderStyle(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSheet_HeaderStyle
	 */
	public final xlsreport.proxies.MxCellStyle getMxSheet_HeaderStyle(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxCellStyle result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSheet_HeaderStyle.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxCellStyle.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSheet_HeaderStyle
	 * @param mxsheet_headerstyle
	 */
	public final void setMxSheet_HeaderStyle(xlsreport.proxies.MxCellStyle mxsheet_headerstyle)
	{
		setMxSheet_HeaderStyle(getContext(), mxsheet_headerstyle);
	}

	/**
	 * Set value of MxSheet_HeaderStyle
	 * @param context
	 * @param mxsheet_headerstyle
	 */
	public final void setMxSheet_HeaderStyle(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxCellStyle mxsheet_headerstyle)
	{
		if (mxsheet_headerstyle == null)
			getMendixObject().setValue(context, MemberNames.MxSheet_HeaderStyle.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSheet_HeaderStyle.toString(), mxsheet_headerstyle.getMendixObject().getId());
	}

	/**
	 * @return value of MxSheet_RowObject
	 */
	public final mxmodelreflection.proxies.MxObjectType getMxSheet_RowObject() throws com.mendix.core.CoreException
	{
		return getMxSheet_RowObject(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSheet_RowObject
	 */
	public final mxmodelreflection.proxies.MxObjectType getMxSheet_RowObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSheet_RowObject.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSheet_RowObject
	 * @param mxsheet_rowobject
	 */
	public final void setMxSheet_RowObject(mxmodelreflection.proxies.MxObjectType mxsheet_rowobject)
	{
		setMxSheet_RowObject(getContext(), mxsheet_rowobject);
	}

	/**
	 * Set value of MxSheet_RowObject
	 * @param context
	 * @param mxsheet_rowobject
	 */
	public final void setMxSheet_RowObject(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType mxsheet_rowobject)
	{
		if (mxsheet_rowobject == null)
			getMendixObject().setValue(context, MemberNames.MxSheet_RowObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSheet_RowObject.toString(), mxsheet_rowobject.getMendixObject().getId());
	}

	/**
	 * @return value of MxSheet_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getMxSheet_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getMxSheet_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of MxSheet_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getMxSheet_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxSheet_MxObjectReference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxSheet_MxObjectReference
	 * @param mxsheet_mxobjectreference
	 */
	public final void setMxSheet_MxObjectReference(mxmodelreflection.proxies.MxObjectReference mxsheet_mxobjectreference)
	{
		setMxSheet_MxObjectReference(getContext(), mxsheet_mxobjectreference);
	}

	/**
	 * Set value of MxSheet_MxObjectReference
	 * @param context
	 * @param mxsheet_mxobjectreference
	 */
	public final void setMxSheet_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference mxsheet_mxobjectreference)
	{
		if (mxsheet_mxobjectreference == null)
			getMendixObject().setValue(context, MemberNames.MxSheet_MxObjectReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxSheet_MxObjectReference.toString(), mxsheet_mxobjectreference.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxSheetMendixObject;
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
			final xlsreport.proxies.MxSheet that = (xlsreport.proxies.MxSheet) obj;
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
		return "XLSReport.MxSheet";
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
