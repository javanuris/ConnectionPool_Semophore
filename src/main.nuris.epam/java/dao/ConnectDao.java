package dao;

import java.sql.Connection;

/**
 * Created by User on 09.03.2017.
 */
public abstract class ConnectDao {
    private Connection connection;

    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
