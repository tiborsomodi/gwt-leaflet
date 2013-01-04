package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.GwtlTestCase;
import org.discotools.gwt.leaflet.client.controls.ControlOptions.ControlPositions;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class ControlGwtlTest extends GwtlTestCase {
	
	public void testControl() {
		logTest("testControl","\""+Position.BOTTOM_LEFT+"\" }");
		Control c = new Control(new ControlOptions(ControlPositions.bottomleft));
		c.setPosition(Position.BOTTOM_RIGHT);
		assertEquals(Position.BOTTOM_RIGHT,c.getPosition());
	}
	
}
