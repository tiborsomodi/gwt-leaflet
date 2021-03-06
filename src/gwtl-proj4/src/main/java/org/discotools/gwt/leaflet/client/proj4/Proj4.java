package org.discotools.gwt.leaflet.client.proj4;

import org.discotools.gwt.leaflet.client.crs.CRS;
import org.discotools.gwt.leaflet.client.util.Transformation;

import com.google.gwt.core.client.GWT;

public interface Proj4 {
	
	static Proj4 INSTANCE = GWT.create(Proj4.class);

	CRS crs(String code, Transformation transition);
	
	CRS crs(String code, Transformation transition, ScaleFunction scale);
	
	CRS crs(String code, String definition, Transformation transition);
	
	CRS crs(String code, String definition, Transformation transition, ScaleFunction scale);
	
}
