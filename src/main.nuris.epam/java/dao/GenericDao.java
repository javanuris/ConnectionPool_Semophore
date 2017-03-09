package dao;

import java.util.List;

/**
 * Created by User on 09.03.2017.
 */
public interface GenericDao<T extends Identified<PK> , PK> {
    T create();
    T persist(T object);
    T getByPK(PK key);
    void update(T object);
    void delete(T object);
    List<T> getAll();

}
