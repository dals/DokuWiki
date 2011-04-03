package com.dokuwiki.xmlrpc;

import org.appcelerator.titanium.TiApplication;

public class XmlrpcApplication extends TiApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new XmlrpcAppInfo(this);
	}
}
