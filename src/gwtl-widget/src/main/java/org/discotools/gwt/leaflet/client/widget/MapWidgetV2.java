package org.discotools.gwt.leaflet.client.widget;

import java.util.HashMap;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.raster.TileLayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.map.MapOptions;
import org.discotools.gwt.leaflet.client.map.MapPaneTypes;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.user.client.ui.Widget;

public class MapWidgetV2 extends Widget {
	
	
	private java.util.Map<MapPaneTypes, PaneAbsolutePanel> panelsByPane = new HashMap<MapPaneTypes, PaneAbsolutePanel>();
	private Map map;

	public MapWidgetV2(MapOptions options) {
		DivElement div = Document.get().createDivElement();
		div.getStyle().setPosition(Position.ABSOLUTE);
		setElement(div);
		map = new Map(div, options);				
	}
	
	public MapWidgetV2(MapOptions options, String tileUrl) {
		this(options);
		map.addLayer(new TileLayer(tileUrl, new Options()));
	}
	
	public PaneAbsolutePanel getPanePanel(MapPaneTypes type){
		if(!panelsByPane.containsKey(type)){
			panelsByPane.put(type, new PaneAbsolutePanel(map.getPanes().getPane(type)));	
		}
		return panelsByPane.get(type);
	}
	
	public void clear(){
		for(PaneAbsolutePanel pane : panelsByPane.values()){
			pane.clear();
		}
	}
	
	public Map getMap(){
		return map;
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		map.invalidateSize(false);
	}
	

}
