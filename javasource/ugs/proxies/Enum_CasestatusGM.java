// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public enum Enum_CasestatusGM
{
	Forward_To_GM2(new java.lang.String[][] { new java.lang.String[] { "en_US", "GrantAppManger" } }),
	Forward_To_Investigating_Officer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Investigating Officer" } }),
	Forward_TO_GM_HQ_(new java.lang.String[][] { new java.lang.String[] { "en_US", "GranteeManager(HQ)" } }),
	Applicant(new java.lang.String[][] { new java.lang.String[] { "en_US", "Applicant" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_CasestatusGM(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
