package dao;

import connection.ConnectionPool;

import java.sql.Connection;

/**
 * Created by User on 09.03.2017.
 */
public class DaoFactory {

    private ConnectionPool connectionPool ;
    private Connection connection;

    public DaoFactory(){
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.getConnection();
    }


}
