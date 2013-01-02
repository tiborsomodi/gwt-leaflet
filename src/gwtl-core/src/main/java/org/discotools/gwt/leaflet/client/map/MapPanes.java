package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

import com.google.gwt.user.client.Element;


public class MapPanes extends JSObjectWrapper{

	protected MapPanes(JSObject jsObject) {
		super(jsObject);
	}

	public Element getOverlayPane(){
		return getJSObject().getPropertyAsDomElement("overlayPane");
	}
}
