package com.phonegap.helloworld;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class TestService extends CordovaPlugin{
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("action")){
			//get arguments
			int a = Integer.parseInt(args.getString(0));
			int b = Integer.parseInt(args.getString(0));
			if(a+b==10) callbackContext.success(); //success
			else callbackContext.error("Sum is not 10");//error callback
			return true;
		}
		return false;
	}
}
