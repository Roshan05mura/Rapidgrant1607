// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public class Multi_LevelHistory_DataGrid extends system.proxies.Paging
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UGS.Multi_LevelHistory_DataGrid";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PageNumber("PageNumber"),
		IsSortable("IsSortable"),
		SortAttribute("SortAttribute"),
		SortAscending("SortAscending"),
		HasMoreData("HasMoreData");

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

	public Multi_LevelHistory_DataGrid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UGS.Multi_LevelHistory_DataGrid"));
	}

	protected Multi_LevelHistory_DataGrid(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject multi_LevelHistory_DataGridMendixObject)
	{
		super(context, multi_LevelHistory_DataGridMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("UGS.Multi_LevelHistory_DataGrid", multi_LevelHistory_DataGridMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UGS.Multi_LevelHistory_DataGrid");
	}

	/**
	 * @deprecated Use 'Multi_LevelHistory_DataGrid.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ugs.proxies.Multi_LevelHistory_DataGrid initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ugs.proxies.Multi_LevelHistory_DataGrid.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ugs.proxies.Multi_LevelHistory_DataGrid initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ugs.proxies.Multi_LevelHistory_DataGrid(context, mendixObject);
	}

	public static ugs.proxies.Multi_LevelHistory_DataGrid load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ugs.proxies.Multi_LevelHistory_DataGrid.initialize(context, mendixObject);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final ugs.proxies.Multi_LevelHistory_DataGrid that = (ugs.proxies.Multi_LevelHistory_DataGrid) obj;
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
		return "UGS.Multi_LevelHistory_DataGrid";
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
