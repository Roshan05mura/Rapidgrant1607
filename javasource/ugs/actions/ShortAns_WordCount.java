// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ugs.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class ShortAns_WordCount extends CustomJavaAction<java.lang.Long>
{
	private IMendixObject __WordCount;
	private dynamicform.proxies.ShortAnswer WordCount;

	public ShortAns_WordCount(IContext context, IMendixObject WordCount)
	{
		super(context);
		this.__WordCount = WordCount;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		this.WordCount = __WordCount == null ? null : dynamicform.proxies.ShortAnswer.initialize(getContext(), __WordCount);

		// BEGIN USER CODE
		String string=this.WordCount.getShortAns_Value(this.getContext());
		long count=0;
		char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count ;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ShortAns_WordCount";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}