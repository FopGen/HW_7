package org.example;

import org.example.model.ProjectModel;
import org.example.model.WorkerModel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSource {

    public static HashMap<Integer, String> getMapOfClient(){
        HashMap<Integer, String> mapOfClient = new HashMap<>();
            mapOfClient.put(1,"Mr.Max");
            mapOfClient.put(2,"Mr.Ted");
            mapOfClient.put(3,"Mrs.Maria");
            mapOfClient.put(4,"Mr.Ben");
            mapOfClient.put(5,"Mrs.Linda");
        return mapOfClient;
    }

    public static List <WorkerModel> getlistOfWorker(){
        List <WorkerModel> listOfWorker = new ArrayList<>();
        listOfWorker.add(new WorkerModel(1,"First",  new Date(91,0,1), Level.TRAINEE,300));
        listOfWorker.add(new WorkerModel(2,"Second", new Date(92,1,2), Level.JUNIOR,1000));
        listOfWorker.add(new WorkerModel(3,"Third",  new Date(93,2,3), Level.JUNIOR,1500));
        listOfWorker.add(new WorkerModel(4,"Four",   new Date(94,3,4), Level.JUNIOR,1800));
        listOfWorker.add(new WorkerModel(5,"Five",   new Date(95,4,5), Level.MIDDLE,2000));
        listOfWorker.add(new WorkerModel(6,"Six",    new Date(96,5,6), Level.MIDDLE,2500));
        listOfWorker.add(new WorkerModel(7,"Seven",  new Date(97,6,7), Level.SENIOR,4000));
        listOfWorker.add(new WorkerModel(8,"Eight",  new Date(98,7,8), Level.SENIOR,4500));
        listOfWorker.add(new WorkerModel(9,"Nine",   new Date(99,8,9), Level.SENIOR,5000));
        listOfWorker.add(new WorkerModel(10,"Ten",   new Date(99,9,10), Level.SENIOR,5500));

        return listOfWorker;
    }

    public static List<ProjectModel> getListOfProjects(){
        List <ProjectModel> listOfProjects = new ArrayList<>();
        listOfProjects.add(new ProjectModel(101, 1, new Date(100,0,1), new Date(105,11,1)));
        listOfProjects.add(new ProjectModel(102, 2, new Date(101,1,1), new Date(101,2,1)));
        listOfProjects.add(new ProjectModel(103, 3, new Date(102,1,1), new Date(102,3,1)));
        listOfProjects.add(new ProjectModel(104, 4, new Date(104,1,1), new Date(105,12,1)));
        listOfProjects.add(new ProjectModel(105, 5, new Date(105,1,1), new Date(105,3,1)));
        listOfProjects.add(new ProjectModel(106, 1, new Date(102,4,1), new Date(105,6,1)));
        listOfProjects.add(new ProjectModel(107, 2, new Date(106,8,1), new Date(106,12,1)));
        listOfProjects.add(new ProjectModel(108, 3, new Date(108,10,1), new Date(109,10,1)));
        listOfProjects.add(new ProjectModel(109, 4, new Date(105,1,1), new Date(105,10,1)));
        listOfProjects.add(new ProjectModel(110, 5, new Date(100,1,1), new Date(106,3,1)));
        return listOfProjects;
    }

    public static HashMap<Integer, Integer> getMapOfProjectsWorker(){
        HashMap<Integer, Integer>  mapOfProjectsWorker = new HashMap<>();
        mapOfProjectsWorker.put(101,1);
        mapOfProjectsWorker.put(101,2);
        mapOfProjectsWorker.put(101,3);
        mapOfProjectsWorker.put(101,4);
        mapOfProjectsWorker.put(101,5);
        mapOfProjectsWorker.put(102,6);
        mapOfProjectsWorker.put(102,7);
        mapOfProjectsWorker.put(102,8);
        mapOfProjectsWorker.put(103,9);
        mapOfProjectsWorker.put(104,10);
        mapOfProjectsWorker.put(105,10);
        mapOfProjectsWorker.put(106,9);
        mapOfProjectsWorker.put(107,8);
        mapOfProjectsWorker.put(108,7);
        mapOfProjectsWorker.put(109,6);
        mapOfProjectsWorker.put(110,5);
        return mapOfProjectsWorker;
    }
}