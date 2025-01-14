package de.bierma.domain.driven.valueObject;

import java.util.Objects;

/**
 * Base class for all value objects with an identifier.
 * @param <T> The type of the identifier.
 */
public abstract class BaseId<T>{
    private final T id;

    protected BaseId(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(id, baseId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
