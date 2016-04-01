package org.nazymko.dao;

import java.util.Optional;

/**
 * Created by nazymko.patronus@gmail.com.
 */
public interface Dao<K,T> {
    K save(T object);

    Optional<T> find(K key);

}
