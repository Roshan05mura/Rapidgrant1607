// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package imap_pop3_email.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class ConnectEmailServer extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __Emailconfiguration;
	private imap_pop3_email.proxies.EmailAccount Emailconfiguration;

	public ConnectEmailServer(IContext context, IMendixObject Emailconfiguration)
	{
		super(context);
		this.__Emailconfiguration = Emailconfiguration;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.Emailconfiguration = __Emailconfiguration == null ? null : imap_pop3_email.proxies.EmailAccount.initialize(getContext(), __Emailconfiguration);

		// BEGIN USER CODE
		
		boolean hasConnected = false;
		
		EmailHandler handler = new EmailHandler(this.Emailconfiguration, getContext());
		hasConnected = handler.isConnected();
		
		handler.closeConnection();
		
		return hasConnected;		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ConnectEmailServer";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
