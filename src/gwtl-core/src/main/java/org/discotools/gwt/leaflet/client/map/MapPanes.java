package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

import com.google.gwt.user.client.Element;


public class MapPanes extends JSObjectWrapper{

	protected MapPanes(JSObject jsObject) {
		super(jsObject);
	}

	
	public Element getMapPane(){
		return getJSObject().getPropertyAsDomElement("mapPane");
	}
	
	public Element getTilePane(){
		return getJSObject().getPropertyAsDomElement("tilePane");
	}
	
	public Element getObjectsPane(){
		return getJSObject().getPropertyAsDomElement("objectsPane");
	}
	
	public Element getShadowPane(){
		return getJSObject().getPropertyAsDomElement("shadowPane");
	}
	
	public Element getOverlayPane(){
		return getJSObject().getPropertyAsDomElement("overlayPane");
	}
	
	public Element getMarkerPane(){
		return getJSObject().getPropertyAsDomElement("markerPane");
	}
	
	public Element getPopupPane(){
		return getJSObject().getPropertyAsDomElement("popupPane");
	}
}
