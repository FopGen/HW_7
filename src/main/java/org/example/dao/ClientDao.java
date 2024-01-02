package org.example.dao;

import org.example.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ClientDao {
    private static final String INSERT_CLIENT_QUERY = "INSERT INTO client (id, name) VALUES (?,?)";
    private static Connection connection;

    public static void insertClientPreparedStatement(HashMap<Integer, String> mapOfClient){

        try {
            connection = Database.getConnection();
            PreparedStatement queryStatementForClient = connection.prepareStatement(INSERT_CLIENT_QUERY);
            for (Map.Entry<Integer, String> value: mapOfClient.entrySet()){
                queryStatementForClient.setInt(1, value.getKey());
                queryStatementForClient.setString(2, value.getValue());
                queryStatementForClient.addBatch();
            }
            queryStatementForClient.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
