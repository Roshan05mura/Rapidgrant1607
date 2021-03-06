// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ugs.proxies;

public enum Enum_ExternalStatus
{
	Grant_Created(new java.lang.String[][] { new java.lang.String[] { "en_US", "Grant Created" } }),
	Applicant_Applied(new java.lang.String[][] { new java.lang.String[] { "en_US", "Grant Applied By Applicant" } }),
	Test_Sent(new java.lang.String[][] { new java.lang.String[] { "en_US", "Test Sent To Applicant" } }),
	Test_Recieved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Test Results Recieved From Applicant" } }),
	Test_Reviewed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Test Reviewed" } }),
	Applicant_Reviewed_By_Interviewer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Applicant Reviewed By Interviewer" } }),
	Approved_By_Board(new java.lang.String[][] { new java.lang.String[] { "en_US", "Approved By Board" } }),
	Aggrement_Letter_Sent_To_Applicant(new java.lang.String[][] { new java.lang.String[] { "en_US", "Aggrement Letter Sent To Applicant" } }),
	Applicant_Accepted(new java.lang.String[][] { new java.lang.String[] { "en_US", "Applicant Accepted" } }),
	Initial_Screening(new java.lang.String[][] { new java.lang.String[] { "en_US", "Initial Screening" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_ExternalStatus(java.lang.String[][] captionStrings)
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
