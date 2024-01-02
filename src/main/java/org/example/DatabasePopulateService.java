package org.example;

import org.example.dao.ClientDao;
import org.example.dao.ProjectDao;
import org.example.dao.ProjectWorkerDao;
import org.example.dao.WorkerDao;
import org.example.model.ProjectModel;
import org.example.model.WorkerModel;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException{

        HashMap<Integer, String> listOfClient = DataSource.getMapOfClient();
        ClientDao.insertClientPreparedStatement(listOfClient);

        List <WorkerModel> listOfWorker = DataSource.getlistOfWorker();
        WorkerDao.insertWorkerPreparedStatement(listOfWorker);

        List <ProjectModel> listOfProjects = DataSource.getListOfProjects();
        ProjectDao.insertProjectPreparedStatement(listOfProjects);

        HashMap<Integer, Integer> mapOfProjectsWorker = DataSource.getMapOfProjectsWorker();
        ProjectWorkerDao.insertProjectWorkerPreparedStatement(mapOfProjectsWorker);

        Database.getConnection().close();
    }
}

