package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.Options;


/**
 * ControlOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ControlOptions extends Options  {
	
	public enum ControlPositions{
		topleft,
		topright,
		bottomleft,
		bottomright;
	}

	public ControlOptions() {
		super();
	}
	
	public ControlOptions(ControlPositions position) {
		super();
		setPosition(position);
	}	

	public ControlOptions setPosition(ControlPositions position) {
		 return (ControlOptions)setProperty("position", position.name());
	}

}
