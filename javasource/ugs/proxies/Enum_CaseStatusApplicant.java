// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public enum Enum_CaseStatusApplicant
{
	Forward_To_GM(new java.lang.String[][] { new java.lang.String[] { "en_US", "Forward To GM" } }),
	Forward_To_FA(new java.lang.String[][] { new java.lang.String[] { "en_US", "Forward To FA" } }),
	Return_To_Applicant(new java.lang.String[][] { new java.lang.String[] { "en_US", "Return To Applicant" } }),
	Return_To_GM(new java.lang.String[][] { new java.lang.String[] { "en_US", "Return To GM" } }),
	Approved_By_FA(new java.lang.String[][] { new java.lang.String[] { "en_US", "Resolved By FA" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_CaseStatusApplicant(java.lang.String[][] captionStrings)
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