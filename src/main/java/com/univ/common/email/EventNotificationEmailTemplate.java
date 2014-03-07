package com.univ.common.email;

import com.univ.model.Event;

/**
 * Created by kimsanghwan on 3/6/2014.
 */
public class EventNotificationEmailTemplate extends EmailTemplate {
    private static final String SUBJECT = "Event notification from UW Act";

    private Event event;

    EventNotificationEmailTemplate(int toId, String toEmail, Event event) {
        super(2, toId, toEmail, SUBJECT);
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
