package org.example.dao;

import org.example.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ProjectWorkerDao {

    private static final String INSERT_PROJECT_WORKER_QUERY  = "INSERT INTO project_worker (project_id, worker_id) VALUES (?, ?)";
    private static Connection connection;

    public  static  void insertProjectWorkerPreparedStatement(Map<Integer, Integer> mapOfProjectsWorker){

        try {
            connection = Database.getConnection();
            PreparedStatement queryStatementForProjectsWorker = connection.prepareStatement(INSERT_PROJECT_WORKER_QUERY);
            for (Map.Entry<Integer, Integer>  value:mapOfProjectsWorker.entrySet()){
                queryStatementForProjectsWorker.setInt(1, value.getKey());
                queryStatementForProjectsWorker.setInt(2, value.getValue());
                queryStatementForProjectsWorker.addBatch();
            }
            queryStatementForProjectsWorker.executeBatch();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
