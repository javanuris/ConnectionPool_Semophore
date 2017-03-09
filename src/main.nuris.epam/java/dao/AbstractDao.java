package dao;

import java.sql.Connection;
import java.util.List;

/**
 * Created by User on 09.03.2017.
 */
public abstract class AbstractDao<T extends Identified<PK>,PK extends Integer> implements GenericDao<T , PK> {
    Connection connection = null;
    public AbstractDao(Connection connection){
        this.connection = connection;
    }
    public T create() {
        return null;
    }

    public T persist(T object) {
        return null;
    }

    public T getByPK(PK key) {
        return null;
    }

    public void update(T object) {

    }

    public void delete(T object) {

    }

    public List<T> getAll() {
        return null;
    }
}
