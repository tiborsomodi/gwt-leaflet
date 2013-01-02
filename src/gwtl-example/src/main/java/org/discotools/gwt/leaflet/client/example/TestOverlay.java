package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.widget.CustomOverlay;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class TestOverlay extends CustomOverlay {

	private FlowPanel panel = new FlowPanel();
	private Label move = new Label("move overlay");
	private Label changeText = new Label("change text");
	
	public TestOverlay(Map map) {
		init(panel, map);
		panel.add(move);
		panel.add(changeText);
		
		move.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				draw(new LatLng(latLng.lat() + 1, latLng.lng() + 1));
			}
		});
		changeText.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				changeText.setText("This text is changed");
			}
		});
	}
}
