package com.dokuwiki.xmlrpc;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public class XmlrpcAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";
	
	public XmlrpcAppInfo(TiApplication app) {
		TiProperties properties = app.getAppProperties();
					
		properties.setString("ti.deploytype", "development");
		properties.setBool("ti.android.loadfromsdcard", true);
	}
	
	public String getId() {
		return "com.dokuwiki.xmlrpc";
	}
	
	public String getName() {
		return "XMLRPC";
	}
	
	public String getVersion() {
		return "1.0";
	}
	
	public String getPublisher() {
		return "not specified";
	}
	
	public String getUrl() {
		return "not specified";
	}
	
	public String getCopyright() {
		return "not specified";
	}
	
	public String getDescription() {
		return "not specified";
	}
	
	public String getIcon() {
		return "appicon.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "2c104bc6-e360-4f3d-9c20-557bbc0ab4d2";
	}
}
