package de.bierma.domain.driven.entity;

import java.util.Objects;

/**
 * Base class for all entities.
 * @param <ID> The type of the identifier.
 */
public abstract class BaseEntity <ID>{
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
