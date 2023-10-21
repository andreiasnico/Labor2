package org.example.Repository;

/**
 * basic interface for the repository layer
 * @param <T> generic type for every repository
 */
public interface InMemoryRepository<T> {

    boolean save(T object);

    boolean delete(T object);

    boolean find(int id);
}
