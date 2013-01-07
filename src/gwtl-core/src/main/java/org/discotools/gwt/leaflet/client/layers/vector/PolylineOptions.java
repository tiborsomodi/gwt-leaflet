package org.discotools.gwt.leaflet.client.layers.vector;

/**
 * 
 * @author David Ignjic
 *
 */
public class PolylineOptions extends PathOptions {

	public PolylineOptions(String color, int weight, double opacity) {
		setColor(color);
		setOpacity(opacity);
		setWeight(weight);
	}
    public PathOptions setEditable(boolean  editable) {
        return (PathOptions)setProperty("editable", editable);
    }
}
