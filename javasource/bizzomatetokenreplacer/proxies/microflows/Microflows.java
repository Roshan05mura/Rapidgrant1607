// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bizzomatetokenreplacer.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the BizzomateTokenReplacer module
	public static void aCT_CancelToken(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_CancelToken").withParams(params).execute(context);
	}
	public static void aCT_CancelTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_CancelTokenObject").withParams(params).execute(context);
	}
	public static void aCT_DeleteToken(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_DeleteToken").withParams(params).execute(context);
	}
	public static void aCT_DeleteTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_DeleteTokenObject").withParams(params).execute(context);
	}
	public static void aCT_NewContentParser(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_NewContentParser").withParams(params).execute(context);
	}
	public static void aCT_NewToken(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_NewToken").withParams(params).execute(context);
	}
	public static void aCT_NewTokenObject_FromTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject_Top)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject_Top", _tokenObject_Top == null ? null : _tokenObject_Top.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_NewTokenObject_FromTokenObject").withParams(params).execute(context);
	}
	public static void aCT_NewTokenObject_FromTokenReplacer(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_NewTokenObject_FromTokenReplacer").withParams(params).execute(context);
	}
	public static void aCT_NewTokenReplacer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("BizzomateTokenReplacer.ACT_NewTokenReplacer").withParams(params).execute(context);
	}
	public static void aCT_SaveContentParser(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_SaveContentParser").withParams(params).execute(context);
	}
	public static void aCT_SaveNewTokenReplacer_OpenEdit(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_SaveNewTokenReplacer_OpenEdit").withParams(params).execute(context);
	}
	public static void aCT_SaveToken(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_SaveToken").withParams(params).execute(context);
	}
	public static void aCT_SaveTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_SaveTokenObject").withParams(params).execute(context);
	}
	public static void aCT_SaveTokenReplacer(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_SaveTokenReplacer").withParams(params).execute(context);
	}
	public static void aCT_TokenReplacer_Delete(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_TokenReplacer_Delete").withParams(params).execute(context);
	}
	public static void aCT_TokenReplacer_Export(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_TokenReplacer_Export").withParams(params).execute(context);
	}
	public static void aCT_TokenReplacerFile_Import(IContext context, bizzomatetokenreplacer.proxies.TokenReplacerFile _tokenReplacerFile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacerFile", _tokenReplacerFile == null ? null : _tokenReplacerFile.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ACT_TokenReplacerFile_Import").withParams(params).execute(context);
	}
	public static bizzomatetokenreplacer.proxies.ContentParser contentParser_Create(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.ContentParser_Create").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.ContentParser.initialize(context, result);
	}
	public static void contentParser_Save(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ContentParser_Save").withParams(params).execute(context);
	}
	public static void contentParser_SetUUID(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.ContentParser_SetUUID").withParams(params).execute(context);
	}
	public static boolean contentParser_Validate(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("BizzomateTokenReplacer.ContentParser_Validate").withParams(params).execute(context);
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> dS_GetContentParserMxObjectEnumValueList(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("BizzomateTokenReplacer.DS_GetContentParserMxObjectEnumValueList").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectType> dS_GetTokenObjectMxObjectType(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("BizzomateTokenReplacer.DS_GetTokenObjectMxObjectType").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> dS_GetTokenObjectMxReferenceList(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("BizzomateTokenReplacer.DS_GetTokenObjectMxReferenceList").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static bizzomatetokenreplacer.proxies.DataType getDataTypeFromPrimitiveType(IContext context, mxmodelreflection.proxies.PrimitiveTypes _primitiveType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PrimitiveType", _primitiveType == null ? null : _primitiveType.name());
		java.lang.String result = (java.lang.String) Core.microflowCall("BizzomateTokenReplacer.GetDataTypeFromPrimitiveType").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.DataType.valueOf(result);
	}
	public static void logNode_Initialize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("BizzomateTokenReplacer.LogNode_Initialize").withParams(params).execute(context);
	}
	public static mxmodelreflection.proxies.MxObjectEnumValue mxObjectMember_Find(IContext context, bizzomatetokenreplacer.proxies.ContentParser _contentParser, java.lang.String _name)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContentParser", _contentParser == null ? null : _contentParser.getMendixObject());
		params.put("Name", _name);
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.MxObjectMember_Find").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, result);
	}
	public static void oCH_RefreshTokenObject_CheckObjectReferenceCardinality(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_RefreshTokenObject_CheckObjectReferenceCardinality").withParams(params).execute(context);
	}
	public static void oCH_RefreshTokenObject_ResetObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_RefreshTokenObject_ResetObject").withParams(params).execute(context);
	}
	public static void oCH_RefreshTokenObject_ResetReferenceAndObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_RefreshTokenObject_ResetReferenceAndObject").withParams(params).execute(context);
	}
	public static void oCH_SetTokenValues_MxObjectMember(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_SetTokenValues_MxObjectMember").withParams(params).execute(context);
	}
	public static void oCH_SetTokenValues_ParserMethod(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_SetTokenValues_ParserMethod").withParams(params).execute(context);
	}
	public static void oCH_SetTokenValues_Token(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_SetTokenValues_Token").withParams(params).execute(context);
	}
	public static void oCH_ValidateFreeDateFormat(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.OCH_ValidateFreeDateFormat").withParams(params).execute(context);
	}
	public static bizzomatetokenreplacer.proxies.Token token_Create(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.Token_Create").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.Token.initialize(context, result);
	}
	public static bizzomatetokenreplacer.proxies.Token token_GetCreate(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject, java.lang.String _attributeName, java.lang.String _tokenName)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		params.put("AttributeName", _attributeName);
		params.put("TokenName", _tokenName);
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.Token_GetCreate").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.Token.initialize(context, result);
	}
	public static void token_Save(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.Token_Save").withParams(params).execute(context);
	}
	public static void token_SetUUID(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.Token_SetUUID").withParams(params).execute(context);
	}
	public static boolean token_Validate(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("BizzomateTokenReplacer.Token_Validate").withParams(params).execute(context);
	}
	public static boolean token_Validate_DateType(IContext context, bizzomatetokenreplacer.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("BizzomateTokenReplacer.Token_Validate_DateType").withParams(params).execute(context);
	}
	public static void tokenObject_CheckCardinality(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenObject_CheckCardinality").withParams(params).execute(context);
	}
	public static bizzomatetokenreplacer.proxies.TokenObject tokenObject_Create(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_Create").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenObject.initialize(context, result);
	}
	public static mxmodelreflection.proxies.MxObjectType tokenObject_FindMxObjectType(IContext context, boolean _retryModule, boolean _retryMxObjectType, java.lang.String _moduleName, java.lang.String _objectTypeName)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("RetryModule", _retryModule);
		params.put("RetryMxObjectType", _retryMxObjectType);
		params.put("ModuleName", _moduleName);
		params.put("ObjectTypeName", _objectTypeName);
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_FindMxObjectType").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectType.initialize(context, result);
	}
	public static bizzomatetokenreplacer.proxies.TokenObject tokenObject_FindTopTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		params.put("UUID", _uUID);
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_FindTopTokenObject").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenObject.initialize(context, result);
	}
	public static bizzomatetokenreplacer.proxies.TokenObject tokenObject_GetCreate_Start(IContext context, java.lang.String _tokenReplacerTitle, java.lang.String _tokenReplacerDescription, java.lang.String _moduleName, java.lang.String _objectTypeName)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacerTitle", _tokenReplacerTitle);
		params.put("TokenReplacerDescription", _tokenReplacerDescription);
		params.put("ModuleName", _moduleName);
		params.put("ObjectTypeName", _objectTypeName);
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_GetCreate_Start").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenObject.initialize(context, result);
	}
	public static bizzomatetokenreplacer.proxies.TokenObject tokenObject_GetCreate_Sub(IContext context, java.lang.String _mxObjectTypeCompleteName, java.lang.String _mxReferenceCompleteName, bizzomatetokenreplacer.proxies.TokenObject _tokenObject_Top)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectTypeCompleteName", _mxObjectTypeCompleteName);
		params.put("MxReferenceCompleteName", _mxReferenceCompleteName);
		params.put("TokenObject_Top", _tokenObject_Top == null ? null : _tokenObject_Top.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_GetCreate_Sub").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenObject.initialize(context, result);
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> tokenObject_GetPossibleMxObjectReferenceList(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("BizzomateTokenReplacer.TokenObject_GetPossibleMxObjectReferenceList").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<mxmodelreflection.proxies.MxObjectType> tokenObject_GetPossibleMxObjectTypeList(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("BizzomateTokenReplacer.TokenObject_GetPossibleMxObjectTypeList").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, obj));
		}
		return result;
	}
	public static bizzomatetokenreplacer.proxies.TokenObject tokenObject_GetTopTokenObject(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenObject_GetTopTokenObject").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenObject.initialize(context, result);
	}
	public static void tokenObject_Save(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenObject_Save").withParams(params).execute(context);
	}
	public static void tokenObject_SetUUIDs(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenObject_SetUUIDs").withParams(params).execute(context);
	}
	public static boolean tokenObject_Validate(IContext context, bizzomatetokenreplacer.proxies.TokenObject _tokenObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenObject", _tokenObject == null ? null : _tokenObject.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("BizzomateTokenReplacer.TokenObject_Validate").withParams(params).execute(context);
	}
	public static bizzomatetokenreplacer.proxies.TokenReplacer tokenReplacer_Create(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("BizzomateTokenReplacer.TokenReplacer_Create").withParams(params).execute(context);
		return result == null ? null : bizzomatetokenreplacer.proxies.TokenReplacer.initialize(context, result);
	}
	public static void tokenReplacer_Delete(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenReplacer_Delete").withParams(params).execute(context);
	}
	public static void tokenReplacer_Save(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenReplacer_Save").withParams(params).execute(context);
	}
	public static void tokenReplacer_SetUUIDs(IContext context, bizzomatetokenreplacer.proxies.TokenReplacer _tokenReplacer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacer", _tokenReplacer == null ? null : _tokenReplacer.getMendixObject());
		Core.microflowCall("BizzomateTokenReplacer.TokenReplacer_SetUUIDs").withParams(params).execute(context);
	}
	public static boolean tokenReplacerFile_Import(IContext context, bizzomatetokenreplacer.proxies.TokenReplacerFile _tokenReplacerFile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenReplacerFile", _tokenReplacerFile == null ? null : _tokenReplacerFile.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("BizzomateTokenReplacer.TokenReplacerFile_Import").withParams(params).execute(context);
	}
}