package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.GwtlTestCase;
import org.discotools.gwt.leaflet.client.controls.ControlOptions.ControlPositions;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class ControlOptionsGwtlTest extends GwtlTestCase {
	
	public void testControlOptions() {
		logTest("testControlOptions","{ position: \""+Position.BOTTOM_LEFT+"\" }");
		ControlOptions o = new ControlOptions();
		o.setPosition(ControlPositions.bottomleft);
		Control c = new Control(o);
		assertEquals(Position.BOTTOM_LEFT, c.getPosition());
	}

}
