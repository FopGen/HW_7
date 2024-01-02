package org.example.dao;

import org.example.Database;
import org.example.model.ProjectModel;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectDao {
    private static final String INSERT_PROJECT_QUERY = "INSERT INTO project (id, client_id, start_date, finish_date) VALUES (?, ?, ?, ?)";
    private static Connection connection;

    public  static  void insertProjectPreparedStatement(List <ProjectModel> listOfProjects){

        try {
            connection = Database.getConnection();
            PreparedStatement queryStatementForProjects = connection.prepareStatement(INSERT_PROJECT_QUERY);
            for (ProjectModel value:listOfProjects){
                queryStatementForProjects.setInt(1, value.getId());
                queryStatementForProjects.setInt(2, value.getClientId());
                queryStatementForProjects.setDate(3,value.getStartDate());
                queryStatementForProjects.setDate(4,value.getFinishDate());
                queryStatementForProjects.addBatch();
            }
            queryStatementForProjects.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}