package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.raster.TileLayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.map.MapOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.widget.MapWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class CustomOverlayTest implements EntryPoint {
	
	private Map map;
	private LatLng latLng = new LatLng(46.6, 18.8);

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("gwt-Body");
		
		MapWidget mapWidget = new MapWidget("map");
		rootPanel.add(mapWidget);
		mapWidget.setHeight("");
		mapWidget.setStyleName("gwt-Map");

		MapOptions loptions = new MapOptions();
		loptions.setCenter(latLng);
		loptions.setZoom(13);

	 	map = new Map("map", loptions);

	 	
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";
		TileLayer tile = new TileLayer(url, new Options());
		map.addLayer(tile);
		
		TestOverlay overlay = new TestOverlay(map);
		overlay.draw(latLng);
		
		
		

	}

}
