package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.raster.TileLayer;
import org.discotools.gwt.leaflet.client.layers.vector.Polygon;
import org.discotools.gwt.leaflet.client.layers.vector.PolylineOptions;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.map.MapOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.widget.MapWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MapTestApp implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("gwt-Body");
		MapWidget mapWidget = new MapWidget("map");
		rootPanel.add(mapWidget);
		mapWidget.setHeight("");
		mapWidget.setStyleName("gwt-Map");

		MapOptions loptions = new MapOptions();
		loptions.setCenter(new LatLng(0, 0));
		loptions.setZoom(13);

		Map map = new Map("map", loptions);

		// Create TileLayer url template
		String url = "http://osm.inetrack.com/ineosmstyle/{z}/{x}/{y}.png";
		TileLayer tile = new TileLayer(url, new Options());
		map.addLayer(tile);
		
		LatLng[] polygonCoords = {
				new LatLng(51.51, -0.1),
				new LatLng(51.5, -0.06),
				new LatLng(51.52, -0.03)};
//		
		Polygon polygon = new Polygon(polygonCoords, new PolylineOptions("#666666", 5, 0.3));
		polygon.editing().enable();
		map.addLayer(polygon);
	}

}
