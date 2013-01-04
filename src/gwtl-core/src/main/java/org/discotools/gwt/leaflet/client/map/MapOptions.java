package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.types.LatLng;

/**
 * MapOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class MapOptions extends Options  {


	public MapOptions() {
		super();
	}
	
	public MapOptions setCenter(LatLng latlng) {
        return (MapOptions)setProperty("center", latlng);
    }

	public MapOptions setZoom(int zoom) {
		return (MapOptions)setProperty("zoom", zoom);
    }

	public MapOptions setMinZoom(int zoom) {
		return (MapOptions)setProperty("minzoom", zoom);
    }

	public MapOptions setMaxZoom(int zoom) {
		return (MapOptions)setProperty("maxzoom", zoom);
    }
	
	public MapOptions setShowZoomControl(boolean showZoomControl) {
		return (MapOptions)setProperty("zoomControl", showZoomControl);
    }
	
	public MapOptions setShowAttributionControl(boolean showAttributionControl) {
		return (MapOptions)setProperty("attributionControl", showAttributionControl);
    }
}
