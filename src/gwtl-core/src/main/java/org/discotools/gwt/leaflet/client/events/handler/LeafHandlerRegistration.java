package org.discotools.gwt.leaflet.client.events.handler;

import org.discotools.gwt.leaflet.client.events.Event;
import org.discotools.gwt.leaflet.client.events.handler.EventHandler.Events;

public class LeafHandlerRegistration {
	
	private EventRegisteredFunction eventRegisteredFunction;
	private Events events;
	private EventProvider eventProvider;
	public LeafHandlerRegistration(EventRegisteredFunction eventRegisteredFunction,
							   Events events,
							   EventProvider eventProvider) {
		super();
		this.eventRegisteredFunction = eventRegisteredFunction;
		this.events = events;
		this.eventProvider = eventProvider;
	}
	public EventRegisteredFunction getEventRegisteredFunction() {
		return eventRegisteredFunction;
	}
	public void setEventRegisteredFunction(
			EventRegisteredFunction eventRegisteredFunction) {
		this.eventRegisteredFunction = eventRegisteredFunction;
	}
	public Events getEvents() {
		return events;
	}
	public void setEvents(Events events) {
		this.events = events;
	}
	public void removeHandler(){
		EventHandlerManager.removeEventHandler(eventProvider, events, eventRegisteredFunction);
	}
}
