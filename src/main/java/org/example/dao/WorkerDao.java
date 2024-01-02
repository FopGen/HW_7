package org.example.dao;

import org.example.Database;
import org.example.model.WorkerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class WorkerDao {
    private static final String INSERT_WORKER_QUERY = "INSERT INTO worker (id, name, birthday, level, salary) VALUES (?,?, ?, ?::competence,?)";
    private static Connection connection;

    public  static  void insertWorkerPreparedStatement(List<WorkerModel> listOfWorker){

        try {
            connection = Database.getConnection();
            PreparedStatement queryStatementForWorker = connection.prepareStatement(INSERT_WORKER_QUERY);
            for (WorkerModel value:listOfWorker){
                queryStatementForWorker.setInt(1, value.getId());
                queryStatementForWorker.setString(2, value.getName());
                queryStatementForWorker.setDate(3,value.getBirthday());
                queryStatementForWorker.setString(4, value.getLevel().title);
                queryStatementForWorker.setInt(5, value.getSalary());
                queryStatementForWorker.addBatch();
            }
            queryStatementForWorker.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
