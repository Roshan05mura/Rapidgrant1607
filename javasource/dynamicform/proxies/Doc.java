// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dynamicform.proxies;

public class Doc extends dynamicform.proxies.Element
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DynamicForm.Doc";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileTypevalidation("FileTypevalidation"),
		AllowTxt("AllowTxt"),
		AllowJpeg("AllowJpeg"),
		AllowPng("AllowPng"),
		AllowPdf("AllowPdf"),
		AllowJpg("AllowJpg"),
		ValidationMessageHelper("ValidationMessageHelper"),
		AllowDoc("AllowDoc"),
		AllowDocx("AllowDocx"),
		AllowXls("AllowXls"),
		AllowXlsx("AllowXlsx"),
		AllowPpt("AllowPpt"),
		AllowMultipleUploads("AllowMultipleUploads"),
		MaxFileSize("MaxFileSize"),
		Maximum("Maximum"),
		Minimum("Minimum"),
		NameoftheAttribute("NameoftheAttribute"),
		Required("Required"),
		LayoutNo("LayoutNo"),
		LayoutType("LayoutType"),
		Validation("Validation"),
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

	public Doc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DynamicForm.Doc"));
	}

	protected Doc(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject docMendixObject)
	{
		super(context, docMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DynamicForm.Doc", docMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DynamicForm.Doc");
	}

	/**
	 * @deprecated Use 'Doc.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dynamicform.proxies.Doc initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dynamicform.proxies.Doc.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static dynamicform.proxies.Doc initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dynamicform.proxies.Doc(context, mendixObject);
	}

	public static dynamicform.proxies.Doc load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dynamicform.proxies.Doc.initialize(context, mendixObject);
	}

	public static java.util.List<dynamicform.proxies.Doc> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<dynamicform.proxies.Doc> result = new java.util.ArrayList<dynamicform.proxies.Doc>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DynamicForm.Doc" + xpathConstraint))
			result.add(dynamicform.proxies.Doc.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FileTypevalidation
	 */
	public final java.lang.Boolean getFileTypevalidation()
	{
		return getFileTypevalidation(getContext());
	}

	/**
	 * @param context
	 * @return value of FileTypevalidation
	 */
	public final java.lang.Boolean getFileTypevalidation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FileTypevalidation.toString());
	}

	/**
	 * Set value of FileTypevalidation
	 * @param filetypevalidation
	 */
	public final void setFileTypevalidation(java.lang.Boolean filetypevalidation)
	{
		setFileTypevalidation(getContext(), filetypevalidation);
	}

	/**
	 * Set value of FileTypevalidation
	 * @param context
	 * @param filetypevalidation
	 */
	public final void setFileTypevalidation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean filetypevalidation)
	{
		getMendixObject().setValue(context, MemberNames.FileTypevalidation.toString(), filetypevalidation);
	}

	/**
	 * @return value of AllowTxt
	 */
	public final java.lang.Boolean getAllowTxt()
	{
		return getAllowTxt(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowTxt
	 */
	public final java.lang.Boolean getAllowTxt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowTxt.toString());
	}

	/**
	 * Set value of AllowTxt
	 * @param allowtxt
	 */
	public final void setAllowTxt(java.lang.Boolean allowtxt)
	{
		setAllowTxt(getContext(), allowtxt);
	}

	/**
	 * Set value of AllowTxt
	 * @param context
	 * @param allowtxt
	 */
	public final void setAllowTxt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowtxt)
	{
		getMendixObject().setValue(context, MemberNames.AllowTxt.toString(), allowtxt);
	}

	/**
	 * @return value of AllowJpeg
	 */
	public final java.lang.Boolean getAllowJpeg()
	{
		return getAllowJpeg(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowJpeg
	 */
	public final java.lang.Boolean getAllowJpeg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowJpeg.toString());
	}

	/**
	 * Set value of AllowJpeg
	 * @param allowjpeg
	 */
	public final void setAllowJpeg(java.lang.Boolean allowjpeg)
	{
		setAllowJpeg(getContext(), allowjpeg);
	}

	/**
	 * Set value of AllowJpeg
	 * @param context
	 * @param allowjpeg
	 */
	public final void setAllowJpeg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowjpeg)
	{
		getMendixObject().setValue(context, MemberNames.AllowJpeg.toString(), allowjpeg);
	}

	/**
	 * @return value of AllowPng
	 */
	public final java.lang.Boolean getAllowPng()
	{
		return getAllowPng(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowPng
	 */
	public final java.lang.Boolean getAllowPng(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowPng.toString());
	}

	/**
	 * Set value of AllowPng
	 * @param allowpng
	 */
	public final void setAllowPng(java.lang.Boolean allowpng)
	{
		setAllowPng(getContext(), allowpng);
	}

	/**
	 * Set value of AllowPng
	 * @param context
	 * @param allowpng
	 */
	public final void setAllowPng(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowpng)
	{
		getMendixObject().setValue(context, MemberNames.AllowPng.toString(), allowpng);
	}

	/**
	 * @return value of AllowPdf
	 */
	public final java.lang.Boolean getAllowPdf()
	{
		return getAllowPdf(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowPdf
	 */
	public final java.lang.Boolean getAllowPdf(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowPdf.toString());
	}

	/**
	 * Set value of AllowPdf
	 * @param allowpdf
	 */
	public final void setAllowPdf(java.lang.Boolean allowpdf)
	{
		setAllowPdf(getContext(), allowpdf);
	}

	/**
	 * Set value of AllowPdf
	 * @param context
	 * @param allowpdf
	 */
	public final void setAllowPdf(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowpdf)
	{
		getMendixObject().setValue(context, MemberNames.AllowPdf.toString(), allowpdf);
	}

	/**
	 * @return value of AllowJpg
	 */
	public final java.lang.Boolean getAllowJpg()
	{
		return getAllowJpg(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowJpg
	 */
	public final java.lang.Boolean getAllowJpg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowJpg.toString());
	}

	/**
	 * Set value of AllowJpg
	 * @param allowjpg
	 */
	public final void setAllowJpg(java.lang.Boolean allowjpg)
	{
		setAllowJpg(getContext(), allowjpg);
	}

	/**
	 * Set value of AllowJpg
	 * @param context
	 * @param allowjpg
	 */
	public final void setAllowJpg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowjpg)
	{
		getMendixObject().setValue(context, MemberNames.AllowJpg.toString(), allowjpg);
	}

	/**
	 * @return value of ValidationMessageHelper
	 */
	public final java.lang.String getValidationMessageHelper()
	{
		return getValidationMessageHelper(getContext());
	}

	/**
	 * @param context
	 * @return value of ValidationMessageHelper
	 */
	public final java.lang.String getValidationMessageHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ValidationMessageHelper.toString());
	}

	/**
	 * Set value of ValidationMessageHelper
	 * @param validationmessagehelper
	 */
	public final void setValidationMessageHelper(java.lang.String validationmessagehelper)
	{
		setValidationMessageHelper(getContext(), validationmessagehelper);
	}

	/**
	 * Set value of ValidationMessageHelper
	 * @param context
	 * @param validationmessagehelper
	 */
	public final void setValidationMessageHelper(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String validationmessagehelper)
	{
		getMendixObject().setValue(context, MemberNames.ValidationMessageHelper.toString(), validationmessagehelper);
	}

	/**
	 * @return value of AllowDoc
	 */
	public final java.lang.Boolean getAllowDoc()
	{
		return getAllowDoc(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowDoc
	 */
	public final java.lang.Boolean getAllowDoc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowDoc.toString());
	}

	/**
	 * Set value of AllowDoc
	 * @param allowdoc
	 */
	public final void setAllowDoc(java.lang.Boolean allowdoc)
	{
		setAllowDoc(getContext(), allowdoc);
	}

	/**
	 * Set value of AllowDoc
	 * @param context
	 * @param allowdoc
	 */
	public final void setAllowDoc(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowdoc)
	{
		getMendixObject().setValue(context, MemberNames.AllowDoc.toString(), allowdoc);
	}

	/**
	 * @return value of AllowDocx
	 */
	public final java.lang.Boolean getAllowDocx()
	{
		return getAllowDocx(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowDocx
	 */
	public final java.lang.Boolean getAllowDocx(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowDocx.toString());
	}

	/**
	 * Set value of AllowDocx
	 * @param allowdocx
	 */
	public final void setAllowDocx(java.lang.Boolean allowdocx)
	{
		setAllowDocx(getContext(), allowdocx);
	}

	/**
	 * Set value of AllowDocx
	 * @param context
	 * @param allowdocx
	 */
	public final void setAllowDocx(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowdocx)
	{
		getMendixObject().setValue(context, MemberNames.AllowDocx.toString(), allowdocx);
	}

	/**
	 * @return value of AllowXls
	 */
	public final java.lang.Boolean getAllowXls()
	{
		return getAllowXls(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowXls
	 */
	public final java.lang.Boolean getAllowXls(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowXls.toString());
	}

	/**
	 * Set value of AllowXls
	 * @param allowxls
	 */
	public final void setAllowXls(java.lang.Boolean allowxls)
	{
		setAllowXls(getContext(), allowxls);
	}

	/**
	 * Set value of AllowXls
	 * @param context
	 * @param allowxls
	 */
	public final void setAllowXls(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowxls)
	{
		getMendixObject().setValue(context, MemberNames.AllowXls.toString(), allowxls);
	}

	/**
	 * @return value of AllowXlsx
	 */
	public final java.lang.Boolean getAllowXlsx()
	{
		return getAllowXlsx(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowXlsx
	 */
	public final java.lang.Boolean getAllowXlsx(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowXlsx.toString());
	}

	/**
	 * Set value of AllowXlsx
	 * @param allowxlsx
	 */
	public final void setAllowXlsx(java.lang.Boolean allowxlsx)
	{
		setAllowXlsx(getContext(), allowxlsx);
	}

	/**
	 * Set value of AllowXlsx
	 * @param context
	 * @param allowxlsx
	 */
	public final void setAllowXlsx(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowxlsx)
	{
		getMendixObject().setValue(context, MemberNames.AllowXlsx.toString(), allowxlsx);
	}

	/**
	 * @return value of AllowPpt
	 */
	public final java.lang.Boolean getAllowPpt()
	{
		return getAllowPpt(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowPpt
	 */
	public final java.lang.Boolean getAllowPpt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowPpt.toString());
	}

	/**
	 * Set value of AllowPpt
	 * @param allowppt
	 */
	public final void setAllowPpt(java.lang.Boolean allowppt)
	{
		setAllowPpt(getContext(), allowppt);
	}

	/**
	 * Set value of AllowPpt
	 * @param context
	 * @param allowppt
	 */
	public final void setAllowPpt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowppt)
	{
		getMendixObject().setValue(context, MemberNames.AllowPpt.toString(), allowppt);
	}

	/**
	 * @return value of AllowMultipleUploads
	 */
	public final java.lang.Boolean getAllowMultipleUploads()
	{
		return getAllowMultipleUploads(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowMultipleUploads
	 */
	public final java.lang.Boolean getAllowMultipleUploads(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowMultipleUploads.toString());
	}

	/**
	 * Set value of AllowMultipleUploads
	 * @param allowmultipleuploads
	 */
	public final void setAllowMultipleUploads(java.lang.Boolean allowmultipleuploads)
	{
		setAllowMultipleUploads(getContext(), allowmultipleuploads);
	}

	/**
	 * Set value of AllowMultipleUploads
	 * @param context
	 * @param allowmultipleuploads
	 */
	public final void setAllowMultipleUploads(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowmultipleuploads)
	{
		getMendixObject().setValue(context, MemberNames.AllowMultipleUploads.toString(), allowmultipleuploads);
	}

	/**
	 * @return value of MaxFileSize
	 */
	public final java.lang.Integer getMaxFileSize()
	{
		return getMaxFileSize(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxFileSize
	 */
	public final java.lang.Integer getMaxFileSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxFileSize.toString());
	}

	/**
	 * Set value of MaxFileSize
	 * @param maxfilesize
	 */
	public final void setMaxFileSize(java.lang.Integer maxfilesize)
	{
		setMaxFileSize(getContext(), maxfilesize);
	}

	/**
	 * Set value of MaxFileSize
	 * @param context
	 * @param maxfilesize
	 */
	public final void setMaxFileSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxfilesize)
	{
		getMendixObject().setValue(context, MemberNames.MaxFileSize.toString(), maxfilesize);
	}

	/**
	 * @return value of Maximum
	 */
	public final java.lang.Integer getMaximum()
	{
		return getMaximum(getContext());
	}

	/**
	 * @param context
	 * @return value of Maximum
	 */
	public final java.lang.Integer getMaximum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Maximum.toString());
	}

	/**
	 * Set value of Maximum
	 * @param maximum
	 */
	public final void setMaximum(java.lang.Integer maximum)
	{
		setMaximum(getContext(), maximum);
	}

	/**
	 * Set value of Maximum
	 * @param context
	 * @param maximum
	 */
	public final void setMaximum(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maximum)
	{
		getMendixObject().setValue(context, MemberNames.Maximum.toString(), maximum);
	}

	/**
	 * @return value of Minimum
	 */
	public final java.lang.Integer getMinimum()
	{
		return getMinimum(getContext());
	}

	/**
	 * @param context
	 * @return value of Minimum
	 */
	public final java.lang.Integer getMinimum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Minimum.toString());
	}

	/**
	 * Set value of Minimum
	 * @param minimum
	 */
	public final void setMinimum(java.lang.Integer minimum)
	{
		setMinimum(getContext(), minimum);
	}

	/**
	 * Set value of Minimum
	 * @param context
	 * @param minimum
	 */
	public final void setMinimum(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer minimum)
	{
		getMendixObject().setValue(context, MemberNames.Minimum.toString(), minimum);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final dynamicform.proxies.Doc that = (dynamicform.proxies.Doc) obj;
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
		return "DynamicForm.Doc";
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
