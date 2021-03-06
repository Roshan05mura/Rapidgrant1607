// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bizzomatetokenreplacer.proxies;

public class TokenObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tokenObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BizzomateTokenReplacer.TokenObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UUID("UUID"),
		DisplayName("DisplayName"),
		MxObjectTypeCompleteName("MxObjectTypeCompleteName"),
		MxObjectReferenceCompleteName("MxObjectReferenceCompleteName"),
		HasOneReferencedObjectOnly("HasOneReferencedObjectOnly"),
		ApplySorting("ApplySorting"),
		SortingAttributeName("SortingAttributeName"),
		Sorting("Sorting"),
		SortingAttributeDataType("SortingAttributeDataType"),
		Description("Description"),
		TokenObject_TokenReplacer_Main("BizzomateTokenReplacer.TokenObject_TokenReplacer_Main"),
		TokenObject_TokenReplacer("BizzomateTokenReplacer.TokenObject_TokenReplacer"),
		TokenObject_TopTokenObject("BizzomateTokenReplacer.TokenObject_TopTokenObject"),
		TokenObject_MxObjectType("BizzomateTokenReplacer.TokenObject_MxObjectType"),
		TokenObject_MxObjectReference("BizzomateTokenReplacer.TokenObject_MxObjectReference"),
		TokenObject_MxObjectMember_Sorting("BizzomateTokenReplacer.TokenObject_MxObjectMember_Sorting");

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

	public TokenObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BizzomateTokenReplacer.TokenObject"));
	}

	protected TokenObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tokenObjectMendixObject)
	{
		if (tokenObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BizzomateTokenReplacer.TokenObject", tokenObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BizzomateTokenReplacer.TokenObject");

		this.tokenObjectMendixObject = tokenObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TokenObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static bizzomatetokenreplacer.proxies.TokenObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bizzomatetokenreplacer.proxies.TokenObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static bizzomatetokenreplacer.proxies.TokenObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bizzomatetokenreplacer.proxies.TokenObject(context, mendixObject);
	}

	public static bizzomatetokenreplacer.proxies.TokenObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bizzomatetokenreplacer.proxies.TokenObject.initialize(context, mendixObject);
	}

	public static java.util.List<bizzomatetokenreplacer.proxies.TokenObject> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<bizzomatetokenreplacer.proxies.TokenObject> result = new java.util.ArrayList<bizzomatetokenreplacer.proxies.TokenObject>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BizzomateTokenReplacer.TokenObject" + xpathConstraint))
			result.add(bizzomatetokenreplacer.proxies.TokenObject.initialize(context, obj));
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
	 * @return value of UUID
	 */
	public final java.lang.String getUUID()
	{
		return getUUID(getContext());
	}

	/**
	 * @param context
	 * @return value of UUID
	 */
	public final java.lang.String getUUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UUID.toString());
	}

	/**
	 * Set value of UUID
	 * @param uuid
	 */
	public final void setUUID(java.lang.String uuid)
	{
		setUUID(getContext(), uuid);
	}

	/**
	 * Set value of UUID
	 * @param context
	 * @param uuid
	 */
	public final void setUUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uuid)
	{
		getMendixObject().setValue(context, MemberNames.UUID.toString(), uuid);
	}

	/**
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(java.lang.String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return value of MxObjectTypeCompleteName
	 */
	public final java.lang.String getMxObjectTypeCompleteName()
	{
		return getMxObjectTypeCompleteName(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectTypeCompleteName
	 */
	public final java.lang.String getMxObjectTypeCompleteName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MxObjectTypeCompleteName.toString());
	}

	/**
	 * Set value of MxObjectTypeCompleteName
	 * @param mxobjecttypecompletename
	 */
	public final void setMxObjectTypeCompleteName(java.lang.String mxobjecttypecompletename)
	{
		setMxObjectTypeCompleteName(getContext(), mxobjecttypecompletename);
	}

	/**
	 * Set value of MxObjectTypeCompleteName
	 * @param context
	 * @param mxobjecttypecompletename
	 */
	public final void setMxObjectTypeCompleteName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mxobjecttypecompletename)
	{
		getMendixObject().setValue(context, MemberNames.MxObjectTypeCompleteName.toString(), mxobjecttypecompletename);
	}

	/**
	 * @return value of MxObjectReferenceCompleteName
	 */
	public final java.lang.String getMxObjectReferenceCompleteName()
	{
		return getMxObjectReferenceCompleteName(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectReferenceCompleteName
	 */
	public final java.lang.String getMxObjectReferenceCompleteName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MxObjectReferenceCompleteName.toString());
	}

	/**
	 * Set value of MxObjectReferenceCompleteName
	 * @param mxobjectreferencecompletename
	 */
	public final void setMxObjectReferenceCompleteName(java.lang.String mxobjectreferencecompletename)
	{
		setMxObjectReferenceCompleteName(getContext(), mxobjectreferencecompletename);
	}

	/**
	 * Set value of MxObjectReferenceCompleteName
	 * @param context
	 * @param mxobjectreferencecompletename
	 */
	public final void setMxObjectReferenceCompleteName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mxobjectreferencecompletename)
	{
		getMendixObject().setValue(context, MemberNames.MxObjectReferenceCompleteName.toString(), mxobjectreferencecompletename);
	}

	/**
	 * @return value of HasOneReferencedObjectOnly
	 */
	public final java.lang.Boolean getHasOneReferencedObjectOnly()
	{
		return getHasOneReferencedObjectOnly(getContext());
	}

	/**
	 * @param context
	 * @return value of HasOneReferencedObjectOnly
	 */
	public final java.lang.Boolean getHasOneReferencedObjectOnly(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasOneReferencedObjectOnly.toString());
	}

	/**
	 * Set value of HasOneReferencedObjectOnly
	 * @param hasonereferencedobjectonly
	 */
	public final void setHasOneReferencedObjectOnly(java.lang.Boolean hasonereferencedobjectonly)
	{
		setHasOneReferencedObjectOnly(getContext(), hasonereferencedobjectonly);
	}

	/**
	 * Set value of HasOneReferencedObjectOnly
	 * @param context
	 * @param hasonereferencedobjectonly
	 */
	public final void setHasOneReferencedObjectOnly(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hasonereferencedobjectonly)
	{
		getMendixObject().setValue(context, MemberNames.HasOneReferencedObjectOnly.toString(), hasonereferencedobjectonly);
	}

	/**
	 * @return value of ApplySorting
	 */
	public final java.lang.Boolean getApplySorting()
	{
		return getApplySorting(getContext());
	}

	/**
	 * @param context
	 * @return value of ApplySorting
	 */
	public final java.lang.Boolean getApplySorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ApplySorting.toString());
	}

	/**
	 * Set value of ApplySorting
	 * @param applysorting
	 */
	public final void setApplySorting(java.lang.Boolean applysorting)
	{
		setApplySorting(getContext(), applysorting);
	}

	/**
	 * Set value of ApplySorting
	 * @param context
	 * @param applysorting
	 */
	public final void setApplySorting(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean applysorting)
	{
		getMendixObject().setValue(context, MemberNames.ApplySorting.toString(), applysorting);
	}

	/**
	 * @return value of SortingAttributeName
	 */
	public final java.lang.String getSortingAttributeName()
	{
		return getSortingAttributeName(getContext());
	}

	/**
	 * @param context
	 * @return value of SortingAttributeName
	 */
	public final java.lang.String getSortingAttributeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SortingAttributeName.toString());
	}

	/**
	 * Set value of SortingAttributeName
	 * @param sortingattributename
	 */
	public final void setSortingAttributeName(java.lang.String sortingattributename)
	{
		setSortingAttributeName(getContext(), sortingattributename);
	}

	/**
	 * Set value of SortingAttributeName
	 * @param context
	 * @param sortingattributename
	 */
	public final void setSortingAttributeName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sortingattributename)
	{
		getMendixObject().setValue(context, MemberNames.SortingAttributeName.toString(), sortingattributename);
	}

	/**
	 * Set value of Sorting
	 * @param sorting
	 */
	public final bizzomatetokenreplacer.proxies.Sorting getSorting()
	{
		return getSorting(getContext());
	}

	/**
	 * @param context
	 * @return value of Sorting
	 */
	public final bizzomatetokenreplacer.proxies.Sorting getSorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Sorting.toString());
		if (obj == null)
			return null;

		return bizzomatetokenreplacer.proxies.Sorting.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Sorting
	 * @param sorting
	 */
	public final void setSorting(bizzomatetokenreplacer.proxies.Sorting sorting)
	{
		setSorting(getContext(), sorting);
	}

	/**
	 * Set value of Sorting
	 * @param context
	 * @param sorting
	 */
	public final void setSorting(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.Sorting sorting)
	{
		if (sorting != null)
			getMendixObject().setValue(context, MemberNames.Sorting.toString(), sorting.toString());
		else
			getMendixObject().setValue(context, MemberNames.Sorting.toString(), null);
	}

	/**
	 * Set value of SortingAttributeDataType
	 * @param sortingattributedatatype
	 */
	public final bizzomatetokenreplacer.proxies.DataType getSortingAttributeDataType()
	{
		return getSortingAttributeDataType(getContext());
	}

	/**
	 * @param context
	 * @return value of SortingAttributeDataType
	 */
	public final bizzomatetokenreplacer.proxies.DataType getSortingAttributeDataType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SortingAttributeDataType.toString());
		if (obj == null)
			return null;

		return bizzomatetokenreplacer.proxies.DataType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SortingAttributeDataType
	 * @param sortingattributedatatype
	 */
	public final void setSortingAttributeDataType(bizzomatetokenreplacer.proxies.DataType sortingattributedatatype)
	{
		setSortingAttributeDataType(getContext(), sortingattributedatatype);
	}

	/**
	 * Set value of SortingAttributeDataType
	 * @param context
	 * @param sortingattributedatatype
	 */
	public final void setSortingAttributeDataType(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.DataType sortingattributedatatype)
	{
		if (sortingattributedatatype != null)
			getMendixObject().setValue(context, MemberNames.SortingAttributeDataType.toString(), sortingattributedatatype.toString());
		else
			getMendixObject().setValue(context, MemberNames.SortingAttributeDataType.toString(), null);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of TokenObject_TokenReplacer_Main
	 */
	public final bizzomatetokenreplacer.proxies.TokenReplacer getTokenObject_TokenReplacer_Main() throws com.mendix.core.CoreException
	{
		return getTokenObject_TokenReplacer_Main(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_TokenReplacer_Main
	 */
	public final bizzomatetokenreplacer.proxies.TokenReplacer getTokenObject_TokenReplacer_Main(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		bizzomatetokenreplacer.proxies.TokenReplacer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_TokenReplacer_Main.toString());
		if (identifier != null)
			result = bizzomatetokenreplacer.proxies.TokenReplacer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_TokenReplacer_Main
	 * @param tokenobject_tokenreplacer_main
	 */
	public final void setTokenObject_TokenReplacer_Main(bizzomatetokenreplacer.proxies.TokenReplacer tokenobject_tokenreplacer_main)
	{
		setTokenObject_TokenReplacer_Main(getContext(), tokenobject_tokenreplacer_main);
	}

	/**
	 * Set value of TokenObject_TokenReplacer_Main
	 * @param context
	 * @param tokenobject_tokenreplacer_main
	 */
	public final void setTokenObject_TokenReplacer_Main(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.TokenReplacer tokenobject_tokenreplacer_main)
	{
		if (tokenobject_tokenreplacer_main == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_TokenReplacer_Main.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_TokenReplacer_Main.toString(), tokenobject_tokenreplacer_main.getMendixObject().getId());
	}

	/**
	 * @return value of TokenObject_TokenReplacer
	 */
	public final bizzomatetokenreplacer.proxies.TokenReplacer getTokenObject_TokenReplacer() throws com.mendix.core.CoreException
	{
		return getTokenObject_TokenReplacer(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_TokenReplacer
	 */
	public final bizzomatetokenreplacer.proxies.TokenReplacer getTokenObject_TokenReplacer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		bizzomatetokenreplacer.proxies.TokenReplacer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_TokenReplacer.toString());
		if (identifier != null)
			result = bizzomatetokenreplacer.proxies.TokenReplacer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_TokenReplacer
	 * @param tokenobject_tokenreplacer
	 */
	public final void setTokenObject_TokenReplacer(bizzomatetokenreplacer.proxies.TokenReplacer tokenobject_tokenreplacer)
	{
		setTokenObject_TokenReplacer(getContext(), tokenobject_tokenreplacer);
	}

	/**
	 * Set value of TokenObject_TokenReplacer
	 * @param context
	 * @param tokenobject_tokenreplacer
	 */
	public final void setTokenObject_TokenReplacer(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.TokenReplacer tokenobject_tokenreplacer)
	{
		if (tokenobject_tokenreplacer == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_TokenReplacer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_TokenReplacer.toString(), tokenobject_tokenreplacer.getMendixObject().getId());
	}

	/**
	 * @return value of TokenObject_TopTokenObject
	 */
	public final bizzomatetokenreplacer.proxies.TokenObject getTokenObject_TopTokenObject() throws com.mendix.core.CoreException
	{
		return getTokenObject_TopTokenObject(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_TopTokenObject
	 */
	public final bizzomatetokenreplacer.proxies.TokenObject getTokenObject_TopTokenObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		bizzomatetokenreplacer.proxies.TokenObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_TopTokenObject.toString());
		if (identifier != null)
			result = bizzomatetokenreplacer.proxies.TokenObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_TopTokenObject
	 * @param tokenobject_toptokenobject
	 */
	public final void setTokenObject_TopTokenObject(bizzomatetokenreplacer.proxies.TokenObject tokenobject_toptokenobject)
	{
		setTokenObject_TopTokenObject(getContext(), tokenobject_toptokenobject);
	}

	/**
	 * Set value of TokenObject_TopTokenObject
	 * @param context
	 * @param tokenobject_toptokenobject
	 */
	public final void setTokenObject_TopTokenObject(com.mendix.systemwideinterfaces.core.IContext context, bizzomatetokenreplacer.proxies.TokenObject tokenobject_toptokenobject)
	{
		if (tokenobject_toptokenobject == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_TopTokenObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_TopTokenObject.toString(), tokenobject_toptokenobject.getMendixObject().getId());
	}

	/**
	 * @return value of TokenObject_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getTokenObject_MxObjectType() throws com.mendix.core.CoreException
	{
		return getTokenObject_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getTokenObject_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_MxObjectType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_MxObjectType
	 * @param tokenobject_mxobjecttype
	 */
	public final void setTokenObject_MxObjectType(mxmodelreflection.proxies.MxObjectType tokenobject_mxobjecttype)
	{
		setTokenObject_MxObjectType(getContext(), tokenobject_mxobjecttype);
	}

	/**
	 * Set value of TokenObject_MxObjectType
	 * @param context
	 * @param tokenobject_mxobjecttype
	 */
	public final void setTokenObject_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType tokenobject_mxobjecttype)
	{
		if (tokenobject_mxobjecttype == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectType.toString(), tokenobject_mxobjecttype.getMendixObject().getId());
	}

	/**
	 * @return value of TokenObject_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getTokenObject_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getTokenObject_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getTokenObject_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_MxObjectReference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_MxObjectReference
	 * @param tokenobject_mxobjectreference
	 */
	public final void setTokenObject_MxObjectReference(mxmodelreflection.proxies.MxObjectReference tokenobject_mxobjectreference)
	{
		setTokenObject_MxObjectReference(getContext(), tokenobject_mxobjectreference);
	}

	/**
	 * Set value of TokenObject_MxObjectReference
	 * @param context
	 * @param tokenobject_mxobjectreference
	 */
	public final void setTokenObject_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference tokenobject_mxobjectreference)
	{
		if (tokenobject_mxobjectreference == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectReference.toString(), tokenobject_mxobjectreference.getMendixObject().getId());
	}

	/**
	 * @return value of TokenObject_MxObjectMember_Sorting
	 */
	public final mxmodelreflection.proxies.MxObjectMember getTokenObject_MxObjectMember_Sorting() throws com.mendix.core.CoreException
	{
		return getTokenObject_MxObjectMember_Sorting(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenObject_MxObjectMember_Sorting
	 */
	public final mxmodelreflection.proxies.MxObjectMember getTokenObject_MxObjectMember_Sorting(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TokenObject_MxObjectMember_Sorting.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TokenObject_MxObjectMember_Sorting
	 * @param tokenobject_mxobjectmember_sorting
	 */
	public final void setTokenObject_MxObjectMember_Sorting(mxmodelreflection.proxies.MxObjectMember tokenobject_mxobjectmember_sorting)
	{
		setTokenObject_MxObjectMember_Sorting(getContext(), tokenobject_mxobjectmember_sorting);
	}

	/**
	 * Set value of TokenObject_MxObjectMember_Sorting
	 * @param context
	 * @param tokenobject_mxobjectmember_sorting
	 */
	public final void setTokenObject_MxObjectMember_Sorting(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember tokenobject_mxobjectmember_sorting)
	{
		if (tokenobject_mxobjectmember_sorting == null)
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectMember_Sorting.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TokenObject_MxObjectMember_Sorting.toString(), tokenobject_mxobjectmember_sorting.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tokenObjectMendixObject;
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
			final bizzomatetokenreplacer.proxies.TokenObject that = (bizzomatetokenreplacer.proxies.TokenObject) obj;
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
		return "BizzomateTokenReplacer.TokenObject";
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
