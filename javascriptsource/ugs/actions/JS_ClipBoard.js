// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {string} token
 * @returns {Promise.<void>}
 */
export async function JS_ClipBoard(token) {
	// BEGIN USER CODE
 function dv(){
var copyText = document.getElementById("test");
   copyText.value = token;
  copyText.select();
  copyText.setSelectionRange(0, 99999)
  document.execCommand("copy");
 }  

dv();

let timeout = document.getElementById('testt');
   timeout.style.display = 'block' ;
           setTimeout(hideElement, 3000) //milliseconds until timeout//
      

 function hideElement() {
                timeout.style.display = 'none' ;
                              }


	// END USER CODE
}