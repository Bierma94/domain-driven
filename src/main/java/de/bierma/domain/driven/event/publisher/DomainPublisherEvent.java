package de.bierma.domain.driven.event.publisher;


import de.bierma.domain.driven.event.DomainEvent;

/**
 * Marker interface for domain events that are published by a domain event publisher.
 * @param <T> The type of the domain event.
 */
public interface DomainPublisherEvent <T extends DomainEvent> {
}
