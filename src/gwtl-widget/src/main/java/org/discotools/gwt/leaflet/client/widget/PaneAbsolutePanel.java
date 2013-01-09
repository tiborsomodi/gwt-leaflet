package org.discotools.gwt.leaflet.client.widget;


import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class PaneAbsolutePanel extends AbsolutePanel {

	public PaneAbsolutePanel(Element element) {
		super(element);
		getElement().getStyle().setPosition(Position.RELATIVE);
		onAttach();
	}
	
}
