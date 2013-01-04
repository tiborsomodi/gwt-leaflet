package org.discotools.gwt.leaflet.client.widget;

import org.discotools.gwt.leaflet.client.events.Event;
import org.discotools.gwt.leaflet.client.events.handler.EventHandler;
import org.discotools.gwt.leaflet.client.events.handler.EventHandler.Events;
import org.discotools.gwt.leaflet.client.events.handler.EventHandlerManager;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.map.MapPaneTypes;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.Point;

import com.google.gwt.user.client.ui.IsWidget;

public class CustomOverlay {

	protected IsWidget widget;
	protected Map map;
	protected LatLng latLng;
	
	public CustomOverlay() {
	}
	
	protected void init(IsWidget widget, Map map){
		this.widget = widget;
		this.map = map;


		EventHandlerManager.addEventHandler(map, Events.zoomstart, new EventHandler<Event>(){

			@Override
			public void handle(Event event) {
				CustomOverlay.this.widget.asWidget().removeFromParent();
			}
			
		});
		
		EventHandlerManager.addEventHandler(map, Events.zoomend, new EventHandler<Event>(){

			@Override
			public void handle(Event event) {
				refresh();
			}
			
		});
	}
	
	public void draw(LatLng latLng){
		this.latLng = latLng;
		refresh();
	}
	
	private void refresh(){
		widget.asWidget().removeFromParent();
		if (latLng != null){
			PaneAbsolutePanel panel = new PaneAbsolutePanel(map.getPanes().getPane(MapPaneTypes.overlayPane));
			Point pos = map.latLngToLayerPoint(latLng);
			panel.add(widget.asWidget(), new Double(pos.x()).intValue(), new Double(pos.y()).intValue());
		}
		
	}
	
}
